/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Ataque;
import Model.Json;
import Model.ObjetoInformacion;
import Model.Personaje;
import Model.SuperFactory;
import View.VentanaAtaquexPersonaje;
import View.VentanaCarta;
import View.VentanaCrearPersonaje;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;


public class ControladorVentanaCrearPersonaje implements ActionListener {
    public VentanaCrearPersonaje vista;
    public static ArrayList<String> ataques;
    public static ArrayList<Ataque> ataqueTemp;
    public String imagen;
    public String fileName;
    public SuperFactory modelo;
    public Personaje personaje;
    
    
    public ControladorVentanaCrearPersonaje(VentanaCrearPersonaje pVista, SuperFactory pModelo){
        this.vista = pVista;
        this.modelo = pModelo;
        this.ataques = new ArrayList<>();
        this.ataqueTemp = new ArrayList<>();
        this.imagen = "";
        this.fileName = "Warriors";
        this.vista.btnSave.addActionListener(this);
        this.vista.btnImagen.addActionListener(this);
        this.vista.btnAtaque.addActionListener(this);
        this.vista.btnVistaPrevia.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
           
               
            case "Agregar ataque": 
                addAtaque();   
                break;
            case "Agregar imagen" :
        {
            try {
                addImagen();
            } catch (IOException ex) {
                Logger.getLogger(ControladorVentanaCrearPersonaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "Vista Previa":
                vistaPrevia();
                break;
            case "Guardar":
                guardar();
                break;
            default:
                break;
        }
    }
    
    public void guardar(){
        if(validar()){
        int cantidad = Integer.parseInt(this.vista.textCantidad.getText());
        String nombre = this.vista.textNombre.getText();
        Double campoAccion = Double.parseDouble(this.vista.textCampoAccion.getText());
        Double costo = Double.parseDouble(this.vista.textCosto.getText());
        Double golpes = Double.parseDouble(this.vista.textGolpes.getText());
        Double nivel = Double.parseDouble(this.vista.textNivel.getText());
        Double nivelAparicion = Double.parseDouble(this.vista.textNivelAparicion.getText());
        Double vida = Double.parseDouble(this.vista.textVida.getText());
       
        for(int i = 0; i < cantidad; i++){
            if (i==0){
                try{
                    createPersonajeSuperFactory(true,nombre,imagen,vida,golpes,nivel,campoAccion,nivelAparicion,costo);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                
            }
            else{
                try{
                    createPersonajeSuperFactory(false,nombre,imagen,vida,golpes,nivel,campoAccion,nivelAparicion,costo);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        ataques.clear();
        ataqueTemp.clear();
        JOptionPane.showMessageDialog(vista, "Personaje creado!");
        }
    }
    public void addImagen() throws IOException{
        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            File file  = new File(fileToSave.getAbsolutePath());
            BufferedImage bi = ImageIO.read(file);
            ImageIO.write(bi, "png", new File("src\\main\\resources\\"+fileToSave.getName()));
            String path = "src\\main\\resources\\"+fileToSave.getName();
            this.imagen = path;  
        }
    }
    public void addAtaque(){
        VentanaAtaquexPersonaje v =  new VentanaAtaquexPersonaje();
        SuperFactory sp= new SuperFactory();
        ControladorVentanaAtaquexPersonaje vap =new ControladorVentanaAtaquexPersonaje(v,"Ataques",sp);
        vap.vista.setVisible(true);
    }
    public void vistaPrevia(){
        if(validar()){
        String nombre = this.vista.textNombre.getText();
        Double campoAccion = Double.parseDouble(this.vista.textCampoAccion.getText());
        Double costo = Double.parseDouble(this.vista.textCosto.getText());
        Double golpes = Double.parseDouble(this.vista.textGolpes.getText());
        Double nivel = Double.parseDouble(this.vista.textNivel.getText());
        Double nivelAparicion = Double.parseDouble(this.vista.textNivelAparicion.getText());
        Double vida = Double.parseDouble(this.vista.textVida.getText());
        Personaje p = new Personaje(nombre,imagen,vida,golpes,nivel,campoAccion,nivelAparicion,costo,0.0,0.0,ataqueTemp,"tipo");
        VentanaCarta v =  new VentanaCarta();
        ControladorVentanaCarta vc = new ControladorVentanaCarta(v, p);
        vc.vista.setVisible(true);}
        
    }
    public boolean validar(){
        if(this.vista.textCampoAccion.getText().isEmpty()||this.vista.textCantidad.getText().isEmpty()||this.vista.textCosto.getText().isEmpty()||this.vista.textGolpes.getText().isEmpty()||this.vista.textNivel.getText().isEmpty()||this.vista.textNivelAparicion.getText().isEmpty()||this.vista.textNombre.getText().isEmpty()||this.vista.textVida.getText().isEmpty()){
            JOptionPane.showMessageDialog(vista, "Todos los campos deben contener información");
            return false;
        }
        else{
            return true;
        }
    }
    
    
    
    public void createPersonajeSuperFactory(Boolean nueva,String nom,String img, Double life, Double golpexTiempo, Double level, Double campo, Double nivelAparic, Double cost) throws IOException, Exception{
        personaje= modelo.createPersonaje(true, nom,img,life,golpexTiempo,level,campo,nivelAparic,cost,0.0,0.0,ControladorVentanaCrearPersonaje.ataqueTemp,"tipo");
        ObjetoInformacion objeto = new ObjetoInformacion(null,null,personaje,fileName);
        modelo.guardarInformacion(objeto);
        Json json = new Json();
        ArrayList<Personaje> p =json.cargarJson(fileName);
        System.out.println(p.toString());
//json(nom,img,life,golpexTiempo,level,campo,nivelAparic,cost,ControladorVentanaCrearPersonaje.ataques);      //aqui va con string para el json
        
         //aqui va e objeto
        
        
    }
 /*   public void json(String nom,String img, int life, int golpexTiempo, int level, int campo, int nivelAparic, int cost, ArrayList<String> ataque) throws FileNotFoundException, IOException{
        if(validaExisteFile() == true){
            addJSON(nom, img, life, golpexTiempo, level, campo,nivelAparic,cost,ataque);
        }else{
            createJSON();
            addJSON(nom, img, life, golpexTiempo, level, campo,nivelAparic,cost,ataque);
        }
    }
    
    public void createJSON() throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<JSONObject> dtos = new ArrayList<>();
        FileWriter fw  = new FileWriter(fileName);
        gson.toJson(dtos, fw); 
        fw.close();
    }
    
     public void addJSON(String nom,String img, int life, int golpexTiempo, int level, int campo, int nivelAparic, int cost, ArrayList<String> ataque) throws FileNotFoundException, IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JSONObject ataquesJson = new JSONObject();
        ataquesJson.put("nombre", nom);
        ataquesJson.put("imagen", img);
        ataquesJson.put("vida", life);
        ataquesJson.put("golpexTiempo", golpexTiempo);
        ataquesJson.put("nivel", level);
        ataquesJson.put("campoAccion", campo);
        ataquesJson.put("nivelAparicion", nivelAparic);
        ataquesJson.put("costo", cost);
        ataquesJson.put("ataques", ataque);
        // construct Type that tells Gson about the generic type
        Type arrayListType = new TypeToken<ArrayList<JSONObject>>(){}.getType();
        FileReader fr = new FileReader(fileName);
        ArrayList<JSONObject> dtos = gson.fromJson(fr, arrayListType);
        fr.close();
        if(null==dtos) {
            dtos = new ArrayList<>();
        }
        dtos.add(ataquesJson);

        FileWriter fw  = new FileWriter(fileName);
        gson.toJson(dtos, fw);
        fw.close();
     } 
    
     public Boolean validaExisteFile() throws FileNotFoundException{
         try{
            FileReader fr = new FileReader(fileName);
            return true;
         }
         catch(FileNotFoundException e){
             return false;
         }
     }*/
    
 
    
}
