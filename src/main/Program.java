package main;

import modell.Pakli;
import nezet.KartyaTrukkKonzolon;

public class Program {

    public static void main(String[] args) {
        Pakli alap = new Pakli();
        new KartyaTrukkKonzolon(alap);
    }

}
