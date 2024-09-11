package com.senai.eng.faculdadeApi.controller;

import com.senai.eng.faculdadeApi.model.Professor;
import com.senai.eng.faculdadeApi.model.Turma;
import com.senai.eng.faculdadeApi.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/turma")
public class TurmaController {

    @Autowired
    private TurmaService service;

    @GetMapping
    public List<Turma> finAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Turma findById(@PathVariable Integer id) {
        return this.service.findById(id);
    }

    @PostMapping
    public Turma save(@RequestBody Turma aluno) {
        return this.service.save(aluno);
    }

    @PutMapping
    public Turma update(@RequestBody Turma aluno) {
        return this.service.update(aluno);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        this.service.delete(id);
    }
}
