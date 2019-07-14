package Zadanie;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class ZegarŚmierci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dlugoscZycia = 100;
        int randomCzyZawal = random.nextInt(100);
        System.out.println("Podaj date urodzenia:");
        String dateUrodzenia = scanner.nextLine();
        System.out.println("Kobieta czy Mezczyzna K/M:");
        String kobietaMezczyzna = scanner.nextLine();
        System.out.println("Czy palisz papierosy? Y/N:");
        String czyPalacz = scanner.nextLine();
        System.out.println("Czy zyjesz w stresie? Y/N:");
        String czyStres = scanner.nextLine();
        if (kobietaMezczyzna.equals("M")) {
            dlugoscZycia -= 10;
        }
        if (czyPalacz.equals("Y")) {
            dlugoscZycia -= 9;
        }
        if (czyStres.equals("Y")) {
            System.out.println("masz: " + randomCzyZawal + " % szans na zawal w wieku 60 lat");
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDateOfBirth = LocalDate.parse(dateUrodzenia, dateTimeFormatter);
        LocalDate localDatePlusHund = localDateOfBirth.plusYears(dlugoscZycia);
        Period periodToDeath = Period.between(localDateOfBirth, localDatePlusHund);
        System.out.println("Prawdopodobnie umrzesz za: " + periodToDeath.getYears() + " " + periodToDeath.getMonths() + " " + periodToDeath. getDays());
        System.out.println(localDatePlusHund);
    }
}


