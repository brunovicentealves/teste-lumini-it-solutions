package com.bruno.Teste_lumini_it_solutions.service;

import com.bruno.Teste_lumini_it_solutions.model.Endereco;
import com.bruno.Teste_lumini_it_solutions.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco buscarEnderecoCnpj(Integer id ){

        return  enderecoRepository.findById(id).get();


    }
}
