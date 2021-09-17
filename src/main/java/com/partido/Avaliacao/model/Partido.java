package com.partido.Avaliacao.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_PARTIDO")
public class Partido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nomeDoPartido;

    private String sigla;

    private String ideologia;

    private Date anoDeFundacao;

    public Partido(long id, String nomeDoPartido, String sigla, String ideologia, Date anoDeFundacao) {
        this.id = id;
        this.nomeDoPartido = nomeDoPartido;
        this.sigla = sigla;
        this.ideologia = ideologia;
        this.anoDeFundacao = anoDeFundacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDoPartido() {
        return nomeDoPartido;
    }

    public void setNomeDoPartido(String nomeDoPartido) {
        this.nomeDoPartido = nomeDoPartido;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getIdeologia() {
        return ideologia;
    }

    public void setIdeologia(String ideologia) {
        this.ideologia = ideologia;
    }

    public Date getAnoDeFundacao() {
        return anoDeFundacao;
    }

    public void setAnoDeFundacao(Date anoDeFundacao) {
        this.anoDeFundacao = anoDeFundacao;
    }
}
