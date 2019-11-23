/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maryp
 * Implementacion del Super Factory
 * Crea Personaje, Ataque
 * Agrega Caracteristicas, Imagenes y Ataques
 */
public class SuperFactory implements ISuperFactory {


    @Override
    public Ataque crearAtaque(Boolean poder, String nombre, Double alcance, Double nivel, Double rangoExplosion, Double impacto, String image,String estado) {
            IAtaqueFactoryMethod ataque = new AtaqueFactory();
            if(poder){
                Ataque ataquePoder = ataque.crearPoder(nombre, alcance, nivel, rangoExplosion, impacto, image,estado);
                return ataquePoder;
            }
            else{
                Ataque ataqueArma= ataque.crearArma(nombre, alcance, nivel, rangoExplosion, impacto, image,estado);
                return ataqueArma;
            }
    }

    @Override
    public Personaje createPersonaje(Boolean nueva,String nom,String img, Double life, Double golpexTiempo, Double level, Double campo, Double nivelAparic, Double cost, Double x, Double y,ArrayList<Ataque> ataqu,String tipo) {
            if (!PrototypeFactory.exists(nom)){
                PersonajeBuilder per = agregarCaracteristicas(nom,life, golpexTiempo, level, campo, nivelAparic, cost,x,y,tipo);
                per= agregarImagenes(per,img);
                per= agregarAtaques(per,ataqu);
                Personaje personaje=per.build();
                PrototypeFactory.addPrototype(nom, personaje);
                return personaje;
            }
            else{
                if (nueva){
                    Personaje personaje = (Personaje)PrototypeFactory.getPrototype(nom);
                    PersonajeBuilder per = agregarCaracteristicas(life, golpexTiempo, level, campo, nivelAparic, cost,x,y,tipo);
                    per= agregarImagenes(per,img);
                    per=agregarAtaques(per, ataqu);
                    return per.build(personaje);
                    
                }
                else{
                     Personaje personaje = (Personaje)PrototypeFactory.getPrototype(nom);
                     return personaje;
                }
                
            }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonajeBuilder agregarCaracteristicas(String nombre,Double life, Double golpexTiempo, Double level, Double campo, Double nivelAparic, Double cost,Double x, Double y,String tipo) {
            PersonajeBuilder personaje = new PersonajeBuilder().setNombre(nombre).setCampoAccion(campo).setCosto(cost).setGolpesxTiempo(golpexTiempo).setNivel(level).setNivelApacicion(nivelAparic).setX(x).setY(y).setTipo(tipo).setVida(life);
            return personaje;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonajeBuilder agregarImagenes(PersonajeBuilder per,String imagen) {
            per.addImages(imagen);
        return per;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonajeBuilder agregarAtaques(PersonajeBuilder ar, ArrayList<Ataque> arma) {
        if (!arma.isEmpty()){
           for(Ataque ataque: arma){
              ar.addAtaques(ataque);
        }
        
        }
        return ar;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonajeBuilder agregarCaracteristicas(Double life, Double golpexTiempo, Double level, Double campo, Double nivelAparic, Double cost,Double x, Double y,String tipo) {
            PersonajeBuilder personaje = new PersonajeBuilder().setCampoAccion(campo).setCosto(cost).setGolpesxTiempo(golpexTiempo).setNivel(level).setNivelApacicion(nivelAparic).setX(x).setY(y).setTipo(tipo).setVida(life);
            return personaje;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarInformacion(ObjetoInformacion objeto) {
        IArchivo archivo = new Json();
        try {
            archivo.crearArchivo(objeto);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(SuperFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

           
}
