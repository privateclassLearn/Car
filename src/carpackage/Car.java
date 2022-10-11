package carpackage;

// The Scanner class has been imported to enable the use of Scanner for obtaining user input

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        playGame();
        CarFactory myCar = new CarFactory();
        myCar.producer = "Dacia";
        myCar.color = "comete grey";
        myCar.engine = "gasoline";
        myCar.model = "Duster 2";
        myCar.power = 96;

        CarFactory myOldCar = new CarFactory();
        myOldCar.producer = "VW";
        myOldCar.color = "red";
        myOldCar.engine = "gasoline";
        myOldCar.model = "Golf 2";
        myOldCar.power = 70;

// The Scanner class has been imported -> see the beginning of the class
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your car producer: ");
        CarFactory userCar = new CarFactory();
        userCar.producer = userInput.nextLine();
        System.out.println("You have entered " + userCar.producer + " as the producer of your car");

        System.out.print("Please enter your car model: ");
        userCar.model = userInput.nextLine();
        System.out.println("You have entered " + userCar.model + " as the model of your car");

        System.out.print("Please enter the color of your car: ");
        userCar.color = userInput.nextLine();
        System.out.println("You have entered " + userCar.color + " as the color of your car");

        System.out.print("Please enter the type of the engine of your car: ");
        userCar.engine = userInput.nextLine();
        System.out.println("You have entered " + userCar.engine + " as the type of the engine of your car");

        System.out.print("Please enter the power of your car: ");
        userCar.power = userInput.nextInt();
        System.out.println("You have entered " + userCar.power + " as the power of your car");

        System.out.println("We are checking now if your " + userCar.model + " has more power than my " + myCar.model);
        if (userCar.power > myCar.power) {
            System.out.println("Your car has more power than my car!");
        } else {
            System.out.println("My car has more power than your car!");
        }
        int power0 = myCar.power;
        int power1 = myOldCar.power;
        int power2 = userCar.power;
        int totalPower = totalCarPower(power0, power2, power2);
        System.out.println("The total power of " + myCar.model + " " + myOldCar.model + " " + userCar.model + " is: " + totalPower + " kilowatt.");

        // beep is a method (defined in the CarFactory class and the method is called like that
        userCar.beep();
        myCar.beep();
        myOldCar.beep();

// Abbreviation to create System.out.println(); is: sout + tab

    }
// Below is another method - A method must be created outside the main {} - this is why I am writing it here
// private (= access modifier) means, it can only be called from this same class
// static means (= it can be called in this class without creating an instance, object

    private static int totalCarPower(int power0, int power1, int power2) {
        return power0 + power1 + power2;
    }

    // Below ist the car game playing question method
    static void playGame() {
        System.out.println("Do you want o play the game? y/n: ");
        Scanner playGame = new Scanner(System.in);
        String playing = playGame.nextLine();
        System.out.println("Your answer has been: " + playing);
        if (Objects.equals(playing, "y")) {
            game();
        } else {
            System.out.println("Thank you!");
        }
    }

    // Below ist the car game method
    static void game() {

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                   The Car Power Guessing Game                                 +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Your neighbor's car has 50kw to 150kw.");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomPower = rand.nextInt((150 - 50)) + 50;
        boolean playerGuessedCorrectly = false;
        do {
            System.out.print("Please guess the power of your neighbor's car: ");
            int playerguess = scanner.nextInt();
            if (playerguess == randomPower) {
                System.out.println("Correct! You guessed the right power and win!");
                playerGuessedCorrectly = true;
            } else if (randomPower > playerguess) {
                System.out.println("Not yet! The power is higher!");
            } else {
                System.out.println("Not yet! The power ist lower!");
            }
        }
        while (!playerGuessedCorrectly);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                   Game over                                                   +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Scanner playGame = new Scanner(System.in);
        System.out.println("Do you want o play the game? y/n: ");
        Scanner playGame = new Scanner(System.in);
        String playingEnd = playGame.nextLine();
        System.out.println("Your answer has been: " + playingEnd);
        if (Objects.equals(playingEnd, "y")) {
            game();
        } else {
            System.out.println("Thank you!");
        }
    }
}
