package com.newtonschool.question.service;

import com.newtonschool.question.constant.MathOperation;
import com.newtonschool.question.constant.ResponseMessage;
import com.newtonschool.question.exception.InvalidOperatorException;

public class SuccessMessageService {
    public static String getSuccessMessage(String mathOperation) {
        switch (mathOperation) {
            case MathOperation.ADD:
                return ResponseMessage.ADDITION_SUCCESS;
            case MathOperation.SUBTRACT:
                return ResponseMessage.SUBTRACTION_SUCCESS;
            case MathOperation.MULTIPLY:
                return ResponseMessage.MULTIPLICATION_SUCCESS;
            case MathOperation.DIVIDE:
                return ResponseMessage.DIVISION_SUCCESS;
            default:
                throw new InvalidOperatorException();
        }
    }
}
