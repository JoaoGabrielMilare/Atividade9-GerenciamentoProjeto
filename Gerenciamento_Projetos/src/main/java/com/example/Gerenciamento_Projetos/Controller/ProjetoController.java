package com.example.Gerenciamento_Projetos.Controller;

import com.example.Gerenciamento_Projetos.Model.Projeto;
import com.example.Gerenciamento_Projetos.Services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService service;

    @PostMapping
    public Projeto criarProjeto(@RequestBody Projeto projeto) {
        return service.criarProjeto(projeto);
    }

    @GetMapping
    public List<Projeto> listarProjetos() {
        return service.listarProjetos();
    }

    @GetMapping("/{id}")
    public Projeto buscarPorId(@PathVariable Long id) {
        return service.buscarProjetoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        service.deletarProjetoPorId(id);
    }
}
