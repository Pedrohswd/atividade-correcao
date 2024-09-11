package com.senai.eng.faculdadeApi.controller;

import com.senai.eng.faculdadeApi.model.Disciplina;
import com.senai.eng.faculdadeApi.model.Turma;
import com.senai.eng.faculdadeApi.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "api/disciplina")
public class DisciplinaController {

    @Autowired
    private DisciplinaService service;

    @GetMapping
    public List<Disciplina> finAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Disciplina findById(@PathVariable Integer id) {
        return this.service.findById(id);
    }

    @PostMapping
    public Disciplina save(@RequestBody Disciplina aluno) {
        try {
            return this.service.save(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping
    public Disciplina update(@RequestBody Disciplina aluno) {
        return this.service.update(aluno);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        this.service.delete(id);
    }
}
