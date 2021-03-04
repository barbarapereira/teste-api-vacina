package com.barbara.pereira.vacina.entity;

import com.barbara.pereira.vacina.dto.UsuarioDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Column
    @NotBlank
    @Email
    private String email;

    @Column
    @NotBlank
    private String cpf;

    @Column
    private String nome;

    @Column
    private LocalDate dataDeNascimento;

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Usuario(@NotBlank String email, @NotBlank String cpf, String nome, LocalDate dataDeNascimento) {
        this.email = email;
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public UsuarioDto criarDto(){
        UsuarioDto dto = new UsuarioDto();
        dto.setEmail(this.getEmail());
        dto.setCpf(this.getCpf());
        dto.setNome(this.getNome());
        dto.setDataDeNascimento(this.getDataDeNascimento());
        return dto;
    }
}
