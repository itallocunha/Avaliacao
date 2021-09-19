package com.partido.Avaliacao.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "TB_PARTIDO")
public class Partido implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nomeDoPartido", nullable = false,length = 20)
    private String nomeDoPartido;

    @Column(name = "sigla", nullable = false,length = 20)
    private String sigla;

    @Column(name = "ideologia", nullable = false,length = 20)
    private String ideologia;

    @Column(name = "anoDeFundacao", nullable = false,length = 20)
    private Date anoDeFundacao;

    @OneToMany(mappedBy = "partido")
    private List<Associado> associados;

    public Partido(String nomeDoPartido, String sigla, String ideologia, Date anoDeFundacao) {
        this.nomeDoPartido = nomeDoPartido;
        this.sigla = sigla;
        this.ideologia = ideologia;
        this.anoDeFundacao = anoDeFundacao;
    }
}
