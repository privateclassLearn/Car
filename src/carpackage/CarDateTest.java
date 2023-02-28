package carpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CarDateTest {
    private static CharSequence carRentStart;
    private static CharSequence carRentStop;

    public static String carDateTest() {

        boolean dateError = true;
        Scanner input = null;
        while (dateError) {
            new Scanner(System.in);
            System.out.print("Please enter the date to rent a car dd.MM.yyyy: ");
            SimpleDateFormat dateInput = new SimpleDateFormat("dd.MM.yyyy");
            input = new Scanner(System.in);
            String carRentStart = input.nextLine();
            try {
                dateInput.parse(carRentStart);
                // System.out.print(new SimpleDateFormat("dd.MM.yyyy").format(date));
                dateError = false;
            } catch (ParseException e) {
                System.out.println("Parce Exception / invalid date");
            }
        }

        boolean returnDateError = true;
        Scanner returnInput = null;
        while (returnDateError) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the date to return a car dd.MM.yyyy: ");
            SimpleDateFormat dateInput = new SimpleDateFormat("dd.MM.yyyy");
            new Scanner(System.in);
            String carRentStop = input.nextLine();
            try {
                dateInput.parse(carRentStop);
                // System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(date));
                return carRentStop;
                //returnDateError = false;
            } catch (ParseException e) {
                System.out.println("Parce Exception / invalid date");
            }
        }
        System.out.println(carRentStart);
        System.out.println(carRentStop);
        System.out.println("*****************************************************************");
        LocalDate rentStartDate = java.time.LocalDate.parse(carRentStart);
        LocalDate rentStopDate = java.time.LocalDate.parse(carRentStop);
        duration(rentStartDate, rentStopDate);
        LocalDate bookStart = java.time.LocalDate.parse("01.01.2023");
        comparison(bookStart, rentStartDate);
        return null;
    }

    public static void duration(LocalDate ding, LocalDate dong) {
        Period rental = Period.between(ding, dong);
        long duration = ChronoUnit.DAYS.between(ding, dong);
        System.out.println("Rental duration: " + duration + " days.");
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
        } else {
            System.out.println("Both days are equal.");
        }
    }

    public static void setCarRentStart(CharSequence carRentStart) {
        CarDateTest.carRentStart = carRentStart;
    }

    public static void setCarRentStop(CharSequence carRentStop) {
        CarDateTest.carRentStop = carRentStop;
    }
}

