DROP DATABASE IF EXISTS form;

CREATE DATABASE form;
USE form;

CREATE TABLE IF NOT EXISTS form.register(
	id_register  int not null primary key unique auto_increment,
    nome VARCHAR(120) not null,
    birth_date date not null,
    gender VARCHAR(120) not null,
    marital_status VARCHAR(120) not null,
    education_level VARCHAR(120) not null,
    favorite_language VARCHAR(120) not null,
    favorite_area VARCHAR(120) not null,
    favorite_library VARCHAR(120) not null,
	favorite_ide VARCHAR(120) not null,
	favorite_practice VARCHAR(120) not null    
);