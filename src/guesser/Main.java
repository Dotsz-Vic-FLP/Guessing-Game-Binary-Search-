package guesser;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    /**
     * Main method to run the guessing game. It initiates the game loop, handles user decisions to play again,
     * and displays the game summary once the player decides to stop playing.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> guessCounts = new ArrayList<>();

        GameUI.printWelcomeMessage();
        while(true){
            int maxNumber = InputValidator.getValidInteger(scanner, "Enter the maximum number for guessing range:");
            GuessingGame game = new GuessingGame(maxNumber);
            guessCounts.add(game.playGame(scanner));

            if(!GameUI.playAgain(scanner)){
                GameUI.printGameSummary(guessCounts);
                break;
            }

        }
        scanner.close();
    }

}

    /* [Pseudocode]
       divide the range in half
       ask if guess number is correct, too low or too high
       put low value to variable
       put high value to variable


       these 3 cases will be the only ones that will be used, will also have a counter
       if correct, end game
       if too low, current number + current number / 2
       if too high current number - current number / 2

        */
