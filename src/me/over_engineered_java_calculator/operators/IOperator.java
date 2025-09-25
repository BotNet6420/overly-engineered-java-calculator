package me.over_engineered_java_calculator.operators;

import me.over_engineered_java_calculator.common.CalculatorOperation;
import me.over_engineered_java_calculator.common.MathOperation;

/**
 * The operator interface
 */
public interface IOperator {
    /**
     * Gets the {@link MathOperation} the operator performs.
     * @return The {@link MathOperation} the operator performs
     */
    MathOperation getOperatorType();

    /**
     * Performs the given {@link CalculatorOperation}.
     * @param operation The {@link CalculatorOperation} to perform
     * @return The result of the operation.
     */
    double operate(CalculatorOperation operation);
}
