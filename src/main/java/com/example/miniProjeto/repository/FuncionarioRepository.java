package com.example.miniProjeto.repository;

import com.example.miniProjeto.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    List<Funcionario> findByNomeContainingIgnoreCase(String nome);
    List<Funcionario> findBySalarioGreaterThan(Double Salario);
}
