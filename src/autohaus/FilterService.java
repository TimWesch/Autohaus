/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autohaus;

import java.util.ArrayList;

/**
 *
 * @author tim
 */
public class FilterService extends FahrzeugBasis {

    public ArrayList<Fahrzeug> filter(ArrayList<Fahrzeug> b1, float geforderteReichweite) throws Exception {
        ArrayList<Fahrzeug> filtern = new ArrayList<>();
        for (Fahrzeug fahrzeug : b1) {
            

            if (fahrzeug.berechneReichweite() > geforderteReichweite) {
                filtern.add(fahrzeug);

            }

        }
        return filtern;

    }

}
