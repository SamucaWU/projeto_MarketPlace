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
        return produtoRepository.findAll();
    }

    public Produtos salvarProduto(Produtos produtos){
        return  produtoRepository.save(produtos);
    }


    // Lista produtos específicos de um usuário pelo cod (chave primária)
    public List<Produtos> listarPorUsuario(Long cod) {
        return produtoRepository.findByUsuarioCod(cod);
    }




}
