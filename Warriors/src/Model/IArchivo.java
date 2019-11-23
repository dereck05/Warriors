/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.util.ArrayList;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author maryp
 */
public interface IArchivo {
    public void crearArchivo(ObjetoInformacion objeto) throws IOException;
}
