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
public class Laster extends FahrzeugBasis implements Fahrzeug {

    @Override
    public float berechneReichweite() throws Exception {
        float reichweite = super.berechneReichweite();

        return schwereLasterreduzierenReichweite(reichweite);

    }

    public float schwereLasterreduzierenReichweite(float reichweite) {

        return reichweite / 2;

    }
}
