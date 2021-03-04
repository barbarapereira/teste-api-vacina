package com.barbara.pereira.vacina.dto;

import com.barbara.pereira.vacina.entity.AplicacaoVacina;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class AplicacaoVacinaDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column
    @NotBlank
    @Email
    private String email;

    @Column
    private String nomeDaVacina;

    @Column
    private LocalDate dataDeVacinacao;

    public long getCodigo() { return codigo; }

    public void setCodigo(long codigo) { this.codigo = codigo; }

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

    public AplicacaoVacina criarNovaVacina(){

        return new AplicacaoVacina(this.codigo, this.dataDeVacinacao, this.nomeDaVacina, this.email);
    }
}
