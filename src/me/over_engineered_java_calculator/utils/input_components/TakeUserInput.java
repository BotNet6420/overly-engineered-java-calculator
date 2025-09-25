package me.over_engineered_java_calculator.utils.input_components;

import java.util.Scanner;

/**
 * Helper class to take user input.
 */
public class TakeUserInput {
    private static final Scanner inputReader = new Scanner(System.in);

    /**
     * Repeatedly prompts the user for a number until a valid double is entered.
     * @param prompt The prompt to be displayed
     * @param newline Whether it should add a newline at the end of the prompt
     * @return The number entered by the user
     */
    public static double readNumber(String prompt, boolean newline) {
        while (true) {
            try {
                printPrompt(prompt, newline);

                return inputReader.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input! Need a Number!");
            } finally {
                inputReader.nextLine();
            }
        }
    }

    /**
     * Takes raw string user input. Included a try-catch failsafe in case they somehow break the input.
     * @param prompt The prompt to be displayed
     * @param newline Whether it should add a newline at the end of the prompt
     * @return The user's input
     */
    public static String readLine(String prompt, boolean newline) {
        while (true) {
            try {
                printPrompt(prompt, newline);

                return inputReader.nextLine();
            } catch (Exception e) {
                System.out.println("How the hell do you break a String input?");
            }
        }
    }

    /**
     * Helper function to display the prompt.
     * @param prompt The prompt to be displayed
     * @param newline Whether it should add a newline at the end of the prompt (if false it takes input
     *                at the end of the prompt)
     */
    private static void printPrompt(String prompt, boolean newline) {
        if (newline)
            System.out.println(prompt);
        else
            System.out.print(prompt);
    }
}
