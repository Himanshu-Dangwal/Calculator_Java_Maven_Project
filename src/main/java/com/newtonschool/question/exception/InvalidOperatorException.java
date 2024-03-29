package com.newtonschool.question.exception;

import com.newtonschool.question.constant.ErrorCode;
import com.newtonschool.question.constant.ResponseMessage;

public class InvalidOperatorException extends CalculatorException {

    public InvalidOperatorException() {
        super(ErrorCode.INVALID_OPERATOR, ResponseMessage.INVALID_OPERATOR);
    }

}