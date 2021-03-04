package com.barbara.pereira.vacina.controller;

import com.barbara.pereira.vacina.dto.AplicacaoVacinaDto;
import com.barbara.pereira.vacina.dto.UsuarioDto;
import com.barbara.pereira.vacina.entity.AplicacaoVacina;
import com.barbara.pereira.vacina.entity.Usuario;
import com.barbara.pereira.vacina.repository.AplicacaoVacinaRepository;
import com.barbara.pereira.vacina.services.AplicacaoVacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/aplicacaoVacinas")
public class AplicacaoVacinaController {

    @Autowired
    AplicacaoVacinaService aplicacaoVacinaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AplicacaoVacinaDto incluir(@RequestBody @Valid AplicacaoVacinaDto novaVacinaDto){
        AplicacaoVacina aplicacaoVacina =
                aplicacaoVacinaService.incluirNovaAplicacao(novaVacinaDto.criarNovaVacina());

        return aplicacaoVacina.criarDto();
    }

}
