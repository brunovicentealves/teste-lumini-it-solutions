package com.bruno.Teste_lumini_it_solutions.service;

import com.bruno.Teste_lumini_it_solutions.model.Media;
import org.springframework.stereotype.Service;

@Service
public class ServiceMedia {

    public Media CalcularMedia(Media media){
        media.setMediaValores((media.getValorUm()+media.getValorDois()) / 2);
        return media ;
    }

}
