package com.MarketPlace.MarketAppPoo.controller;

import com.MarketPlace.MarketAppPoo.model.Produtos;
import com.MarketPlace.MarketAppPoo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosApiController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // GET /api/produtos/{id}
    @GetMapping("/{id}")
    public Produtos buscarPorId(@PathVariable Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    // PUT /api/produtos/{id}
    @PutMapping("/{id}")
    public Produtos atualizar(@PathVariable Long id, @RequestBody Produtos produtoAtualizado) {
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(produtoAtualizado.getNome());
            produto.setPreco(produtoAtualizado.getPreco());
            produto.setCategoria(produtoAtualizado.getCategoria());
            produto.setPeso(produtoAtualizado.getPeso());
            produto.setQuantidade(produtoAtualizado.getQuantidade());
            produto.setDescricao(produtoAtualizado.getDescricao());
            produto.setImagem(produtoAtualizado.getImagem());
            return produtoRepository.save(produto);
        }).orElse(null);
    }

    // DELETE /api/produtos/{id}
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }
}
