package kartyatrukkkonzolon;

public class Pakli {

    public String[] pakli = new String[22];

    public Pakli() {
        feltolt();
        kirak();
    }


    public Pakli(String[] pakli, int oszlop, int hanyadik) {
        this.pakli = pakli;
        kever(oszlop);
        kirak();
        if (hanyadik == 3) {
            ezVolt();
        }
    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                String lapTartalom = szin + "_" + ertekek[e];
                Lap lap = new Lap(lapTartalom);
                pakli[i] = lap.getLeiras();
                i++;
            }
        }
    }

    private void kirak() {
        System.out.println("pakli");
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private void kever(int oszlop) {
        String[] ujPakli = new String[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:

                for (int i = 1; i <= 7; i++) {
                    ujPakli[i-1] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujPakli;

    }

    private void ezVolt() {
        System.out.println("A választott lap: " + pakli[11]);
    }

}
