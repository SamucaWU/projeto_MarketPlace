package com.MarketPlace.MarketAppPoo.repository;

import com.MarketPlace.MarketAppPoo.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interface que permite salvar, buscar, atualizar e deletar produtos no banco
public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
}