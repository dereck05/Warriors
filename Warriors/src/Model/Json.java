/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import View.VentanaAgregarAtaque;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author maryp
 */
public class Json implements IArchivo{
    
    @Override
    public void crearArchivo(ObjetoInformacion objeto) throws IOException {
        if(validaExisteFile(objeto.filename) == true){
            if(objeto.ataque!=null){
                addJSON(objeto.n,objeto.ataque,objeto.filename);
            }
            else{
                addJSON(objeto.personaje,objeto.filename);
            }
        }else{
            createJSON(objeto.filename);
            if(objeto.ataque!=null){
                addJSON(objeto.n,objeto.ataque,objeto.filename);
            }
            else{
                addJSON(objeto.personaje,objeto.filename);
            }
        }
    }


    public void addJSON(Personaje per, String fileName) throws FileNotFoundException, IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JSONObject ataquesJson = new JSONObject();
        ataquesJson.put("nombre", per.getNombre());
        ataquesJson.put("imagen", per.getImage());
        ataquesJson.put("vida", per.getVida());
        ataquesJson.put("golpexTiempo", per.getGolpesxTiempo());
        ataquesJson.put("nivel", per.getNivel());
        ataquesJson.put("campoAccion", per.getCampoAccion());
        ataquesJson.put("nivelAparicion", per.getNivelAparicion());
        ataquesJson.put("costo", per.getCosto());
        ataquesJson.put("x", per.getX());
        ataquesJson.put("y", per.getY());
        ataquesJson.put("tipo", per.getTipo());
        ataquesJson.put("ataques", per.getAtaques());
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
        public void addJSON(String at,Ataque ataque, String fileName) throws FileNotFoundException, IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JSONObject ataquesJson = new JSONObject();
        ataquesJson.put("ataque", at);
        ataquesJson.put("nombre", ataque.getNombre());
        ataquesJson.put("alcance", ataque.getAlcance());
        ataquesJson.put("nivel", ataque.getNivel());
        ataquesJson.put("rangoExplosion", ataque.getRangoExplosion());
        ataquesJson.put("impacto", ataque.getImpacto());
        ataquesJson.put("imagen", ataque.getImage());
        ataquesJson.put("estado",ataque.getEstado());
        
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
    public void createJSON(String fileName) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<JSONObject> dtos = new ArrayList<>();
        FileWriter fw  = new FileWriter(fileName);
        gson.toJson(dtos, fw); 
        fw.close();
    }
    public Boolean validaExisteFile(String fileName) throws FileNotFoundException{
         try{
            FileReader fr = new FileReader(fileName);
            return true;
         }
         catch(FileNotFoundException e){
             return false;
         }
     }
     public ArrayList<Personaje> cargarJson(String nombreArchivo) {
         SuperFactory sp = new SuperFactory();
         ArrayList<Personaje> personajes = new ArrayList<Personaje>();
            try(Reader reader = new FileReader(nombreArchivo)){
                Gson gson = new Gson(); 
                Type dtoListType = new TypeToken<ArrayList<JSONObject>>(){}.getType();
                ArrayList<JSONObject> dtos = gson.fromJson(reader, dtoListType);
                reader.close();
                
                for(JSONObject jsonObject: dtos){
                    String nombre = (String) jsonObject.get("nombre");
                    String imagen = (String) jsonObject.get("imagen");
                    Double vida = (Double) jsonObject.get("vida");
                    Double golpexTiempo = (Double) jsonObject.get("golpexTiempo");
                    Double campoAccion= (Double) jsonObject.get("campoAccion");
                    Double nivelAparicion = (Double) jsonObject.get("nivelAparicion");
                    Double costo = (Double) jsonObject.get("costo");
                    Double x = (Double) jsonObject.get("x");
                    Double y = (Double) jsonObject.get("y");
                    String tipo = (String) jsonObject.get("tipo");
                    ArrayList ataquesJson = (ArrayList)jsonObject.get("ataques");
                    ArrayList<Ataque> ataques = new ArrayList<Ataque>();
                    for(Object a: ataquesJson){
                       LinkedTreeMap<Object,Object> t = (LinkedTreeMap) a;
                       String at = (String) t.get("ataque");
                       String nomAt = (String) t.get("nombre");
                       Double alcance =(Double) t.get("alcance");
                       Double nivelAt = (Double) t.get("nivel");
                       Double rangoExplosion = (Double) t.get("rangoExplosion");
                       Double impacto = (Double) t.get("impacto");
                       String imagenAt = (String) t.get("imagen");
                       String estado = (String) t.get("estado");
                       
                       Ataque ata;
                       if (at=="Poder"){
                           ata=sp.crearAtaque(true, nombre, alcance, nivelAt, rangoExplosion, impacto, imagen,estado);
                       }
                       else{
                           ata=sp.crearAtaque(false, nombre, alcance, nivelAt, rangoExplosion, impacto, imagen,estado);
                       }
                       
                        ataques.add(ata);
                    } 
                    Personaje p = sp.createPersonaje(Boolean.TRUE, nombre, imagen, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,x,y, ataquesJson,tipo);
                    personajes.add(p);
                }

            }catch(Exception e){
                
                Logger.getLogger(Json.class.getName()).log(Level.SEVERE, null, e);
            }
            return personajes;
        
        }
    
}
