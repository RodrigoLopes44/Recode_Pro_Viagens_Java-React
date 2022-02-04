create database CrudJavaMod3

use CrudJavaMod3

create table Cliente (
id_cli int PRIMARY KEY NOT NULL,
nome varchar(30) NOT NULL,
cpf varchar(14) NOT NULL,
)

create table Local(
id_local int PRIMARY KEY NOT NULL,
cidade varchar(20) NOT NULL,
estado varchar(20) NOT NULL
)

create table Viagem (
id_viagem int PRIMARY KEY NOT NULL,
dataIda varchar(20) NOT NULL,
dataVolta varchar(20) NOT NULL,
FK_id_cli int FOREIGN KEY REFERENCES Cliente(id_cli),
FK_id_local int FOREIGN KEY REFERENCES Local(id_local)
)

select * from Cliente

select * from Local

select * from Viagem as v
inner join Cliente as c on v.FK_id_cli = c.id_cli
inner join Local as l on v.FK_id_local = l.id_local