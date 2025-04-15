package com.MarketPlace.MarketAppPoo.repository;

import com.MarketPlace.MarketAppPoo.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Long> {


}
