package com.MarketPlace.MarketAppPoo.controller;

import org.springframework.web.bind.annotation.*;

@RestController // Anotação que mostra que será um controller
public class ControllerUser {

    @GetMapping("") // GetMapping para busar essa informação e mostrar
    public String hello() {
        return "Hello motherFucker";

    }
    @GetMapping("/monster/{name}")
    public String monster (@PathVariable String name) { //para mudar o nome na rota
        return "I are a monster " + name;
    }

    @PostMapping("/user")
    // Buscar variáveis do model
    public ControllerUser controllerUser(@RequestBody ControllerUser body) {

        return body;
    }
}
