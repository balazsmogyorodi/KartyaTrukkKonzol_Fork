package kartyatrukkkonzolon;

public class Pakli {

    public Pakli() {
        feltolt();

    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length; e++) {
                String lapTartalom = szin + "_" + ertekek[e];
                new Lap(lapTartalom);
            }
        }

    }

    private void kirak() {

    }

    private void (int oszlopp) {

    }

    private void ezVolt() {

    }

}
