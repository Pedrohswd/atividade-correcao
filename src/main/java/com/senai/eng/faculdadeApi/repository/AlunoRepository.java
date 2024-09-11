package com.senai.eng.faculdadeApi.repository;

import com.senai.eng.faculdadeApi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
