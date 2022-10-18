package carpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class CarDateTest {

    private static CharSequence carRentStart;
    private static CharSequence carRentStop;

    public static void carDateTest() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date to rent a car yyyy-MM-dd: ");
        SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-MM-dd");

        Scanner input = new Scanner(System.in);

        String carRentStart = input.nextLine();

        try {
            Date date = dateInput.parse(carRentStart);
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
        } catch (ParseException e) {
            System.out.println("Parce Exception");
        }

        System.out.println("Please enter the date to return the car yyyy-MM-dd: ");
        String carRentStop = input.nextLine();

        try {
            Date date = dateInput.parse(carRentStop);
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
        } catch (ParseException e) {
            System.out.println("Parce Exception");
        }
        LocalDate cRstart = LocalDate.parse(carRentStart);
        LocalDate cRstop = LocalDate.parse(carRentStop);
        duration(cRstart,cRstop);
        LocalDate bookStart = LocalDate.parse("2022-10-19");
        comparison(bookStart, cRstart);


    }
    public static void duration(LocalDate ding, LocalDate dong) {

        Period rental = Period.between(ding, dong);
        long duration = ChronoUnit.DAYS.between(ding, dong);
        System.out.println("Car rental time " + rental.getYears() + " years, " + rental.getMonths() +
                " months, and " + rental.getDays() +
                " days. (" + duration + " days total)");

    }

    public static void comparison(LocalDate isBooked, LocalDate wantBook) {
        int compareValue = isBooked.compareTo(wantBook);
        if (compareValue > 0) {
            System.out.println("isBooked / bookStart is latter than " + wantBook);
        } else if (compareValue < 0) {
            System.out.println("isBooked / bookStart is earlier than " + wantBook);
        }
        else {
            System.out.println("Both days are equal.");
        }
    }
}

