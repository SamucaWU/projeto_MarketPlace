// Desenvolved by Rafael Paiva 🔥

package com.MarketPlace.MarketAppPoo.model;

import jakarta.persistence.*;

// Modelagem dos produtos
@Entity
@Table(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idprodutos;

    private  String nome;
    private  double preco;
    private  float peso;
    private  int quantidade;
    private  String categoria;
    private  String descricao;

    // Add by Samuel M. Dias (foreign key)
    @ManyToOne
    @JoinColumn(name = "cod", nullable = false)
    private ModelUser usuario;

    public ModelUser getUsuario() {
        return usuario;
    }

    public void setUsuario(ModelUser usuario) {
        this.usuario = usuario;
    }

    public Produtos( Long idprodutos, String nome, double preco, float peso,int quantidade, String categoria, String descricao) {
        this.idprodutos = idprodutos;
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;


    }

    public Produtos() {

    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getIdprodutos() {
        return idprodutos;
    }

    public void setIdprodutos(Long idprodutos) {
        this.idprodutos = idprodutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
