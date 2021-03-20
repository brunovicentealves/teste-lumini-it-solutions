package com.bruno.Teste_lumini_it_solutions.controllers;
import com.bruno.Teste_lumini_it_solutions.model.Empresa;
import com.bruno.Teste_lumini_it_solutions.service.EmpresaService;
import com.bruno.Teste_lumini_it_solutions.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/endereco")
@CrossOrigin("http://localhost:4200")
public class EnderecoController {


    private EnderecoService enderecoService;
    private EmpresaService empresaService;

    @Autowired
    public EnderecoController(EnderecoService enderecoService, EmpresaService empresaService) {
        this.enderecoService = enderecoService;
        this.empresaService = empresaService;
    }

    @GetMapping("/{cnpj}")
    @ResponseBody
    public ResponseEntity getEnderecoByCnpj(@PathVariable String cnpj){
        Optional<Empresa> empresa = Optional.ofNullable(enderecoService.buscarEnderecoCnpj(cnpj));
        if(empresa.isPresent()){
            return  ResponseEntity.ok().body(empresa.get().getEndereco());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não esta cadastrado esse Cnpj!");

    }



}
