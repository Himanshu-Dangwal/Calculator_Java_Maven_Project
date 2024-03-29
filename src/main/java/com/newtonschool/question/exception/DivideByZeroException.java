package com.newtonschool.question.exception;

import com.newtonschool.question.constant.ErrorCode;
import com.newtonschool.question.constant.ResponseMessage;

public class DivideByZeroException extends CalculatorException {

    public DivideByZeroException() {
        super(ErrorCode.DIVIDE_BY_ZERO, ResponseMessage.DIVIDE_BY_ZERO);
    }

}