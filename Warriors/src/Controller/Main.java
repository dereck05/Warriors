/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Menu;
import javax.swing.JFrame;


public class Main {
    
    
    public static void main(String args[]){
        Menu vista = new Menu();
        MenuController c = new MenuController(vista);
        c.vista.setVisible(true);
        c.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
