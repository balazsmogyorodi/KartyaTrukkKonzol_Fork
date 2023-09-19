package kartyatrukkkonzolon;

public class Pakli {

     private static String[] pakli = new String[21];

    public Pakli() {
        feltolt();
        kirak();
    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
       int i = 0;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                String lapTartalom = szin + "_" + ertekek[e];
                Lap lap = new Lap(lapTartalom);
                pakli[i] = lap.getLeiras();
                System.out.println(pakli[e]);
                i++;
            }
        }

    }

    private void kirak() {
        
        System.out.println("pakli");
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if ((i + 1) % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private void kever(int oszlopp) {

    }

    private void ezVolt() {

    }

}
