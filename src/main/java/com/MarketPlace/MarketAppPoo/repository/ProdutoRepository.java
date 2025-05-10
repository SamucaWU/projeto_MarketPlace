// Desenvolved by Rafael Paiva 🔥

package com.MarketPlace.MarketAppPoo.repository;

import com.MarketPlace.MarketAppPoo.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

        List<Produtos> findByUsuarioCod(Long cod);
}
