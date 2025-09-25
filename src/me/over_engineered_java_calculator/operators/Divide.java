package me.over_engineered_java_calculator.operators;

import me.over_engineered_java_calculator.common.MathOperation;

public class Divide extends AbstractOperator {
    @Override
    protected double operate(double x, double y) {
        return y == 0 ? 0 : x / y;
    }

    @Override
    public MathOperation getOperatorType() {
        return MathOperation.DIVIDE;
    }
}
