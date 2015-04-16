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
public class FahrzeugBasis implements Fahrzeug {

    @Override
    public String toString() {
        return "FahrzeugBasis{" + "tank=" + tank + ", verbrauch=" + verbrauch + ", farbe=" + farbe + ", kennzeichen=" + kennzeichen + '}';
    }

    private float tank;
    private float verbrauch;
    private String farbe;
    private String kennzeichen;

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public float getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public float getVerbrauch() {
        return verbrauch;
    }

    /**
     * Das Auto verbraucht den Wert vom "Verbrauch" auf 100km in L
     *
     * @param verbrauch
     */
    public void setVerbrauch(float verbrauch) {
        this.verbrauch = verbrauch;
    }

    @Override
    public float berechneReichweite() throws Exception {
        float reichweite;
        reichweite = this.tank / this.verbrauch * 100;

        if (this.tank < 0.1) {

            throw new Exception("Tank nicht vorhanden!");
        }
        return reichweite;

    }

}
