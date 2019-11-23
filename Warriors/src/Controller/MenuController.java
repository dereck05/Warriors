/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SuperFactory;
import View.Menu;
import View.VentanaAgregarAtaque;
import View.VentanaCrearPersonaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dereck
 */
public class MenuController implements ActionListener {
    public Menu vista;
    
    public MenuController(Menu pVista){
        this.vista = pVista;
        this.vista.jButtonArmas.addActionListener(this);
        this.vista.jButtonPersonajes.addActionListener(this);  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) { 
            case "Crear ataque": 
                addAtaque();    
                break;
            case "Crear personaje":
                addPersonaje();
                break;
            default:
                break;
        }
    }
    
    public void addAtaque(){
        VentanaAgregarAtaque v = new VentanaAgregarAtaque();
        SuperFactory sf = new SuperFactory();
        ControladorVentanaAgregarAtaque cat = new ControladorVentanaAgregarAtaque(v,sf);
        cat.vista.setVisible(true);
    }
    public void addPersonaje(){
        VentanaCrearPersonaje vp = new VentanaCrearPersonaje();
        SuperFactory sf = new SuperFactory();
        ControladorVentanaCrearPersonaje cp = new ControladorVentanaCrearPersonaje(vp,sf);
        cp.vista.setVisible(true);
    }
}
