package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalException {
    @ResponseBody
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity exceptionHandler(HttpServletRequest httpServletRequest, RuntimeException e) {
        return new ResponseEntity("服务错误", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
