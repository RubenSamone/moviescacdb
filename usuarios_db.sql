create database usuarios_db;*/

use usuarios_db;

create table usuarios 
(
	id int primary key auto_increment,
	nombre varchar (50) not null,
    email varchar (75) not null,
	usuario varchar(50) not null,
	password varchar(50) not null
);*/

insert into usuarios values 
(1, "ruben", "asd@gmail.com", "asd321", "ruben samone");

select * from usuarios;