package com.partido.Avaliacao.model;

import lombok.*;


import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Entity
@Table(name = "TB_ASSOCIADO")
public class Associado {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false,length = 20)
    private String nome;

    @Column(name = "cargoPolitico", nullable = false,length = 20)
    private String cargoPolitico;

    @Column(name = "anoDeNascimento", nullable = false,length = 20)
    private Date anoDeNascimento;

    @Column(name = "sexo", nullable = false, length = 20)
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "partido_id")
    private Partido partido;

    public Associado(){
    }

    public Associado(String nome, String cargoPolitico, Date anoDeNascimento, String sexo) {
        this.nome = nome;
        this.cargoPolitico = cargoPolitico;
        this.anoDeNascimento = anoDeNascimento;
        this.sexo = sexo;
    }
}
