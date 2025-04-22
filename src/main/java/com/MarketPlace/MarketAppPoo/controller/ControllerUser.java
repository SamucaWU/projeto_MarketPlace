// Desenvolved by Samuel M. Dias🕷
package com.MarketPlace.MarketAppPoo.controller;

import com.MarketPlace.MarketAppPoo.model.ModelUser;
import com.MarketPlace.MarketAppPoo.model.Produtos;
import com.MarketPlace.MarketAppPoo.repository.UserRepository;
import com.MarketPlace.MarketAppPoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class ControllerUser {

    @Autowired
    private UserService userService;// Chamamento do service e suas funções


    // Método para mostrar a página de login
    @GetMapping("/login")
    public String login() {
        return "login"; // Retorna o nome da página de login (login.html)
    }


    // Método para mostrar a página de cadastro de usuário
    @GetMapping("/cadastro")
    public String listarUsuario(Model model) {
        model.addAttribute("user", new ModelUser());// Cria um novo objeto ModelUser para o formulário
        return "usercadaster"; // Retorna a página de cadastro (usercadaster.html)
    }


    // Método para salvar o novo usuário após o cadastro
    @PostMapping("/salvar")
    public String cadastrarUsuario(@ModelAttribute ModelUser modelUser) { // Método de cadastro
        userService.salvar(modelUser); // Chama o serviço para salvar o usuário
        return "redirect:/login?sucesso";// Redireciona para a página de login com a mensagem de sucesso
    }



    //@RestController // Teste Ralf Lima
    //public class atalho {

      //  @Autowired
        //private UserRepository acao;
        //@PostMapping("/a")
        //public ModelUser cadastrar(@RequestBody ModelUser obj) {
          //  return acao.save(obj);
        //}

        //@GetMapping("/buscar")
        //public List<ModelUser> selecionar() {
          //  return acao.findAll();
       // }
    }


