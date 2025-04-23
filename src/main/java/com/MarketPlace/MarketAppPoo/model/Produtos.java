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
    @Lob
    private byte[] imagem;
    @Transient // Importante: não persiste no banco
    private boolean selecionado;
    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }
    private String imagemUrl; // Se você estiver armazenando a URL da imagem
    public Produtos() {

    }

    // Getters e Setters
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

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
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

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
}