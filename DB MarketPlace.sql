
create database MarketPlace;
use MarketPlace;
show tables;

-- Desenvolved by Samuel M. Dias🕷️
create table if not exists usuarios(

    cod int primary key auto_increment,
    nome varchar(200) not null,
    idade int not null,
    cpf varchar(200) not null,
    telefone varchar(299) not null,
    email varchar(200),
    senha varchar(200),
foto_perfil varchar(255),
role varchar(50) default 'USER');

-- Desenvolved by Rafael Paiva 🔥
create table if not exists produtos(

     idprodutos int primary key auto_increment,
     nome varchar(100) not null,
     preco decimal(10,2) not null,
     peso float not null,
     descricao varchar(255),
     quantidade int not null,
     categoria varchar(100) not null,
     cod int not null ,
     foreign key (cod) references usuarios(cod)
);

create table if not exists pagamento(
    id_pagamento  int primary key  auto_increment,
    cod int not null,
    idprodutos int not null ,
    valor  double not null ,
    formaPagamento varchar(100) not null,
    foreign key (cod) references usuarios(cod),
    foreign key (idprodutos) references produtos(idprodutos)
);

show tables;
select * from usuarios;
drop table usuarios;
