/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author maryp
 */
public class ObjetoInformacion {
    String n; 
    Ataque ataque;
    Personaje personaje;
    String filename;
    public ObjetoInformacion(String n, Ataque ata, Personaje per, String filename){
        this.n=n;
        this.ataque=ata;
        this.personaje=per;
        this.filename=filename;
    }

    public void setN(String n) {
        this.n = n;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getN() {
        return n;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public String getFilename() {
        return filename;
    }
}
