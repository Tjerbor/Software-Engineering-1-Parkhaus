package Classes;

public class Autozaehler {
    private static int Autoanzahl = 0;

    public static int getAutoanzahl() {
        return Autoanzahl;
    }
    Autozaehler(){}

    public static void veraendereAnzahl(int delta) {
        if (Autoanzahl + delta < 0) {
            throw new IllegalArgumentException("Die Autoanzahl kann nicht geringer als 0 sein.");
        }
        Autoanzahl += delta;
    }

    public static void erhoeheAnzahl() {
        Autoanzahl++;
    }

    public static void verringereAnzahl() {
        if (Autoanzahl == 0) {
            throw new IllegalStateException("Anzahl beträgt bereits 0 und kann nicht weiter verringert werden.");
        }
        Autoanzahl--;
    }

    public static void verringereAnzahl(int a) {
        Autoanzahl = Autoanzahl - a;
    }
}
