package me.over_engineered_java_calculator.operators;

import me.over_engineered_java_calculator.common.MathOperation;

public class Add extends AbstractOperator {
    @Override
    protected double operate(double x, double y) {
        return x + y;
    }

    @Override
    public MathOperation getOperatorType() {
        return MathOperation.ADD;
    }
}
