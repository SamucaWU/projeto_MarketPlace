package com.MarketPlace.MarketAppPoo.service;

import com.MarketPlace.MarketAppPoo.model.Produtos;
import com.MarketPlace.MarketAppPoo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    private List<Produtos> produtos;
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
    // Listar todos
    public List<Produtos> listarProdutos() {
        return produtoRepository.findAll();
    }

    // Buscar por nome
    public List<Produtos> buscarPorNome(String nome) {
        return produtoRepository.findByNomeContainingIgnoreCase(nome);
    }

    // Buscar por ID
    public Produtos buscarPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    // Salvar único produto
    public Produtos salvarProduto(Produtos produto) {
        return produtoRepository.save(produto);
    }
    public class ProdutoNotFoundException extends RuntimeException {
        public ProdutoNotFoundException(String message) {
            super(message);
        }
    }
    // Atualizar único produto
    public Produtos atualizar(Long idprodutos, Produtos produtos) {
        Produtos produto = produtoRepository.findById(idprodutos)
                .orElseThrow(() -> new ProdutoNotFoundException("Produto não existe"));

        // Atualiza os campos do produto
        produto.setNome(produtos.getNome());
        produto.setPreco(produtos.getPreco());
        produto.setCategoria(produtos.getCategoria());
        produto.setPeso(produtos.getPeso());
        produto.setQuantidade(produtos.getQuantidade());
        produto.setDescricao(produtos.getDescricao());
        produto.setImagem(produtos.getImagem());

        return produtoRepository.save(produto);
    }

    // NOVO: Atualizar vários produtos
    public List<Produtos> atualizarTodos(List<Produtos> produtos) {
        produtoRepository.saveAll(produtos);
        return produtos;
    }

    // Deletar por ID
    public void deletar(Long idprodutos) {
        produtoRepository.deleteById(idprodutos);
    }

    // NOVO: Deletar vários produtos
    public void deletarSelecionados(List<Produtos> produtos) {
        for (Produtos p : produtos) {
            if (p.isSelecionado()) {
                produtoRepository.deleteById(p.getIdprodutos());
            }
        }
    }
}
