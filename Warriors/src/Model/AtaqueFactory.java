/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author maryp
 * Retorna una instancia de Arma, sea Arma o Poder
 */
public class AtaqueFactory implements IAtaqueFactoryMethod{

    @Override
    public Arma crearArma(String nombre, Double alcance, Double nivel, Double rangoExplosion, Double impacto, String image,String estado) {
        return new Arma(nombre,alcance,nivel,rangoExplosion,impacto,image,estado);
    }

    @Override
    public Poder crearPoder(String nombre, Double alcance, Double nivel, Double rangoExplosion, Double impacto, String image,String estado) {
           return new Poder(nombre, alcance, nivel, rangoExplosion, impacto,image,estado);
    }
    
}
