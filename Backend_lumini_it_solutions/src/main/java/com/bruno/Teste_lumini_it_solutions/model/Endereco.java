package com.bruno.Teste_lumini_it_solutions.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;

    @NotBlank(message = "Campo Obrigatório")
    private String rua;

    @NotBlank(message = "Campo Obrigatório")
    private String bairro;

    @NotNull
    private Integer numero;

    @NotNull
    @Size(min=2 ,max = 2)
    private String estado;


    @NotNull
    private String Cep;

}
