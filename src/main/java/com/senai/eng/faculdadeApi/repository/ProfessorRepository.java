package com.senai.eng.faculdadeApi.repository;

import com.senai.eng.faculdadeApi.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
