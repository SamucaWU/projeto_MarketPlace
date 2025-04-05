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
    public List<Produtos> listarProdutos(){
        return  produtoRepository.findAll();
    }
    public Object salvarProduto(Produtos produtos){
        return  produtoRepository.save(produtos);
    }


}
