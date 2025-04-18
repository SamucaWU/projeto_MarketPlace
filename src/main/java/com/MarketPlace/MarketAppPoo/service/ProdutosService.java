package com.MarketPlace.MarketAppPoo.service;

import com.MarketPlace.MarketAppPoo.model.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MarketPlace.MarketAppPoo.repository.ProdutoRepository;


import java.util.List;

@Service
public class ProdutosService {
    @Autowired
    private  ProdutoRepository produtoRepository;
    // Lista todos os produtos
    public List<Produtos> listarProdutos(){
        return  produtoRepository.findAll();
    }
    public Produtos salvarProduto(Produtos produtos){
        return  produtoRepository.save(produtos);
    }
    public Produtos buscarPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produtos atualizar(Long id, Produtos produtoAtualizado) {
        Produtos produto = buscarPorId(id);
        if (produto != null) {
            produto.setNome(produtoAtualizado.getNome());
            produto.setPreco(produtoAtualizado.getPreco());
            produto.setCategoria(produtoAtualizado.getCategoria());
            produto.setPeso(produtoAtualizado.getPeso());
            produto.setQuantidade(produtoAtualizado.getQuantidade());
            produto.setDescricao(produtoAtualizado.getDescricao());
            return produtoRepository.save(produto);
        }
        return null;
    }
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}
