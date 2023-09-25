package nezet;

import modell.Pakli;
import java.util.Scanner;

public class KartyaTrukkKonzolon {

    private Pakli obj;
    private String[] pakli;

    private static final Scanner sc = new Scanner(System.in);

    public KartyaTrukkKonzolon(Pakli obj) {
        this.obj = obj;
        this.pakli = this.obj.getPakli();
        inditas();
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

    private void inditas() {
        obj.kirak(pakli);
        for (int i = 0; i < 3; i++) {
            int oszlop = melyik();
            obj.kever(oszlop);
            pakli = obj.getPakli();
            obj.kirak(pakli);
        }
        String ez = obj.ezVolt(pakli);
        System.out.println("A kártya, ami középen van a(z) " + ez);
    }
}
