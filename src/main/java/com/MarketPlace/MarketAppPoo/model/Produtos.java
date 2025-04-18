package com.MarketPlace.MarketAppPoo.model;

import jakarta.persistence.*;

// Modelagem dos produtos
@Entity
@Table(name = "produto")
public class Produtos {
    @Id // Marca como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
    private long idprodutos;
    private  String nome;
    private  double preco;
    private  float peso;
    private  int quantidade;
    private  String categoria;
    private  String descricao;
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
    // Getters e Setters (usados para acessar os dados no formulário)
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
