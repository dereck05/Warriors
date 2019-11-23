/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import static Controller.ControladorVentanaCrearPersonaje.ataqueTemp;
import Model.Arma;
import Model.Personaje;
import Model.Ataque;
import Model.Poder;
import View.VentanaCarta;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Gloriana
 */
public class ControladorVentanaCarta {
    
    public VentanaCarta vista;
    public Personaje personaje;
    public ArrayList<Ataque> ataques;
   
    
    public ControladorVentanaCarta(VentanaCarta pVista, Personaje pPersonaje){
        vista = pVista;
        personaje = pPersonaje;
        ataques = ControladorVentanaCrearPersonaje.ataqueTemp;
        setPersonajeCarta();
        
    }
    
    public void setPersonajeCarta(){
        
        //Setear labels
        vista.lblNombre.setText(personaje.getNombre());
        
        vista.lblNivel.setText(Double.toString(personaje.getNivel()));
        
        vista.lblVida.setText(Double.toString(personaje.getVida()));
        
        vista.lblCampo.setText(Double.toString(personaje.getCampoAccion()));
        
        vista.lblCosto.setText(Double.toString(personaje.getCosto()));
        
        vista.lblGolpes.setText(Double.toString(personaje.getGolpesxTiempo()));
        
        vista.lblAparicion.setText(Double.toString(personaje.getNivelAparicion()));
        
        //Setear dibujo
        String pathDibujo = personaje.getImage();
        vista.lblDibujo.setIcon(new javax.swing.ImageIcon(pathDibujo));
        
        //Agregar ataques
        for(Ataque ataque : ataques){
            //Crea un panel con la imagen, la etiqueta y el tooltip
            //Y lo agrega al panel del scrollbar
            
            
            JPanel panelAtaque = new JPanel();
            panelAtaque.setBackground(new java.awt.Color(204, 204, 204));
            panelAtaque.setMinimumSize(new java.awt.Dimension(80, 100));
            panelAtaque.setPreferredSize(new java.awt.Dimension(80, 100));
            panelAtaque.setLayout(new javax.swing.BoxLayout(panelAtaque, javax.swing.BoxLayout.Y_AXIS));
            
            JLabel imagenAtaque = new JLabel();
            imagenAtaque.setIcon(new javax.swing.ImageIcon(ataque.getImage())); // NOI18N
            
            imagenAtaque.setToolTipText(
                    "<html>\n<p>Alcance - " + Double.toString(ataque.getAlcance()) + 
                    "</p>\n<p>Rango - " + Double.toString(ataque.getRangoExplosion()) + 
                    "</p>\n<p>Impacto - " + Double.toString(ataque.getImpacto()) + 
                    "</p>\n</html>");
            
            imagenAtaque.setMaximumSize(new java.awt.Dimension(80, 32767));
            imagenAtaque.setMinimumSize(new java.awt.Dimension(80, 80));
            imagenAtaque.setPreferredSize(new java.awt.Dimension(80, 80));
            panelAtaque.add(imagenAtaque);
            
            
            JLabel lblNombreAtaque = new JLabel();
            
            lblNombreAtaque.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
            lblNombreAtaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblNombreAtaque.setText(ataque.getNombre() + "    " + Double.toString(ataque.getNivel()));
            lblNombreAtaque.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            lblNombreAtaque.setMaximumSize(new java.awt.Dimension(80, 32767));
            lblNombreAtaque.setMinimumSize(new java.awt.Dimension(80, 20));
            lblNombreAtaque.setPreferredSize(new java.awt.Dimension(80, 20));
            panelAtaque.add(lblNombreAtaque);
            
            vista.panelAtaques.add(panelAtaque);
        }
        
        //Cambia el size del panel del scrollbar
        //Si la cantidad no abarca todo el espacio, se queda igual
        //Si abarca mas, se ajusta al tamano de los componentes
        int largo;
        if(80 * ataques.size() < vista.jScrollPane1.getMinimumSize().width){
            largo = vista.jScrollPane1.getMinimumSize().width;
        } else {
            largo = 80 * ataques.size();
        }
        
        vista.jScrollPane1.setPreferredSize(new Dimension(largo, 120));
        vista.jScrollPane1.setMinimumSize(new Dimension(largo, 120));
        vista.panelAtaques.setPreferredSize(new Dimension(largo, 120));
        vista.panelAtaques.setMinimumSize(new Dimension(largo, 120));
    }
    
}
