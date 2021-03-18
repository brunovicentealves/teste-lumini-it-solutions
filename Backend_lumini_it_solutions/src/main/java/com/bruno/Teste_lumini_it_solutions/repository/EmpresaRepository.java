package com.bruno.Teste_lumini_it_solutions.repository;

import com.bruno.Teste_lumini_it_solutions.model.Empresa;
import jdk.nashorn.internal.ir.Optimistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {

    Empresa findByCnpj(String cnpj);
}
