package com.newtonschool.question.exceptionhandler;

import com.newtonschool.question.constant.ErrorCode;
import com.newtonschool.question.constant.ResponseMessage;
import com.newtonschool.question.data.ErrorResponse;
import com.newtonschool.question.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.constraints.NotNull;

@ControllerAdvice
public class CalculatorControllerExceptionHandler {
    @ExceptionHandler({
            OverflowException.class,
            UnderflowException.class,
            InvalidOperatorException.class,
            DivideByZeroException.class,
            InvalidInputException.class,
            UnexpectedException.class
    })
    public ResponseEntity<Object> calculatorExceptionHandler(@NotNull CalculatorException calculatorException) {
        return new ResponseEntity<>(new ErrorResponse(calculatorException.getErrorCode(), calculatorException.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public ResponseEntity<Object> httpMessageNotReadableExceptionHandler(@NotNull HttpMessageNotReadableException httpMessageNotReadableException) {
        return new ResponseEntity<>(new ErrorResponse(ErrorCode.INVALID_INPUT, ResponseMessage.INVALID_INPUT), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleAllExceptions(@NotNull Exception exception) {
        return new ResponseEntity<>(new ErrorResponse(ErrorCode.UNEXPECTED, ErrorCode.UNEXPECTED), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
