package com.bruno.Teste_lumini_it_solutions.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;

    @NotBlank(message = "Campo Obrigatório")
    private String nomeEmpresa;

    @CNPJ
    @NotBlank(message = "Campo Obrigatório")
    private String cnpj;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
}
