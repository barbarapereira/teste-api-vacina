package com.barbara.pereira.vacina.exception;

public class AplicacaoVacinaExistenteException extends RuntimeException{

    public AplicacaoVacinaExistenteException(){

        super("Esta vacina não existe no sistema");
    }
}
