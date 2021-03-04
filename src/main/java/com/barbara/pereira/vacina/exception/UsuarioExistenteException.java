package com.barbara.pereira.vacina.exception;

public class UsuarioExistenteException extends RuntimeException{
    public UsuarioExistenteException(){
        super("Esse usuário já existe no sistema");
    }
}
