package modell;

public class Pakli {

    private String[] pakli = new String[22];

    public String[] getPakli() {
        return pakli;
    }

    public void setPakli(String[] pakli) {
        this.pakli = pakli;
    }

    public Pakli() {
        feltolt();
    }

    private void feltolt() {
        String[] pakli = this.pakli;
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                Lap lap = new Lap(szin + "_" + ertekek[e]);
                pakli[i] = lap.getLeiras();
                i++;
            }
        }
        setPakli(pakli);
    }

    public void kirak(String[] pakli) {
        System.out.println("\n" + "pakli");
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }

    }

    public void kever(int oszlop) {
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
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
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
        setPakli(ujPakli);
    }

    public String ezVolt(String[] pakli) {
        return pakli[11];

    }

}
