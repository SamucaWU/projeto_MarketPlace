// Desenvolved by Rafael Paiva 🔥

package com.MarketPlace.MarketAppPoo.controller;

import com.MarketPlace.MarketAppPoo.model.Produtos;
import com.MarketPlace.MarketAppPoo.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService; // Chamamento de ProdutosService
    @GetMapping
    public String listarProduto(Model model){
        List<Produtos> produtos = produtosService.listarProdutos();
        model.addAttribute("produtos", produtos);
        model.addAttribute("produto", new Produtos());
        return  "produtos";
    }

    @PostMapping
    public String cadastrarProduto(Produtos produtos){
        produtosService.salvarProduto(produtos);
        return "redirect:/produtos";
    }

}
@Controller
@RequestMapping("/produtos/lista")
<<<<<<< HEAD
class
ListarProdutos{
=======
class  ListarProdutos{
>>>>>>> b093e86f6bc61f37116c141fa5527bce07251149
    @Autowired
    private ProdutosService produtosService;
    @GetMapping
    public String ListarProdutos(Model model){
        List<Produtos> listaprodutos = produtosService.listarProdutos();
        model.addAttribute("listaprodutos", listaprodutos);
        return  "listaprodutos";
    }
}