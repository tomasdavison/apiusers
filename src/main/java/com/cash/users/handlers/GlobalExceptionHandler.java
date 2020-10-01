package com.cash.users.handlers;

import com.cash.users.models.ResponseBody;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Collections;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    private ResponseEntity<Object> missingParameterException(
            MissingServletRequestParameterException e,
            WebRequest request) {
        ResponseBody response = ResponseBody.notOk(Collections.singletonList("Parameter '" + e.getParameterName() + "' is mandatory"));
        return ResponseEntity.badRequest().body(response);
    }
}
