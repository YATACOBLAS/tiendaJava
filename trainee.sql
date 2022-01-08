
create database colegio;
use colegio;
create table alumno(
id_alumno int primary key auto_increment,
nombre varchar(40) ,
apellido varchar(40) ,
telefono varchar(11)
);

create table curso(
id_curso int primary key auto_increment,
descripcion varchar(40) not null
);
create table nota(
id_nota int primary key auto_increment,
primera_unidad int not null,
segunda_unidad int not null,
tercera_unidad int not null,
id_alumno int,
id_curso int,
foreign key (id_alumno) references alumno(id_alumno),
foreign key (id_curso) references curso(id_curso)
);



