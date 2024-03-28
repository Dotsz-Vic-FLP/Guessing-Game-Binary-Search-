package guesser;

import java.util.ArrayList;
import java.util.Scanner;
public class GameUI {
    public static void printWelcomeMessage(){
        System.out.println("Welcome to the Guessing Game! \nI will guess the number you're thinking of. Let's get started!");
    }

    public static boolean playAgain(Scanner input) {
        String response = InputValidator.getValidResponse(input, "Would you like to play again? (y/n)", "y", "n");
        return response.equals("y");
    }

    public static void printGameSummary(ArrayList<Integer> guessCounts) {
        System.out.println("Thanks for playing!");
        int gameNumber = 1;
        for (int count : guessCounts) {
            System.out.printf("Game number: %d. Took %d guesses. %n", gameNumber, count+1);
            gameNumber++;
        }
    }
}
