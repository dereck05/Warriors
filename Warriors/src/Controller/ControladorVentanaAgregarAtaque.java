/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Ataque;
import Model.ObjetoInformacion;
import Model.SuperFactory;
import View.VentanaAgregarAtaque;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
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
import org.json.simple.*;




public class ControladorVentanaAgregarAtaque implements ActionListener{
    public VentanaAgregarAtaque vista;
    public static String fileName = "Ataques";
    public String imagen;
    SuperFactory superFactory = new SuperFactory();
    Ataque ataque;
    
    public ControladorVentanaAgregarAtaque(VentanaAgregarAtaque pVista,SuperFactory sf){
        this.vista= pVista;
        this.vista.jButtonCrear.addActionListener(this);
        this.vista.jButtonImagen.addActionListener(this);
        this.superFactory = sf;
        this.imagen="";
                 
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(e.getSource()==this.vista.jButtonImagen){
            System.out.println("agregar imagen");
            try {
                agregarImagen();
            } catch (IOException ex) {
                Logger.getLogger(ControladorVentanaAgregarAtaque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(e.getSource()==this.vista.jButtonCrear){
            System.out.println("crear");
            crear();
        }
        else{
            JOptionPane.showMessageDialog(vista, "0currió un error con la ventana");
        }

 
    }
    public void createAtaqueSuperFactory(String poder, String nombre, Double alcance, Double nivel, Double rangoExplosion, Double impacto, String imagen) throws IOException, Exception{
        
        if(poder == "Poder"){
            ataque=superFactory.crearAtaque(true, nombre, alcance, nivel, rangoExplosion, impacto, imagen,"activo");
        } else{
            ataque=superFactory.crearAtaque(false, nombre, alcance, nivel, rangoExplosion, impacto, imagen,"activo");
        } 
        ObjetoInformacion objeto= new ObjetoInformacion(poder,ataque,null,fileName);
        superFactory.guardarInformacion(objeto);
        //json(poder,nombre,alcance,nivel,rangoExplosion,impacto,imagen);
    }
    
 /*   public void json(String poder, String nombre, Double alcance, Double nivel, Double rangoExplosion, Double impacto, String imagen) throws FileNotFoundException, IOException{
        if(validaExisteFile() == true){
            addJSON(poder,nombre,alcance,nivel,rangoExplosion,impacto,imagen);
        }else{
            createJSON();
            addJSON(poder,nombre,alcance,nivel,rangoExplosion,impacto,imagen);
        }
    }
    
    public void createJSON() throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<JSONObject> dtos = new ArrayList<JSONObject>();
        FileWriter fw  = new FileWriter(fileName);
        gson.toJson(dtos, fw); 
        fw.close();
    }
    
    public void addJSON(String poder, String nombre, Double alcance, Double nivel, Double rangoExplosion, Double impacto, String imagen) throws FileNotFoundException, IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JSONObject ataquesJson = new JSONObject();
        ataquesJson.put("ataque", poder);
        ataquesJson.put("nombre", nombre);
        ataquesJson.put("alcance", alcance);
        ataquesJson.put("nivel", nivel);
        ataquesJson.put("rangoExplosion", rangoExplosion);
        ataquesJson.put("impacto", impacto);
        ataquesJson.put("imagen", imagen);
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
    public void agregarImagen() throws IOException{
        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            //System.out.println(fileToSave.getAbsolutePath());
            File file  = new File(fileToSave.getAbsolutePath());
            BufferedImage bi = ImageIO.read(file);
            ImageIO.write(bi, "png", new File("src\\main\\resources\\"+fileToSave.getName()));
            String path = "src\\main\\resources\\"+fileToSave.getName();

            this.imagen = path;
            
            
            
        }
    }
    public void crear(){
        if(validar()){
        try {
            createAtaqueSuperFactory(vista.jComboAtaque.getSelectedItem().toString(), vista.jTextNombre.getText(),
            Double.parseDouble(vista.jTextAlcance.getText()), Double.parseDouble(vista.jTextNivel.getText()),
            Double.parseDouble(vista.jTextRangExplo.getText()), Double.parseDouble(vista.jTextImpacto.getText()), imagen);
            JOptionPane.showMessageDialog(null, "Se ha creado un nuevo ataque.");  
        } catch (IOException ex) {
            Logger.getLogger(VentanaAgregarAtaque.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(VentanaAgregarAtaque.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }
    public boolean validar(){
        System.out.println("Hola"+vista.jTextAlcance.getText());
        if(vista.jTextAlcance.getText().isEmpty()||vista.jTextImpacto.getText().isEmpty()||vista.jTextNivel.getText().isEmpty()||vista.jTextNombre.getText().isEmpty()||vista.jTextRangExplo.getText().isEmpty()){
            JOptionPane.showMessageDialog(vista, "Todos los campos deben contener información");
            return false;
        }
        else{
            return true;
        }
    }
    
    

    
}
