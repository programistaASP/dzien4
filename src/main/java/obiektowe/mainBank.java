package obiektowe;

public class mainBank {
    public static void main(String[] args) {
        Konto kontoAndrzeja = new Konto(123L, 1000);
        Konto kontoBeaty = new Konto(555L, 2000);
        try {
            kontoBeaty.pobierzSrodki(20440);
        }catch (GruboPonizejZera e){
            e.printStackTrace();
        }

       // kontoAndrzeja.wplacSrodki(kontoBeaty.pobierzSrodki(20000));

    }
}
