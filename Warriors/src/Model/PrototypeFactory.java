/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;

/**
 *
 * @author maryp
 */
public class PrototypeFactory {
     
    //String puede ser el nombre???
    private static HashMap<String, IPrototype> prototypes = new HashMap<>();
    
    
    public static IPrototype getPrototype(String prototypeName){
        return prototypes.get(prototypeName).clone();
    }
    
    public static void addPrototype(String prototypeName, IPrototype prototype){
        prototypes.put(prototypeName,prototype);
    }
    public static boolean exists(String prototypeName){
        if(prototypes.containsKey(prototypeName)){
            return true;
        }
        else{
            return false;
        }
    }
  
    
}
