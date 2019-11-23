/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author dereck
 * Arma es un tipo de Ataque
 */
public class Arma extends Ataque {
    
    
    public Arma(String name,Double alcanceAtaque,Double level,Double rangoExplotion,Double impact,String img,String estado){
        super(name,alcanceAtaque,level,rangoExplotion,impact,img,estado);
    }
    
}
