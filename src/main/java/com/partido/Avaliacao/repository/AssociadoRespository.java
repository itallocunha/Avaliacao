package com.partido.Avaliacao.repository;

import com.partido.Avaliacao.model.Associado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AssociadoRespository extends JpaRepository <Associado,String> {

//    @Query("SELECT obj FROM associado obj WHERE obj.cargoPolitico = :recevCargoPolitico")
//    List<Associado> findAll(@Param("recevCargoPolitico") String cargoPolitico);


}
