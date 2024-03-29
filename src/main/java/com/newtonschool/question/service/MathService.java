package com.newtonschool.question.service;

import com.newtonschool.question.constant.MathOperation;
import com.newtonschool.question.data.CalculatorInput;
import com.newtonschool.question.exception.DivideByZeroException;
import com.newtonschool.question.exception.InvalidOperatorException;
import com.newtonschool.question.exception.OverflowException;
import com.newtonschool.question.exception.UnderflowException;

public class MathService {
    public static double calculate(String mathOperation, CalculatorInput calculatorInput) {
        double num1 = calculatorInput.getNum1();
        double num2 = calculatorInput.getNum2();
        double result;
        switch (mathOperation) {
            case MathOperation.ADD:
                result = num1 + num2;
                break;
            case MathOperation.SUBTRACT:
                result = num1 - num2;
                break;
            case MathOperation.MULTIPLY:
                result = num1 * num2;
                break;
            case MathOperation.DIVIDE:
                if (num2 == 0) {
                    throw new DivideByZeroException();
                }
                result = num1 / num2;
                break;
            default:
                throw new InvalidOperatorException();
        }
        if (result > 1000000) {
            throw new OverflowException();
        }
        if (result < -1000000) {
            throw new UnderflowException();
        }
        return result;
    }
}
