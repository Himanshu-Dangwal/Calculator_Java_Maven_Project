package com.newtonschool.question.exception;

import com.newtonschool.question.constant.ErrorCode;
import com.newtonschool.question.constant.ResponseMessage;

public class OverflowException extends CalculatorException {

    public OverflowException() {
        super(ErrorCode.OVERFLOW, ResponseMessage.OVERFLOW);
    }

}