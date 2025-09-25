package me.over_engineered_java_calculator.operators;

import me.over_engineered_java_calculator.common.CalculatorOperation;

/**
 * The superclass for the operators to factor out shared logic.
 */
public abstract class AbstractOperator implements IOperator {

    /**
     * Extracts the 2 numbers inside the {@link CalculatorOperation},
     * and passes them to the operator using {@link #operate(double, double)} to calculate.
     * @param operation The {@link CalculatorOperation} to perform
     * @return The result of the operation.
     */
    @Override
    public final double operate(CalculatorOperation operation) {
        return operate(operation.getValue1(), operation.getValue2());
    }

    /**
     * The abstract method to be overwritten by the operators. Called when a calculation needs to be done.
     * @param x The first number
     * @param y The second number
     * @return The result of the calculation.
     */
    protected abstract double operate(double x, double y);
}
