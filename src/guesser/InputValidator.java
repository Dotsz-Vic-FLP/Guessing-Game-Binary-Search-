package guesser;
import java.util.Scanner;
public class InputValidator {
    /**
     * Prompts the user for an integer input and returns the valid input.
     *
     * @param input  The Scanner object for reading user input.
     * @param prompt The message to display to the user.
     * @return The valid integer input.
     */
    public static int getValidInteger(Scanner input, String prompt) {
        while(true){
            System.out.println(prompt);

            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    /**
     * Prompts the user for a string input and returns the valid input.
     *
     * @param input  The Scanner object for reading user input.
     * @param prompt The message to display to the user.
     * @return The valid string input.
     */
    public static String getValidResponse(Scanner input, String prompt, String... validResponses){
        while(true){
            System.out.println(prompt);
            String response = input.nextLine().trim().toLowerCase();
            for (String validResponse : validResponses) {
                if (response.equals(validResponse)) {
                    return response;
                }
            }
            System.out.println("Invalid input. Please enter a valid response.");
        }
    }

}
