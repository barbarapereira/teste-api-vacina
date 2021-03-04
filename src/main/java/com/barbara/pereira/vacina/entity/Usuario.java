package com.barbara.pereira.vacina.entity;

import com.barbara.pereira.vacina.dto.UsuarioDto;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Column
    @NotBlank
    @Id
    private String cpf;

    @Column
    @NotBlank
    @Email
    private String email;

    @Column
    private String nome;

    @Column
    private LocalDate dataDeNascimento;

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Usuario(@NotBlank String email, @NotBlank String cpf, String nome, LocalDate dataDeNascimento) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public UsuarioDto criarDto(){
        UsuarioDto dto = new UsuarioDto();
        dto.setCpf(this.getCpf());
        dto.setEmail(this.getEmail());
        dto.setNome(this.getNome());
        dto.setDataDeNascimento(this.getDataDeNascimento());
        return dto;
    }

    public Usuario(){

    }
}
