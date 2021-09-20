package com.partido.Avaliacao.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Entity
@RequiredArgsConstructor
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

}
