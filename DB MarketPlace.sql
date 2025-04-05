drop table if exists produtos;
create database MarketPlace;
use MarketPlace;
show tables;
create table  usuario(
    id_usuario int primary key auto_increment,
    nome varchar(45) not null,
    idada int not null
);
create table produtos(
     id_produtos int primary key auto_increment,
     nome varchar(100) not null,
     peco decimal(10,2) not null,
     peso float not null,
     descricao varchar(255),
     quantidade int not null,
     categoria varchar(100) not null,
     id_usuario int not null,
     foreign key (id_usuario) references usuario(id_usuario)
);