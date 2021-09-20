package com.partido.Avaliacao.service;

import com.partido.Avaliacao.model.Partido;
import com.partido.Avaliacao.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class partidoService {

    @Autowired
    private PartidoRepository partidoRepository;

    public void savePartido(Partido partidoForm) {
        partidoRepository.save(partidoForm);
    }

    public Partido retornaPartidoPorId(String id) {
        Optional<Partido> partido = partidoRepository.findById(id);
        return partido.orElseThrow();
    }

    public Partido putPartidoPorId(String id, Partido formPartido) {
        Partido novoPartido = encontrarPeloId(id);
        novoPartido.setNomeDoPartido(formPartido.getNomeDoPartido());
        novoPartido.setSigla(formPartido.getSigla());
        novoPartido.setIdeologia(formPartido.getIdeologia());
        novoPartido.setAnoDeFundacao(formPartido.getAnoDeFundacao());
        return partidoRepository.save(novoPartido);
    }

    private Partido encontrarPeloId(String id) {
        Optional<Partido> partido = partidoRepository.findById(id);
        return partido.orElseThrow();
    }

    public void deletePartidoPorId(String id) {
        partidoRepository.deleteById(id);
    }

    public List<Partido> encontrarPartido() {
        List<Partido> partido = partidoRepository.findAll();
        partidoRepository.findAll();
        return partido;
    }


//    public List<Partido> filtrarPorIdeologia(String ideologia) {
//    List<Partido>partido = partidoRepository.listarPartidoPorIdeologia(ideologia);
//        return partido;
//    }
}
