package me.over_engineered_java_calculator.common;

/**
 * Represents a simple calculator operation with 2 doubles and a {@link MathOperation}.
 */
public class CalculatorOperation {
    private final MathOperation operationType;
    private final double value1;
    private final double value2;

    public CalculatorOperation(MathOperation operation, double value1, double value2) {
        this.operationType = operation;
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return this.value1;
    }

    public double getValue2() {
        return this.value2;
    }

    public MathOperation getOperationType() {
        return this.operationType;
    }
}
