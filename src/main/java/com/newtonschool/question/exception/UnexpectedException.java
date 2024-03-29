package com.newtonschool.question.exception;

import com.newtonschool.question.constant.ErrorCode;
import com.newtonschool.question.constant.ResponseMessage;

public class UnexpectedException extends CalculatorException {

    public UnexpectedException() {
        super(ErrorCode.UNEXPECTED, ResponseMessage.UNEXPECTED);
    }

}