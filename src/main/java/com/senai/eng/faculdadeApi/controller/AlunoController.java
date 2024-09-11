package com.senai.eng.faculdadeApi.controller;

import com.senai.eng.faculdadeApi.model.Aluno;
import com.senai.eng.faculdadeApi.model.Disciplina;
import com.senai.eng.faculdadeApi.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/aluno")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public List<Aluno> finAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Aluno findById(@PathVariable Integer id) {
        return this.service.findById(id);
    }

    @PostMapping
    public Aluno save(@RequestBody Aluno aluno) {
        try {
            return this.service.save(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping
    public Aluno update(@RequestBody Aluno aluno) {
        return this.service.update(aluno);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        this.service.delete(id);
    }
}
