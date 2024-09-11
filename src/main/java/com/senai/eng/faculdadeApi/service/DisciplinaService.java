package com.senai.eng.faculdadeApi.service;

import com.senai.eng.faculdadeApi.model.Aluno;
import com.senai.eng.faculdadeApi.model.Disciplina;
import com.senai.eng.faculdadeApi.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> findAll() {
        return this.repository.findAll();
    }

    public Disciplina findById(Integer id) {
        return this.repository.findById(id).orElseThrow();
    }

    public Disciplina save(Disciplina aluno) throws Exception {
        if (aluno.equals(new Aluno())){
            throw new Exception("Aluno inexistente");
        }
        return this.repository.save(aluno);
    }

    public Disciplina update(Disciplina aluno) {
        return this.repository.save(aluno);
    }

    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}
