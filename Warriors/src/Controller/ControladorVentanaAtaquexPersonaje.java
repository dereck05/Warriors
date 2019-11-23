/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ataque;
import Model.SuperFactory;
import View.VentanaAtaquexPersonaje;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

/**
 *
 * @author maryp 
 */ 
public class ControladorVentanaAtaquexPersonaje implements ActionListener {
        public VentanaAtaquexPersonaje vista;
        public ArrayList<Ataque> ataquesSeleccionados;
        public ArrayList<Ataque> ataques;
        private String nombreArchivo;
        private SuperFactory sp;
       
     
        
        public ControladorVentanaAtaquexPersonaje(VentanaAtaquexPersonaje pVista,String pNombreArchivo, SuperFactory Psp){
              vista= pVista;
              this.vista.jButtonAgregar.addActionListener(this);
              this.vista.jButtonTerminar.addActionListener(this);
              this.ataques= new ArrayList<>();
              this.ataquesSeleccionados= new ArrayList<>();
              this.nombreArchivo= pNombreArchivo;
              this.sp= Psp;
              cargarJson();
              anadirAtaques();
              
        }
        public void cargarJson() {
            try(Reader reader = new FileReader(this.nombreArchivo)){
                Gson gson = new Gson(); 
                Type dtoListType = new TypeToken<ArrayList<JSONObject>>(){}.getType();
                ArrayList<JSONObject> dtos = gson.fromJson(reader, dtoListType);
                reader.close();
                
                for(JSONObject jsonObject: dtos){
                    String ataque = (String) jsonObject.get("ataque");
                    String nombre = (String) jsonObject.get("nombre");
                    Double alcance = (Double) jsonObject.get("alcance");
                    Double nivel = (Double) jsonObject.get("nivel");
                    Double rangoExplosion= (Double) jsonObject.get("rangoExplosion");
                    Double impacto = (Double) jsonObject.get("impacto");
                    String imagen = (String) jsonObject.get("imagen");
                    String estado = (String) jsonObject.get("estado");
                    if (ataque=="Poder"){
                        Ataque at= sp.crearAtaque(true, nombre, alcance, nivel, rangoExplosion, impacto, imagen,estado);
                        ataques.add(at);
                    }
                    else{
                        Ataque at= sp.crearAtaque(false, nombre, alcance, nivel, rangoExplosion, impacto, imagen,estado);
                        ataques.add(at);
                    }
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(vista, "Error al cargar las armas");
                System.err.println("JsonSyntaxException: " + e.getMessage());
            }
        
        }
        public void anadirAtaques(){
            DefaultListModel model = new DefaultListModel<>();
            if (ataques!=null){
                for (Ataque item: ataques){
                    String texto = "Nombre: "+item.getNombre()+", Nivel: "+item.getNivel();
                    System.out.println(texto);
                    model.addElement(texto);
               }
                this.vista.jListAtaques.setModel(model);
            }
        }
        

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Agregar":
                agregarAtaque();
                break;
            case "Terminar":
                terminar();
                break;
            default:
                break;
        }
        
    }
    public void agregarAtaque(){
        if (vista.jListAtaques.isSelectionEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un ataque");
        } 
        else{    
            Ataque b= ataques.get(vista.jListAtaques.getSelectedIndex());
            this.ataquesSeleccionados.add(b);
            ControladorVentanaCrearPersonaje.ataques.add(b.getNombre()+" "+b.getNivel());
            ControladorVentanaCrearPersonaje.ataqueTemp.add(b);
            JOptionPane.showMessageDialog(vista, "Ataque agregado!");
        }
    }
    public void terminar(){
        this.vista.setVisible(false);
    }
}
