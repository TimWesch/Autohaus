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
public final class App extends FahrzeugBasis {

    public static void main(String[] args) throws Exception {

        App app = new App();
    }

    public App() throws Exception {

        Laster laster = new Laster();
        laster.setFarbe("Grün");
        laster.setTank(100);
        laster.setVerbrauch(8f);
        laster.setKennzeichen("HB 7654");

        Auto auto = new Auto();
        auto.setFarbe("Blau");
        auto.setTank(70);
        auto.setVerbrauch(6f);
        auto.setKennzeichen("HB 1234");

        Auto auto1 = new Auto();
        auto1.setFarbe("Rot");
        auto1.setTank(67);
        auto1.setVerbrauch(5.5f);
        auto1.setKennzeichen("HB 4321");

        Auto auto2 = new Auto();
        auto2.setFarbe("Blau");
        auto2.setTank(70);
        auto2.setVerbrauch(1f);
        auto2.setKennzeichen("HB 5678");

        ArrayList<Fahrzeug> a1 = new ArrayList<>();

        a1.add(auto);
        a1.add(auto1);
        a1.add(auto2);
        a1.add(laster);

        FilterService hubert = new FilterService();

        ArrayList<Fahrzeug> a1gefiltert = hubert.filter(a1, 2000.0f);

        for (Fahrzeug s : a1gefiltert) {
            System.out.println(s);
        }
    }

    public float rechneKilometerInMeilenUm(float kilometer) {
        float meilen;
        meilen = kilometer / 100 * 0.62137119224f * 100;
        return meilen;

    }
}
