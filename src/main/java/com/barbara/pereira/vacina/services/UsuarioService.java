package com.barbara.pereira.vacina.services;

import com.barbara.pereira.vacina.entity.Usuario;
import com.barbara.pereira.vacina.exception.UsuarioExistenteException;
import com.barbara.pereira.vacina.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario incluirUsuario(Usuario novoUsuario) {
            Optional<Usuario> usuarioExistente =
                    usuarioRepository.findBYEmail(novoUsuario.getEmail());
            if (usuarioExistente.isPresent()){
                throw new UsuarioExistenteException();
            }
            novoUsuario = usuarioRepository.save(novoUsuario);
            return novoUsuario;
    }
}
