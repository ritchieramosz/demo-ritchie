package com.example.demoritchie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping
    public String Hola(){
        return "Hola Mundo Soy Ricardo Ramos Vega próximo DevOps, Jenkinsfile test, esta es la segunda prueba con el docker ya integrado en el CI jsfodfoj";
    }
}
