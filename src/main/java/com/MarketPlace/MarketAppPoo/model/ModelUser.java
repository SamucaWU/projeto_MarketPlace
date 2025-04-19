// Desenvolved by Samuel M. Dias🕷️

package com.MarketPlace.MarketAppPoo.model;

import jakarta.persistence.*;

@Entity // Responsável por criar a tabela
@Table(name = "usuarios") // @Table, resposável por modificações/adições a tabela
public class ModelUser {

    @Id // Gerar chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Implementa auto incremento
    private int cod; // responsável pela chave primária

    private String nome;
    private int idade;
    private String cpf;
    private int telefone;
    private String email;
    private String senha;


    // Getters and Setters

    public ModelUser() {

    }

    public ModelUser(int cod, String nome, int idade, String cpf, int telefone, String email, String senha) {
        this.cod = cod;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
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
}
