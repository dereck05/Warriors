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
 * Interface para Factory de todos los componentes del paquete
 * Componentes pueden ser: Personaje, Ataque, Caracteristicas, Imagenes o Ataques
 * Caracteristicas, Imagenes y Ataques se van agregando con el Builder
 */
public interface ISuperFactory {
    
    public Personaje createPersonaje(Boolean nueva,String nom,String img,Double life,Double golpexTiempo,Double level, Double campo,Double nivelAparic,Double cost, Double x ,Double y,ArrayList<Ataque> ataqu,String tipo);
    public  Ataque crearAtaque(Boolean poder,String nombre, Double alcance, Double nivel, Double rangoExplosion, Double impacto, String image,String estado);
    public PersonajeBuilder agregarCaracteristicas(String nombre,Double life, Double golpexTiempo, Double level, Double campo, Double nivelAparic, Double cost,Double x, Double y,String tipo);
    public PersonajeBuilder agregarCaracteristicas(Double life, Double golpexTiempo, Double level, Double campo, Double nivelAparic, Double cost, Double x, Double y,String tipo);
    public PersonajeBuilder agregarImagenes(PersonajeBuilder per,String imagen);
    public PersonajeBuilder agregarAtaques(PersonajeBuilder ar, ArrayList<Ataque> arma);
    public void guardarInformacion (ObjetoInformacion objeto);
}
