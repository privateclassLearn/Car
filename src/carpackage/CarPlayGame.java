package carpackage;

import java.util.Objects;
import java.util.Scanner;

import static carpackage.CarGame.game;

public class CarPlayGame {
    // Below ist the car game playing question method
    static void playGame() {
        System.out.println("Do you want to play the game? y/n: ");
        Scanner playGame = new Scanner(System.in);
        String playing = playGame.nextLine();
        System.out.println("Your answer has been: " + playing);
        if (Objects.equals(playing, "y")) {
            game();
        } else {
            System.out.println("Thank you!");
        }
    }
}
