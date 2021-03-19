package com.bruno.Teste_lumini_it_solutions.controllers;

import com.bruno.Teste_lumini_it_solutions.model.Empresa;
import com.bruno.Teste_lumini_it_solutions.model.Endereco;
import com.bruno.Teste_lumini_it_solutions.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/empresa")
public class EmpresaController {

 private EmpresaService empresaService;

    @Autowired
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

  @GetMapping("/{Cnpj}")
  @ResponseBody
    public ResponseEntity getEmpresaByCnpj(@PathVariable  String cnpj){
        Empresa empresa = empresaService.buscarCnpj(cnpj);
            return ResponseEntity.ok().body(empresa);


    }



}
