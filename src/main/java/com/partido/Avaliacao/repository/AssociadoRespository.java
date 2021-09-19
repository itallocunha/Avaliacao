package com.partido.Avaliacao.repository;

import com.partido.Avaliacao.model.Associado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssociadoRespository extends JpaRepository <Associado,String> {


//    @Query("SELECT obj FROM associado obj WHERE obj.cargoPolitico = :recevCargoPolitico")
//    List<Associado> findAll(@Param("recevCargoPolitico") String cargoPolitico);


}
