/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author maryp
 * Interface para la creacion de ataques
 */
public interface IAtaqueFactoryMethod {
    public Arma crearArma(String nombre, Double alcance, Double nivel, Double rangoExplosion, Double impacto, String image,String estado);
    public Poder crearPoder(String nombre, Double alcance, Double nivel, Double rangoExplosion, Double impacto, String image,String estado);
}
