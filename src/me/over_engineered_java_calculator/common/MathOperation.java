package me.over_engineered_java_calculator.common;

/**
 * The available math operations and their text-input literals to be used by the input components.
 * @see me.over_engineered_java_calculator.utils.input_components.OperatorInputParser
 * @see me.over_engineered_java_calculator.utils.Input
 */
public enum MathOperation {
    ADD(new String[] {"add", "+"}),
    SUBTRACT(new String[] {"subtract", "-"}),
    MULTIPLY(new String[] {"multiply", "*"}),
    DIVIDE(new String[] {"divide", "/"}),
    MODULO(new String[] {"modulo", "%"});

    private final String[] textLiteral;

    public String[] getTextLiteral() {
        return textLiteral;
    }
    MathOperation(String[] inputLiterals) {
        this.textLiteral = inputLiterals.clone();
    }
}
