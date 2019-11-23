/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author maryp
 * Builder de Personaje
 */
public class PersonajeBuilder implements IBuilder<Personaje> {
        private String nombre;
        private String images;        
        private Double vida;
        private Double golpesxTiempo;
        private Double nivel;
        private Double campoAccion;
        private Double nivelAparicion;
        private Double costo;
        private Double x;
        private Double y;
        private String tipo;
        private ArrayList<Ataque> ataques;
        
        public PersonajeBuilder(){
            ataques = new ArrayList<>();
        }
        
        public PersonajeBuilder setNombre(String nombre){
            this.nombre = nombre;
            
            return this;
        }
        
        //Va agregando imagenes
        public PersonajeBuilder addImages(String image){
            this.images=(image);
            return this;
        }
        
        public PersonajeBuilder setVida(Double vida){
            this.vida = vida;
            return this;
        }
        
        public PersonajeBuilder setGolpesxTiempo(Double golpesxTiempo){
            this.golpesxTiempo = golpesxTiempo;
            return this;
        }
        
        public PersonajeBuilder setNivel(Double nivel){
            this.nivel = nivel;
            return this;
        }
        
        public PersonajeBuilder setCampoAccion(Double campoAccion){
            this.campoAccion = campoAccion;
            return this;
        }
        
        public PersonajeBuilder setNivelApacicion(Double nivelAparicion){
            this.nivelAparicion = nivelAparicion;
            return this;
        }
        
        public PersonajeBuilder setCosto(Double costo){
            this.costo = costo;
            return this;
        }
        
        //Va agregando ataques
        public PersonajeBuilder addAtaques(Ataque a){
            ataques.add(a);
            return this;
        }
        public PersonajeBuilder setX(Double x){
            this.x=x;
            return this;
        }
        public PersonajeBuilder setY(Double y){
            this.y=y;
            return this;
        }
        public PersonajeBuilder setTipo(String tipo){
            this.tipo=tipo;
            return this;
        }
        @Override
        public Personaje build() {
            return new Personaje(nombre,images,vida,golpesxTiempo,nivel,campoAccion,nivelAparicion,costo,x,y,ataques,tipo);
        }

        @Override
        public Personaje build(Personaje t) {
            return new Personaje(t.getNombre(),images,vida,golpesxTiempo,nivel,campoAccion,nivelAparicion,costo,x,y,ataques,tipo);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    

