package com.example.demoritchie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping
    public String Hola(){
        return "Hola Mundo estroy deployando este programa en mi server jenkins";
    }
}

//otra prueba
