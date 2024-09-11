package com.senai.eng.faculdadeApi.controller;

import com.senai.eng.faculdadeApi.model.Professor;
import com.senai.eng.faculdadeApi.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @GetMapping
    public List<Professor> finAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Professor findById(@PathVariable Integer id) {
        return this.service.findById(id);
    }

    @PostMapping
    public Professor save(@RequestBody Professor aluno) {
        return this.service.save(aluno);
    }

    @PutMapping
    public Professor update(@RequestBody Professor aluno) {
        try {
            return this.service.update(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        this.service.delete(id);
    }
}
