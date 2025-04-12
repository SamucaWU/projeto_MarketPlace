drop table if exists produtos;
create database MarketPlace;
use MarketPlace;
show tables;
<<<<<<< HEAD
create table if not exists usuario(
=======

-- Desenvolved by Samuel M. Dias🕷️
create table if not exists usuario(

>>>>>>> b093e86f6bc61f37116c141fa5527bce07251149
    cod int primary key auto_increment,
    nome varchar(200) not null,
    idade int not null,
    cpf varchar(200),
    telefone int not null,
    email varchar(200),
<<<<<<< HEAD
    senha varchar(200));
    
create table  usuario(
    id_usuario int primary key auto_increment,
    nome varchar(45) not null,
    idada int not null

);
create table produtos(
=======
    senha varchar(200)
);

-- Desenvolved by Rafael Paiva 🔥
create table if not exists produtos(

>>>>>>> b093e86f6bc61f37116c141fa5527bce07251149
     id_produtos int primary key auto_increment,
     nome varchar(100) not null,
     peco decimal(10,2) not null,
     peso float not null,
     descricao varchar(255),
     quantidade int not null,
     categoria varchar(100) not null,
     cod int not null,
<<<<<<< HEAD
     foreign key (cod) references usuario(cod),
     id_usuario int not null,
     foreign key (id_usuario) references usuario(id_usuario)
);
=======
     foreign key (cod) references usuario(cod)
);

show tables;

select * from produtos;
>>>>>>> b093e86f6bc61f37116c141fa5527bce07251149
