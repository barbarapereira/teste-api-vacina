package com.barbara.pereira.vacina.controller;

import com.barbara.pereira.vacina.dto.UsuarioDto;
import com.barbara.pereira.vacina.entity.Usuario;
import com.barbara.pereira.vacina.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto incluir(@RequestBody UsuarioDto novoUsuarioDto){
        Usuario usuario = usuarioService.incluirUsuario(novoUsuarioDto.criarUsuario());

        return usuario.criarDto();
    }

}
