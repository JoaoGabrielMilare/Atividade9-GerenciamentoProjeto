package com.example.Gerenciamento_Projetos.Services;

import com.example.Gerenciamento_Projetos.Model.Projeto;
import com.example.Gerenciamento_Projetos.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository repository;

    public Projeto criarProjeto(Projeto projeto) {
        return repository.save(projeto);
    }

    public List<Projeto> listarProjetos() {
        return repository.findAll();
    }

    public Projeto buscarProjetoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarProjetoPorId(Long id) {
        repository.deleteById(id);
    }
}
