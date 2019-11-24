/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * Clase Personaje
 */  
public class Personaje implements IPersonaje, IPrototype<Personaje>{
    
    
    private String nombre;
    private String image;        
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
    
    /**
     *
     * @param nom nombre del personaje
     * @param img imagenes del personaje
     * @param life cantidad de vida
     * @param golpexTiempo cantidad de golpes posibles por unidad de tiempo
     * @param level nivel del personaje
     * @param campo espacio que abarca el personaje (numero de cuadros)
     * @param nivelAparic nivel de aparicion
     * @param cost costo
     * @param ataqu lista de ataques del personaje
     */
    public Personaje(String nom, String img,Double life,Double golpexTiempo,Double level, Double campo,Double nivelAparic,Double cost,Double x, Double y, ArrayList<Ataque> ataqu,String tipo){
        this.nombre = nom;
        this.image = img;
        this.vida = life;
        this.golpesxTiempo =golpexTiempo;
        this.nivel = level;
        this.campoAccion = campo;
        this.nivelAparicion = nivelAparic;
        this.costo = cost;
        this.ataques = ataqu;
        this.x=x;
        this.y=y;
        this.tipo=tipo;
    }
    public Personaje(String nom,String img){
        this.nombre = nom;
        this.image = img;
    }
    public Personaje(){}
    
    public Double getX(){    
        return x;
    }

    //----------------------------GETS----------------------------------
    public Double getY() {
        return y;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getImage() {
        return image;
    }

    public Double getVida() {
        return vida;
    }

    public Double getGolpesxTiempo() {
        return golpesxTiempo;
    }

    public Double getNivel() {
        return nivel;
    }

    public Double getCampoAccion() {
        return campoAccion;
    }

    public Double getNivelAparicion() {
        return nivelAparicion;
    }

    public Double getCosto() {
        return costo;
    }

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    //------------------------------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public void setGolpesxTiempo(Double golpesxTiempo) {
        this.golpesxTiempo = golpesxTiempo;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }

    public void setCampoAccion(Double campoAccion) {
        this.campoAccion = campoAccion;
    }

    public void setNivelAparicion(Double nivelAparicion) {
        this.nivelAparicion = nivelAparicion;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setAtaques(ArrayList<Ataque> ataques) {
        this.ataques = ataques;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    @Override
    public void attack(){
    }
    
    @Override
    public void cure(){
        
    }

    @Override
    public Personaje clone() {
         Personaje clone = new Personaje(this.nombre,this.image,this.vida,this.golpesxTiempo,this.nivel,this.campoAccion,this.nivelAparicion,this.costo,this.x,this.y ,this.ataques,this.tipo);
         return clone;
    }

    @Override
    public Personaje deepClone() {
        ArrayList<Ataque> cloneAtaques = new ArrayList<>();
        for (Ataque ataque: this.ataques){
            Ataque cloneItem = ataque.deepClone();
            cloneAtaques.add(cloneItem);
        }
        Personaje clonePersonajes = new Personaje(this.nombre,this.image,this.vida,this.golpesxTiempo,this.nivel,this.campoAccion,this.nivelAparicion,this.costo,this.x,this.y, cloneAtaques,this.tipo);
        return clonePersonajes;
    }

    
    
}
