/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autohaus;

/**
 *
 * @author tim
 */
public class Auto extends FahrzeugBasis implements Fahrzeug {

    @Override
    public String toString() {
        return "FahrzeugBasis{" + "tank=" + getTank() + ", verbrauch=" + getVerbrauch() + ", farbe=" + getFarbe() + ", kennzeichen=" + getKennzeichen() + '}';
    }

}
