package com.bruno.Teste_lumini_it_solutions.service;

import com.bruno.Teste_lumini_it_solutions.model.Empresa;
import com.bruno.Teste_lumini_it_solutions.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaService {

    private EmpresaRepository empresaRepository ;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public void salvar(Empresa empresa){
        empresaRepository.save(empresa);
    }


    public Empresa buscarCnpj(String cnpj){

        return empresaRepository.findByCnpj(cnpj);


    }
}
