package guesser;

import java.util.Scanner;
public class GuessingGame {
    private final int maxNumber;
    private int guessCount;

    public GuessingGame(int maxNumber) {
        this.maxNumber = maxNumber;
        this.guessCount = 0;
    }

    public int playGame(Scanner input) {
        int low = 1;
        int high = this.maxNumber;

        System.out.printf("I'll guess the integer between 1 and %d. Press any key when you're ready.%n", high);
        input.nextLine();
        while (low <= high){
            int guess = (low + high) / 2;
            System.out.printf("Is your number %d? (Enter 'h' if higher, 'l' if lower, 'y' if correct)%n", guess);
            String response = InputValidator.getValidResponse(input,"", "h", "l", "y");

            switch (response) {
                case "h":
                    low = guess + 1;
                    break;
                case "l":
                    high = guess - 1;
                    break;
                case "y":
                    System.out.println("I guessed correctly!");
                    return guessCount;
                default:
                    System.out.println("Please enter a valid response.");
                    break;
            }
            guessCount++;
        }

    return guessCount;
    }
}
