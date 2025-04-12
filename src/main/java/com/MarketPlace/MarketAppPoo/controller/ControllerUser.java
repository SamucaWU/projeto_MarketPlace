// Desenvolved by Samuel M. Dias🕷
package com.MarketPlace.MarketAppPoo.controller;

import com.MarketPlace.MarketAppPoo.model.ModelUser;
import com.MarketPlace.MarketAppPoo.model.Produtos;
import com.MarketPlace.MarketAppPoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/cadastrarPessoa")// Anotação que mostra que será um controller
public class ControllerUser {

    @Autowired
    private UserService userService;// Chamamento do repository e suas funções


    @PostMapping
    public String cadastrarUsuario(@ModelAttribute("usuarios") ModelUser modelUser) { // Método de cadastro
        userService.saveUser(modelUser);
        return "redirect:/cadastrarPessoa";
    }

    @GetMapping
    public String listarUsuario(Model model) {
        List<ModelUser> usuarios = userService.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("usuarios", new ModelUser());
        return "UserForCadaster";
    }

}
