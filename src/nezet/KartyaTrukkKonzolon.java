package nezet;

import modell.Pakli;
import java.util.Scanner;

public class KartyaTrukkKonzolon {

    private static final Scanner sc = new Scanner(System.in);

    public KartyaTrukkKonzolon(String[] pakli, Pakli obj) {
        inditas(pakli, obj);
       
    }

    private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;

    }

    private void inditas(String[] pakli, Pakli obj) {
        obj.kirak(pakli);
        for (int i = 0; i < 3; i++) {
            int oszlop = melyik();
            pakli = obj.kever(oszlop, pakli);
            obj.kirak(pakli);
        }
        obj.ezVolt(pakli); }
}
