package com.example.demo.exception;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * The User Exception Handler class. Which has two main method in order to handle two major Http Status.
 * 400 BAD_REQUEST and 404 NOT_FOUND.
 */
@ControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * This method handles all the bad exceptions that may occur.
     * @param ex
     * @return ResponseEntity<Object>
     */
    @ExceptionHandler({UserValidationException.class})
    public ResponseEntity<Object> handleBadRequest(Exception ex) {
        return new ResponseEntity<Object>(ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    /**
     * This method handles all the not found exceptions that may occur.
     * @param ex
     * @return ResponseEntity<Object>
     */
    @ExceptionHandler({UserNotFoundException.class})
    public ResponseEntity<Object> handleNotFound(Exception ex) {
        return new ResponseEntity<Object>(ex.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND);
    }
}
