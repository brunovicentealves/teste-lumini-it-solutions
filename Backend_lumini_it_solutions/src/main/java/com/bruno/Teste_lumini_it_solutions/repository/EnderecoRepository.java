package com.bruno.Teste_lumini_it_solutions.repository;

import com.bruno.Teste_lumini_it_solutions.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {


}
