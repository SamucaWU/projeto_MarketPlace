
package com.MarketPlace.MarketAppPoo.repository;

import com.MarketPlace.MarketAppPoo.model.Produtos;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

// Interface que permite salvar, buscar, atualizar e deletar produtos no banco
public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
    List<Produtos> findByNomeContainingIgnoreCase(String nome);

}

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

