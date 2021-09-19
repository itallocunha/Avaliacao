package com.partido.Avaliacao.service;

import com.partido.Avaliacao.model.Associado;
import com.partido.Avaliacao.repository.AssociadoRespository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class associadoService {

    @Autowired
    private AssociadoRespository associadoRespositorio;

    public void saveAssociado(Associado associadoForm) {
        associadoRespositorio.save(associadoForm);
    }

    public Associado encontrarAssociadoPorId(String id) {
        Optional<Associado> associado = associadoRespositorio.findById(id);
        return null;
    }

    public Associado putAssociadoPorId(String id) {
        Optional<Associado> associado = associadoRespositorio.findById(id);
        return null;
    }

    public void deleteAssociadoPorId(String id) {
        associadoRespositorio.deleteById(id);
    }

    public List<Associado> encontrarAssociados() {
        List<Associado> associados = associadoRespositorio.findAll();
        return associados;
    }

//    public List<Associado> filtrarAssociadoPorCargo(String cargoPolitico) {
//        List<Associado>associados = associadoRespositorio.findAll(cargoPolitico);
//    return associados;
//    }
}
