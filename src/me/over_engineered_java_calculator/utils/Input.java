package me.over_engineered_java_calculator.utils;

import me.over_engineered_java_calculator.common.MathOperation;
import me.over_engineered_java_calculator.utils.input_components.OperatorInputParser;
import me.over_engineered_java_calculator.utils.input_components.TakeUserInput;

/**
 * The High level user input interface.
 * @see OperatorInputParser
 * @see TakeUserInput
 */
public class Input {
    /**
     * Gets a number from the user using {@link TakeUserInput}.
     * @return User entered number
     * @see TakeUserInput
     */
    public static double getNumber() {
        return TakeUserInput.readNumber("Enter a number: ", false);
    }

    /**
     * Lists all the available operators and their literals,
     * Gets an input from the user using {@link TakeUserInput},
     * Then parses that to a {@link MathOperation} operation.
     * @return The {@link MathOperation} entered by the user
     * @see TakeUserInput
     * @see OperatorInputParser
     */
    public static MathOperation getOperator() {
        MathOperation result;
        do {
            System.out.println("Available operators:");
            for (MathOperation operation : MathOperation.values()) {
                System.out.printf("%-10s ->", operation.name());
                for (String literal : operation.getTextLiteral()) {
                    System.out.printf(" [%-10s]", literal);
                }
                System.out.printf("%n");
            }
            String userInput = TakeUserInput.readLine("Enter an operator: ", false);
            result = OperatorInputParser.parse(userInput);
        } while (result == null);
        return result;
    }

    /**
     * Takes raw string input from the user using {@link TakeUserInput}.
     * @param prompt The prompt to be shown using {@link TakeUserInput}
     * @param newline Whether {@link TakeUserInput} should use a newline after the prompt or not
     * @return The string entered by the user
     * @see TakeUserInput
     */
    public static String getRawInput(String prompt, boolean newline) {
        return TakeUserInput.readLine(prompt, newline);
    }
}
