package com.example.miniProjeto.service;

import com.example.miniProjeto.controller.FuncionarioController;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class FuncionarioService {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service){this.service = service;}

    @GetMapping


}
