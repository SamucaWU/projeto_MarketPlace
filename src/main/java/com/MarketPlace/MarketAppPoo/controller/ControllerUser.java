// Desenvolved by Samuel M. Dias🕷
package com.MarketPlace.MarketAppPoo.controller;

import com.MarketPlace.MarketAppPoo.model.ModelUser;
<<<<<<< HEAD
import com.MarketPlace.MarketAppPoo.model.Produtos;
=======
>>>>>>> b093e86f6bc61f37116c141fa5527bce07251149
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

<<<<<<< HEAD

    @PostMapping
=======
    @PostMapping("/Cadastrar")
>>>>>>> b093e86f6bc61f37116c141fa5527bce07251149
    public String cadastrarUsuario(@ModelAttribute("usuarios") ModelUser modelUser) { // Método de cadastro
        userService.saveUser(modelUser);
        return "redirect:/cadastrarPessoa";
    }

<<<<<<< HEAD
    @GetMapping
    public String listarUsuario(Model model) {
        List<ModelUser> usuarios = userService.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
=======
    @GetMapping("/cadastroUsuario")
    public String listarUsuario(Model model) {
;
>>>>>>> b093e86f6bc61f37116c141fa5527bce07251149
        model.addAttribute("usuarios", new ModelUser());
        return "UserForCadaster";
    }

}
