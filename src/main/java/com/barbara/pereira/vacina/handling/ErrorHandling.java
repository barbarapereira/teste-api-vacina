package com.barbara.pereira.vacina.handling;

import com.barbara.pereira.vacina.exception.AplicacaoVacinaExistenteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandling extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {AplicacaoVacinaExistenteException.class})
    public ResponseEntity<Object> handlerError(AplicacaoVacinaExistenteException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
