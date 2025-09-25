package me.over_engineered_java_calculator.utils;

import me.over_engineered_java_calculator.common.CalculatorOperation;
import me.over_engineered_java_calculator.common.MathOperation;
import me.over_engineered_java_calculator.operators.IOperator;

import java.util.HashMap;

/**
 * The operation manager class, keeps a list of all operations,
 * and performs {@link CalculatorOperation} operations using them
 */
public class OperationManager {
    private final HashMap<MathOperation, IOperator> operators = new HashMap<>();

    public OperationManager(IOperator[] operators) {
        for(IOperator operator : operators) {
            MathOperation operatorType = operator.getOperatorType();

            // If it already contains an operator for that operation, skip it
            if (this.operators.containsKey(operatorType)) {
                continue;
            }
            this.operators.put(operatorType, operator);
        }
    }

    /**
     * Find an appropriate {@link IOperator} for the {@link CalculatorOperation}
     * based on {@link CalculatorOperation#getOperationType()},
     * and then perform the calculation using that operator and return the result.
     * In case and operator was not found (which should only be the case when the {@link OperationManager}
     * was not constructed with a full list of operators, or there is not an operator for every
     * operation in {@link MathOperation}) it will print an error message and return 0.
     * @param operation The {@link CalculatorOperation} to perform
     * @return The result of the calculation, or 0 with a printed error message if there was an error
     * @see IOperator
     * @see MathOperation
     * @see CalculatorOperation
     */
    public double performOperation(CalculatorOperation operation) {
        MathOperation operationType = operation.getOperationType();
        if (operators.containsKey(operationType)) {
            IOperator operator = operators.get(operationType);
            return operator.operate(operation);
        }
        System.out.println("OperationManager did not find an operator for operation type " + operationType);
        return 0;
    }
}
