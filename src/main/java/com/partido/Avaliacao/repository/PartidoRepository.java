package com.partido.Avaliacao.repository;

import com.partido.Avaliacao.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PartidoRepository extends JpaRepository<Partido,String> {

//    @Query("SELECT obj FROM partido obj WHERE obj.id != null")
//    List<Partido> findPartidoLista();

//   @Query("SELECT obj FROM partido obj WHERE obj.ideologia = :recevideologia")
//    List<Partido> listarPartidoPorIdeologia(@Param("recevideologia") String ideologia);
}
