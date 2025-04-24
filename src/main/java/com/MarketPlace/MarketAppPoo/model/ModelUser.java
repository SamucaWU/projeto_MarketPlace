// Desenvolved by Samuel M. Dias🕷️

package com.MarketPlace.MarketAppPoo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.ArrayList;
import java.util.List;

@Entity // Responsável por criar a tabela
@Table(name = "usuarios") // @Table, resposável por modificações/adições a tabela
public class ModelUser {

    @Id // Gerar chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Implementa auto incremento
    private Long cod; // responsável pela chave primária

    private String nome;
    private int idade;
    private String cpf;
    private String telefone;

    @Email(message = "Digite seu E-mail: ")
    private String email;
    private String senha;
    private String fotoPerfil; //caminho da imagem

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Produtos> produtos = new ArrayList<>();

    //Construtor
    public ModelUser(Long cod, String nome, int idade, String cpf, String telefone, String email, String senha, String fotoPerfil) {
        this.cod = cod;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.fotoPerfil = fotoPerfil;
    }

    // Getters and Setters
    public ModelUser() {

    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
}
