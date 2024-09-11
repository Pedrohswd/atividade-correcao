package com.senai.eng.faculdadeApi.service;

import com.senai.eng.faculdadeApi.model.Turma;
import com.senai.eng.faculdadeApi.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository repository;

    public List<Turma> findAll() {
        return this.repository.findAll();
    }

    public Turma findById(Integer id) {
        return this.repository.findById(id).orElseThrow();
    }

    public Turma save(Turma aluno) {
        return this.repository.save(aluno);
    }

    public Turma update(Turma aluno) {
        return this.repository.save(aluno);
    }

    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}
