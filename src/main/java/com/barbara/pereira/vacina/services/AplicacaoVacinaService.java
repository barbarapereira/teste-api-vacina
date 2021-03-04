package com.barbara.pereira.vacina.services;

import com.barbara.pereira.vacina.entity.AplicacaoVacina;
import com.barbara.pereira.vacina.exception.AplicacaoVacinaExistenteException;
import com.barbara.pereira.vacina.repository.AplicacaoVacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AplicacaoVacinaService {
    @Autowired
    AplicacaoVacinaRepository aplicacaoVacinaRepository;

    public AplicacaoVacina incluirNovaAplicacao(AplicacaoVacina novaVacina){
        Optional<AplicacaoVacina> vacinaExistente =
                aplicacaoVacinaRepository.findByNomeDaVacina(novaVacina.getNomeDaVacina());
        if(vacinaExistente.isPresent()){
            throw new AplicacaoVacinaExistenteException();
        }
        novaVacina = aplicacaoVacinaRepository.save(novaVacina);
        return novaVacina;
    }
}
