package me.over_engineered_java_calculator.utils;

import me.over_engineered_java_calculator.common.CalculatorOperation;
import me.over_engineered_java_calculator.common.MathOperation;

/**
 * The overengineered calculator class
 */
public class Calculator {
    private final OperationManager operationManager;

    public Calculator(OperationManager operationManager) {
        this.operationManager = operationManager;
    }

    /**
     * Runs the Calculator
     */
    public void run() {
        // Display welcome message
        printWelcome();

        do {
            // Ask for one calculator operation
            CalculatorOperation operation = getUserCalculation();

            // Perform calculation
            double result = operationManager.performOperation(operation);

            // Print results
            System.out.println("\nResult : " + result + "\n");

            // Ssk if they want to quit
        } while (Input.getRawInput("Press Enter to continue. Type anything to exit. ", false).isEmpty());
    }

    /**
     * Asks the user for a number, an operator, another number in the same order,
     * then constructs and returns the {@link CalculatorOperation}.
     * @return A {@link CalculatorOperation}
     */
    private static CalculatorOperation getUserCalculation() {
        double x = Input.getNumber();
        MathOperation operation = Input.getOperator();
        double y = Input.getNumber();

        return new CalculatorOperation(operation, x ,y);
    }

    /**
     * Prints a welcome message
     */
    private static void printWelcome() {
        System.out.println("Hello! And welcome to my overly overengineered calculator!");
        System.out.println("I have spent too much time on this. I hope you enjoy it!\n\n\n");
    }
}
