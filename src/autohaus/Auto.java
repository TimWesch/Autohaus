/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autohaus;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tim
 */
public class Auto extends FahrzeugBasis implements Fahrzeug {

    

    @Override
    public String toString() {

        try {
            return "Auto{" + "farbe=" + getFarbe() + ", tank=" + getTank() + ", verbrauch=" + getVerbrauch() + " ', reichweite=" + berechneReichweite() + "}'";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return "Fehler";

    }

}
