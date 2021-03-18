package com.bruno.Teste_lumini_it_solutions.controllers;
import com.bruno.Teste_lumini_it_solutions.model.Empresa;
import com.bruno.Teste_lumini_it_solutions.model.Endereco;
import com.bruno.Teste_lumini_it_solutions.service.EmpresaService;
import com.bruno.Teste_lumini_it_solutions.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/endereco")
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
        Empresa empresa = empresaService.buscarCnpj(cnpj);
        Endereco endereco  = empresa.getEndereco();

        return ResponseEntity.ok().body(endereco);
    }



}
