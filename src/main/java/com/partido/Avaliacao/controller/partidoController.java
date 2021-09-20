package com.partido.Avaliacao.controller;

import com.partido.Avaliacao.model.Partido;
import com.partido.Avaliacao.service.partidoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/partido")
@Api(value = "API REST PARTIDO")
@CrossOrigin(origins = "*")
public class partidoController {


    @Autowired
    private partidoService partidoServ;

    @PostMapping("/")
    @ApiOperation(value= "INSERE UM UNICO PARTIDO")
    public ResponseEntity <Partido> postNovoPartido(@RequestBody Partido partidoForm) throws ParseException{
        partidoServ.savePartido(partidoForm);
        return ResponseEntity.ok().body(partidoForm);
    }
    // GET - /partidos (Ter uma opção de filtrar partidos de acordo com sua ideologia)

//    @GetMapping("/ideologia/{ideologia}")
//    public ResponseEntity <Partido> listarPartidoPorIdeologia(@PathVariable String ideologia)throws ParseException{
//        List<Partido> partido = partidoServ.filtrarPorIdeologia(ideologia);
//        return ResponseEntity.ok().body(partido);
//    }

    @GetMapping("/{id}")
    @ApiOperation(value= "BUSCA UM PARTIDO POR ID")
    public ResponseEntity <Partido> retornaPartido(@PathVariable String id) throws ParseException{
        Partido partido = partidoServ.retornaPartidoPorId(id);
        return ResponseEntity.ok().body(partido);
    }
//    @GetMapping("/{id}/associados")
//    public ResponseEntity <List<Associado>> retornaListaAssociadosDoPartido(@PathVariable String id) throws ParseException{
//        Optional <Partido> partido = partidoServ.retornaPartidoId(id);
//        return ResponseEntity.notFound().build();
//    }

    @PutMapping("/{id}")
    @ApiOperation(value= "ATUALIZA UM PARTIDO PELO ID")
    public ResponseEntity <Partido> atualizaPartidoPorId(@PathVariable String id,@RequestBody Partido formPartido) throws ParseException{
        Partido partido = partidoServ.putPartidoPorId(id,formPartido);
        return ResponseEntity.ok().body(partido);
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value= "DELETA UM PARTIDO PELO ID")
    public ResponseEntity <List<Partido>> deletePartidoPeloId(@PathVariable String id)throws ParseException{
        partidoServ.deletePartidoPorId(id);
        List<Partido> partidoList = partidoServ.encontrarPartido();
        return ResponseEntity.ok().body(partidoList);
    }
}
