package com.bruno.Teste_lumini_it_solutions.controllers;

import com.bruno.Teste_lumini_it_solutions.model.Empresa;
import com.bruno.Teste_lumini_it_solutions.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/empresa")
@CrossOrigin("http://localhost:4200")
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
