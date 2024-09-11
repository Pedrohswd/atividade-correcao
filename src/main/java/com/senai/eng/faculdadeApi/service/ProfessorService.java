package com.senai.eng.faculdadeApi.service;

import com.senai.eng.faculdadeApi.model.Aluno;
import com.senai.eng.faculdadeApi.model.Professor;
import com.senai.eng.faculdadeApi.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public List<Professor> findAll() {
        return this.repository.findAll();
    }

    public Professor findById(Integer id) {
        return this.repository.findById(id).orElseThrow();
    }

    public Professor save(Professor aluno) {
        return this.repository.save(aluno);
    }

    public Professor update(Professor aluno) throws Exception {

        if (aluno.equals(new Aluno())){
            throw new Exception("Aluno inexistente");
        }
        return this.repository.save(aluno);
    }

    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}
