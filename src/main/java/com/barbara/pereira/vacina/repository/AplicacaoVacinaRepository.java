package com.barbara.pereira.vacina.repository;

import com.barbara.pereira.vacina.entity.AplicacaoVacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AplicacaoVacinaRepository extends JpaRepository<AplicacaoVacina, Long> {
    @Query("SELECT av FROM AplicacaoVacina av WHERE av.nomeDaVacina=:nomeDaVacina")
    Optional<AplicacaoVacina> findByNomeDaVacina(@Param("nomeDaVacina") String nomeDaVacina);
}
