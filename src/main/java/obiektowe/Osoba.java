package obiektowe;

public class Osoba {
    int rokUrodzenia;
    String imie;
    String gender;
    int wzrost;
    String kolorWlosow;

    public Osoba(int rokUrodzenia, String imie, String gender, int wzrost, String kolorWlosow) {
        this.rokUrodzenia = rokUrodzenia;
        this.imie = imie;
        this.gender = gender;
        this.wzrost = wzrost;
        this.kolorWlosow = kolorWlosow;
    }

    public void przedstawSie() {
        System.out.println("Cześć! Jestem " + imie + " i mam " + (2019 - this.rokUrodzenia) + " lat"
                + " Jestem " + gender + " Mam " + wzrost + " cm " + " i " + kolorWlosow +" włosy");

    }
}
