package obiektowe;

public class Sala {
    int powierzchnia ;
    int liczbaKrzesel;
    int liczbaBiurek;
    int iloscLamp;
    int liczbaOkien;
    boolean czyJestKlima;
    boolean czyJestRzutnik;
    boolean czySalaJestWolna;

    public Sala(int powierzchnia, int liczbaKrzesel, int liczbaBiurek, int iloscLamp, int liczbaOkien, boolean czyJestKlima, boolean czyJestRzutnik, boolean czySalaJestWolna) {
        this.powierzchnia = powierzchnia;
        this.liczbaKrzesel = liczbaKrzesel;
        this.liczbaBiurek = liczbaBiurek;
        this.iloscLamp = iloscLamp;
        this.liczbaOkien = liczbaOkien;
        this.czyJestKlima = czyJestKlima;
        this.czyJestRzutnik = czyJestRzutnik;
        this.czySalaJestWolna = czySalaJestWolna;
    }

    public  void opisSali() {
        System.out.println("Sala ma " + powierzchnia + " m2 " + liczbaKrzesel + " krzeseł "
                + liczbaBiurek + " biurek " + "czy ma Klime " + czyJestKlima + " czy ma Rzutnik "
                + czyJestRzutnik  + " czy jest Wolna " + czySalaJestWolna);

    }
}
