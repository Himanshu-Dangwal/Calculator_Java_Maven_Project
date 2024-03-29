package com.newtonschool.question.exception;

import com.newtonschool.question.constant.ErrorCode;
import com.newtonschool.question.constant.ResponseMessage;

public class InvalidInputException extends CalculatorException {

    public InvalidInputException() {
        super(ErrorCode.INVALID_INPUT, ResponseMessage.INVALID_INPUT);
    }

}