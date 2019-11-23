/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * Clase Ataque
 * Sea Arma o Poder, se utiliza para interactuar con los otros personajes
 */
public class Ataque implements IPrototype<Ataque> {
    
    private String nombre;
    private Double alcance;
    private Double nivel;
    private Double rangoExplosion;
    private Double impacto;
    private String estado;
    private String image;   //esto no esta en el diagrama
    
    /**
     *
     * @param name nombre del ataque
     * @param alcanceAtaque distancia en numero de cuadros que alcanza el ataque
     * @param level nivel del ataque
     * @param rangoExplotion rango en numero de cuadros que abarca la explosion del ataque
     * @param impact fuerza del impacto del ataque
     * @param img imagen que simboliza el ataque en cuestion
     */
    public Ataque(String name,Double alcanceAtaque,Double level,Double rangoExplotion,Double impact,String img,String estado){
        this.nombre = name;
        this.alcance = alcanceAtaque;
        this.nivel = level;
        this.rangoExplosion = rangoExplotion;
        this.impacto = impact;
        this.image = img;
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlcance(Double alcance) {
        this.alcance = alcance;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }

    public void setRangoExplosion(Double rangoExplosion) {
        this.rangoExplosion = rangoExplosion;
    }

    public void setImpacto(Double impacto) {
        this.impacto = impacto;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public Double getNivel() {
        return nivel;
    }

    public String getImage() {
        return image;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public Double getAlcance(){
        return this.alcance;
    }
    public Double getRangoExplosion(){
        return this.rangoExplosion;
                
    }
    public Double getImpacto(){
        return this.impacto;
    }

    @Override
    public Ataque clone() {
        return new Ataque(this.nombre,this.alcance,this.nivel,this.rangoExplosion,this.impacto,this.image,this.estado);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ataque deepClone() {
        return clone();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
