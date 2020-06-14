create table Locador (
	id int,
	cpf int,
	nome varchar(50),
	telefone int,
	primary key(id)
);
create table Livro (
	idLivro int,
	tirulo varchar(50),
	autor varchar(50),
	paginas int,
	primary key(idLivro)
);
create table Emprestimo (
	idEmp int,
	idLocador int,
	idLivro int,
	nomeLocador varchar(50),
	tituloLivro varchar(50),
	primary key(idEmp),
	foreign key(idLocador,idLivro)
);