package com.bruno.Teste_lumini_it_solutions.controllers;

import com.bruno.Teste_lumini_it_solutions.model.Media;
import com.bruno.Teste_lumini_it_solutions.service.ServiceMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/media")
@CrossOrigin("http://localhost:4200")
public class ControllerMedia {


    private ServiceMedia serviceMedia;

    @Autowired
    public ControllerMedia(ServiceMedia serviceMedia) {
        this.serviceMedia = serviceMedia;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity save( @RequestBody Media media){
        Media mediafinal = serviceMedia.CalcularMedia(media);
        return ResponseEntity.ok(mediafinal);
    }

}
