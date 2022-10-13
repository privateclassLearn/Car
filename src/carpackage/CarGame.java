package carpackage;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public abstract class CarGame {
    // We need a method to write something into the class. If we don't use ist, the commands won't be recognized
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
    static void forLoop() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}

