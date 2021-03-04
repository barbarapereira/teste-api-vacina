package com.barbara.pereira.vacina.controller;

import com.barbara.pereira.vacina.dto.AplicacaoVacinaDto;
import com.barbara.pereira.vacina.dto.UsuarioDto;
import com.barbara.pereira.vacina.entity.AplicacaoVacina;
import com.barbara.pereira.vacina.entity.Usuario;
import com.barbara.pereira.vacina.services.AplicacaoVacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aplicacaoVacinas")
public class AplicacaoVacinaController {

    @Autowired
    AplicacaoVacinaService aplicacaoVacinaService;

    @PostMapping
    public AplicacaoVacinaDto incluir(@RequestBody AplicacaoVacinaDto novaVacinaDto){
        AplicacaoVacina aplicacaoVacina =
                aplicacaoVacinaService.incluirNovaAplicacao(novaVacinaDto.criarNovaVacina());

        return aplicacaoVacina.criarDto();
    }

}
