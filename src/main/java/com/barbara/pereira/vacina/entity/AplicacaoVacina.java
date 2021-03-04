package com.barbara.pereira.vacina.entity;

import com.barbara.pereira.vacina.dto.AplicacaoVacinaDto;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "aplicacaoVacina")
public class AplicacaoVacina {

    @Column
    @NotBlank
    @Email
    private String email;

    @Column
    private String nomeDaVacina;

    @Column
    private LocalDate dataDeVacinacao;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeDaVacina() {
        return nomeDaVacina;
    }

    public void setNomeDaVacina(String nomeDaVacina) {
        this.nomeDaVacina = nomeDaVacina;
    }

    public LocalDate getDataDeVacinacao() {
        return dataDeVacinacao;
    }

    public void setDataDeVacinacao(LocalDate dataDeVacinacao) {
        this.dataDeVacinacao = dataDeVacinacao;
    }

    public AplicacaoVacina(LocalDate dataDeVacinacao, String nomeDaVacina, @Email @NotBlank String email) {
        this.nomeDaVacina = nomeDaVacina;
        this.dataDeVacinacao = dataDeVacinacao;
        this.email = email;
    }

    public AplicacaoVacinaDto criarDto(){
        AplicacaoVacinaDto dto = new AplicacaoVacinaDto();
        dto.setDataDeVacinacao(this.getDataDeVacinacao());
        dto.setNomeDaVacina(this.getNomeDaVacina());
        dto.setEmail(this.getEmail());
        return dto;
    }

}
