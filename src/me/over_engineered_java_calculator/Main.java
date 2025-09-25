package me.over_engineered_java_calculator;

import me.over_engineered_java_calculator.operators.*;
import me.over_engineered_java_calculator.utils.Calculator;
import me.over_engineered_java_calculator.utils.OperationManager;

/**
 * The programs entrypoint
 */
public class Main {
    public static void main(String[] args) {
        OperationManager operationManager = new OperationManager(new IOperator[]{
                new Add(),
                new Subtract(),
                new Divide(),
                new Multiply(),
                new Modulo()
        });

        Calculator calculator = new Calculator(operationManager);
        calculator.run();
    }
}