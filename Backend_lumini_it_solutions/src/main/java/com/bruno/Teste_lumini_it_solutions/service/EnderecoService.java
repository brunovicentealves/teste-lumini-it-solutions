package com.bruno.Teste_lumini_it_solutions.service;

import com.bruno.Teste_lumini_it_solutions.model.Empresa;
import com.bruno.Teste_lumini_it_solutions.model.Endereco;
import com.bruno.Teste_lumini_it_solutions.repository.EmpresaRepository;
import com.bruno.Teste_lumini_it_solutions.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    private EnderecoRepository enderecoRepository;
    private EmpresaRepository empresaRepository;

    public EnderecoService(EnderecoRepository enderecoRepository, EmpresaRepository empresaRepository) {
        this.enderecoRepository = enderecoRepository;
        this.empresaRepository = empresaRepository;
    }

    public Empresa buscarEnderecoCnpj(String cnpj ){

            return  empresaRepository.findByCnpj(cnpj);
    }
}
