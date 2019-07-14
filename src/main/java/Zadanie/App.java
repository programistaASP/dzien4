package Zadanie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {

        String date;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj date: ");
        date = input.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = date;
        System.out.println(date);

        DateTimeFormatter newDate = DateTimeFormatter.ofPattern("dd::MM::yyyy");
        LocalDate podanaData = LocalDate.parse(date, newDate);
        System.out.println(newDate);

        LocalDate podanaData2 = LocalDate.now();
        System.out.println(podanaData2.getDayOfWeek());

        LocalDate todayTenDaysww = podanaData.plusDays(10);
        System.out.println(podanaData.minusDays(10));

        System.out.println(podanaData);

        LocalDate todayTenDaysLater = podanaData.plusDays(10);
        System.out.println(podanaData.plusDays(10));





    }
}