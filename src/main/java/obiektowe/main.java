package obiektowe;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Osoba osobaAnia = new Osoba(1994,"Ania",
                "kobieta",165,"Blond");

        Osoba osobaAndrzej = new Osoba(1965,"Andrzej",
                "mezczyzna",190,"Brazowe");

        Osoba osobaMariola = new Osoba(1951,"Mariola",
                "Kobieta", 145,"siwe");

        Osoba osobaWojtek = new Osoba(1965, "Wojtek",
                "mezczyzna", 160 , "Biale");

        Osoba osobaMonika = new Osoba(1984, "Monika",
                "kobieta",175, "blond");

        String [] osoba = new String[]{"gender"};

        osobaAnia.przedstawSie();
        osobaAndrzej.przedstawSie();
        osobaMariola.przedstawSie();
        osobaMonika.przedstawSie();
        osobaWojtek.przedstawSie();
    }
}
