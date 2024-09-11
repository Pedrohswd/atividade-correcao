package com.senai.eng.faculdadeApi.model;


import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String turma;

    private String descricao;

    @OneToMany
    @JoinColumn
    private Set<Disciplina> disciplinas;

    public Turma() {
    }

    public Turma(Integer id, String turma, String descricao) {
        this.id = id;
        this.turma = turma;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", turma='" + turma + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma1 = (Turma) o;
        return Objects.equals(id, turma1.id) && Objects.equals(turma, turma1.turma) && Objects.equals(descricao, turma1.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, turma, descricao);
    }
}
