package com.bruno.Teste_lumini_it_solutions.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
public class Media {

    @NotEmpty(message = "Campo Obrigatorio !")
    private double valorUm;

    @NotEmpty(message = "Campo Obrigatorio !")
    private double valorDois;

    private Double mediaValores;


}
