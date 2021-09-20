package com.partido.Avaliacao.controller;

import com.partido.Avaliacao.model.Associado;
import com.partido.Avaliacao.service.associadoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/associado")
@Api(value = "API REST ASSOCIADO")
@CrossOrigin(origins = "*")
public class associadoController {

    @Autowired
    private associadoService associadoServ;

    @PostMapping("/")
    @ApiOperation(value= "INSERE UM UNICO ASSOCIADO")
    public ResponseEntity <Associado> postNewAssociado(@RequestBody Associado associadoForm) throws ParseException{
        associadoServ.saveAssociado(associadoForm);
        return ResponseEntity.ok().body(associadoForm);
    }
//    POST - /associados/partidos (Vincula um associado a um partido, body: {idAssociado: '10',
//            idPartido: '10'})

//    @PostMapping("/associado/{id}/partido/{id}")
//    public ResponseEntity <Associado> postVinculaAssociadoPartido(@PathVariable String id, @RequestBody Partido partido)throws ParseException{
//        associadoServ.saveAssociado();
//        return ResponseEntity.ok().body(associado);
//    }

//    @GetMapping("/cargoPolitico/{cargoPolitico}")
//    public ResponseEntity <List<Associado>> listarAssociadoPeloCargo(@PathVariable String cargoPolitico)throws ParseException{
//        List<Associado> listaAssociado = associadoServ.filtrarAssociadoPorCargo(cargoPolitico);
//        return ResponseEntity.ok().body(listaAssociado);
//    }
    @GetMapping("/{id}")
    @ApiOperation(value= "BUSCA UM ASSOCIADO")
    public ResponseEntity <Associado> listaAssociadoPorId(@PathVariable String id)throws ParseException{
        Associado associados = associadoServ.encontrarAssociadoPorId(id);
        return ResponseEntity.ok().body(associados);
    }
    @PutMapping("/{id}")
    @ApiOperation(value= "ATUALIZA UM ASSOCIADO PELO ID")
    public ResponseEntity <Associado> putAssociadoPorIn(@PathVariable String id,@RequestBody Associado formAssociado)throws ParseException{
       Associado associados = associadoServ.putAssociadoPorId(id);
       return ResponseEntity.ok().body(associados);

    }
    @DeleteMapping("/{id}")
    @ApiOperation(value= "DELETA UM ASSOCIADO PELO ID")
    public ResponseEntity <List<Associado>> deletePorId(@PathVariable String id)throws ParseException{
        associadoServ.deleteAssociadoPorId(id);
        List<Associado> associadoList = associadoServ.encontrarAssociados();
        return ResponseEntity.ok().body(associadoList);
    }
//    DELETE - /associados/{id}/partidos/{id} (Remove determinado associado daquele partido)

}
