package obiektowe;

public class mainBank {
    public static void main(String[] args) {
        Konto kontoAndrzeja = new Konto(123L, 1000);
        Konto kontoBeaty = new Konto(555L, 2000);

        kontoAndrzeja.wyswietlStanKonta();

        kontoBeaty.wyswietlStanKonta();
        kontoAndrzeja.wplacSrodki(kontoBeaty.pobierzSrodki(200));

        kontoAndrzeja.wyswietlStanKonta();

        kontoBeaty.wyswietlStanKonta();
    }
}
