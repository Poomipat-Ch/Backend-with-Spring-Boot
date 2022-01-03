package com.kenta.traning.blog_backend.exceptionHandler;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ErrorAdviser {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorResponse> handleBaseException(BaseException e) {
        ErrorResponse response = new ErrorResponse();
        response.setError(e.getMessage());
        response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(response);
    }

    @Data
    public static class ErrorResponse {

        private LocalDateTime timestamp = LocalDateTime.now();

        private int status;

        private String error;

    }
}
