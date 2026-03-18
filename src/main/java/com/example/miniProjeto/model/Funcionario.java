package com.example.miniProjeto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBFUNCIONARIO")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Preencha o nome do produto")
    private String nome;

    @NotNull(message = "Tem que preencher o cargo")
    private String cargo;

    @NotNull(message = "Tem que ter email")
    private String email;

    @NotNull()
}
