package com.newtonschool.question.exception;

import com.newtonschool.question.constant.ErrorCode;
import com.newtonschool.question.constant.ResponseMessage;

public class UnderflowException extends CalculatorException {

    public UnderflowException() {
        super(ErrorCode.UNDERFLOW, ResponseMessage.UNDERFLOW);
    }

}