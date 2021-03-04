package com.barbara.pereira.vacina.dto;

import com.barbara.pereira.vacina.entity.Usuario;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class UsuarioDto {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String cpf;

    private String nome;

    private LocalDate dataDeNascimento;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Usuario criarUsuario(){

        return new Usuario(this.email, this.cpf, this.nome, this.dataDeNascimento);
    }


}
