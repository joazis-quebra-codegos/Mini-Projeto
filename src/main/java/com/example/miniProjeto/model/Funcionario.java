package com.example.miniProjeto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Getter
@Setter
@Table(name = "TBFUNCIONARIO")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Preencha o nome do produto")
    @Column(unique = true, nullable = false)
    private String nome;

    @NotBlank(message = "Tem que preencher o cargo")
    private String cargo;

    @NotBlank(message = "Tem que ter email")
    @Column(unique = true, nullable = false)
    private String email;

    @NotNull(message = "Tem que ter salário")
    @Positive
    private Double salario;
}
