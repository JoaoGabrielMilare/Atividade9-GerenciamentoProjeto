package com.example.Gerenciamento_Projetos.Repository;

import com.example.Gerenciamento_Projetos.Model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
