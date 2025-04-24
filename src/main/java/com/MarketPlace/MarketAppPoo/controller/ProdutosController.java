package com.MarketPlace.MarketAppPoo.controller;

import com.MarketPlace.MarketAppPoo.model.Produtos;
import com.MarketPlace.MarketAppPoo.repository.ProdutoRepository;
import com.MarketPlace.MarketAppPoo.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public String listarProduto(Model model) {
        List<Produtos> produtos = produtosService.listarProdutos();
        model.addAttribute("produtos", produtos);
        model.addAttribute("produto", new Produtos());
        return "produtos"; // Retorna a view "produtos"
    }

    @PostMapping
    public String criarProduto(@RequestParam("nome") String nome,
                               @RequestParam("descricao") String descricao,
                               @RequestParam("imagem") MultipartFile imagem,
                               RedirectAttributes redirectAttributes) {
        try {
            Produtos produto = new Produtos();
            produto.setNome(nome);
            produto.setDescricao(descricao);

            if (!imagem.isEmpty()) {
                produto.setImagem(imagem.getBytes()); // Armazenando a imagem como bytes
            }

            produtoRepository.save(produto);
            redirectAttributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
            return "redirect:/produtos";
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("mensagemErro", "Erro ao cadastrar o produto.");
            return "redirect:/produtos";
        }
    }

    @GetMapping("/lista")
    public String listarProdutos(Model model) {
        List<Produtos> listaprodutos = produtosService.listarProdutos();
        model.addAttribute("listaprodutos", listaprodutos);
        return "listaprodutos"; // Retorna a view "listaprodutos"
    }
    @GetMapping("/buscar")
    public String buscarPorNome(@RequestParam(required = false) String nome, Model model) {
        if (nome == null || nome.isEmpty()) {
            model.addAttribute("produtos", List.of()); // lista vazia
            model.addAttribute("mensagem", "Nenhum nome informado para busca.");
            return "buscar";
        }

        List<Produtos> encontrados = produtosService.buscarPorNome(nome);
        model.addAttribute("produtos", encontrados);
        model.addAttribute("termoBusca", nome);
        return "buscar";
    }



}