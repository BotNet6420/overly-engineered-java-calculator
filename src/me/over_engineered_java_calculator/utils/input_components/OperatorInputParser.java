package me.over_engineered_java_calculator.utils.input_components;

import me.over_engineered_java_calculator.common.MathOperation;

/**
 * Helper class to parse the user input.
 */
public class OperatorInputParser {
    /**
     * Checks the user's input against every text literal of every {@link MathOperation},
     * and returns the corresponding {@link MathOperation} of the first match.
     * Returns null if it cannot find a match.
     * @param userInput The user's input
     * @return The {@link MathOperation} corresponding to the user's input, null if none
     * @see MathOperation
     */
    public static MathOperation parse(String userInput) {
        String input = userInput.toLowerCase();
        for (MathOperation operation : MathOperation.values()) {
            String[] Literals = operation.getTextLiteral();

            for (String Literal : Literals) {
                if (input.equals(Literal)) {
                    return operation;
                }
            }
        }
        return null;
    }
}
