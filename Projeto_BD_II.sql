create table Departamentos
(
	codigo int not null AUTO_INCREMENT 
		primary key,
	nome varchar(30) null,
	localizacao varchar(30) null
);

create table Dependentes
(
	codigo int not null AUTO_INCREMENT 
		primary key,
	nome varchar(30) null,
	rua varchar(50) null,
    bairro varchar(50) null,
    numero integer null,
    cidade varchar(50) null,
    uf varchar(2) null,
	parentesco varchar(30) null
);

create table Funcionarios
(
	CPF bigint not null
		primary key,
	nome varchar(30) null,
	rua varchar(50) null,
    bairro varchar(50) null,
    numero integer null,
    cidade varchar(50) null,
    uf varchar(2) null,
	telefone bigint null,
	salario bigint null,
    codigo_Departamento int not null,
	codigo_DepartamentoGerenciar int not null AUTO_INCREMENT,
	constraint fk_cod_depar_ger
		foreign key (codigo_DepartamentoGerenciar) references Departamentos (codigo)
);

create table Funcionarios_Dependentes
(
	CPF_funcionario bigint not null,
	codigo_dependentes int not null,
	constraint fk_cod_depen
		foreign key (codigo_dependentes) references Dependentes (codigo),
	constraint fk_cpf_funci
		foreign key (CPF_funcionario) references Funcionarios (CPF)
);

create table Projetos
(
	numero int not null AUTO_INCREMENT
		primary key,
	nome varchar(30) null,
	tipo varchar(30) null,
	codigo_Departamento int not null,
	CPF_funcionario bigint not null,
	verba bigint null,
	horas bigint null,
	constraint fk_cod_depar
		foreign key (codigo_Departamento) references Departamentos (codigo),
	constraint fk_cpf_func
		foreign key (CPF_funcionario) references Funcionarios (CPF)
);

create table Funcionarios_Projetos
(
	CPF_funcionario bigint not null,
	numero_projeto int not null AUTO_INCREMENT,
	numero_horas bigint null,
	constraint fk_cpf_func_projeto
		foreign key (CPF_funcionario) references Funcionarios (CPF),
	constraint fk_num_proj
		foreign key (numero_projeto) references Projetos (numero)
);
create table Departamentos
(
	codigo int not null AUTO_INCREMENT 
		primary key,
	nome varchar(30) null,
	localizacao varchar(30) null
);

create table Dependentes
(
	codigo int not null AUTO_INCREMENT 
		primary key,
	nome varchar(30) null,
	rua varchar(50) null,
    bairro varchar(50) null,
    numero integer null,
    cidade varchar(50) null,
    uf varchar(2) null,
    cep bigint null,
	parentesco varchar(30) null
);

create table Funcionarios
(
	CPF bigint not null
		primary key,
	nome varchar(30) null,
	rua varchar(50) null,
    bairro varchar(50) null,
    numero integer null,
    cidade varchar(50) null,
    uf varchar(2) null,
    cep bigint null,
	telefone bigint null,
	salario bigint null,
    senha varchar(32) not null,
    codigo_Departamento int not null,
	codigo_DepartamentoGerenciar int not null AUTO_INCREMENT,
	constraint fk_cod_depar_ger
		foreign key (codigo_DepartamentoGerenciar) references Departamentos (codigo)
);

create table Funcionarios_Dependentes
(
	CPF_funcionario bigint not null,
	codigo_dependentes int not null,
	constraint fk_cod_depen
		foreign key (codigo_dependentes) references Dependentes (codigo),
	constraint fk_cpf_funci
		foreign key (CPF_funcionario) references Funcionarios (CPF)
);

create table Projetos
(
	numero int not null AUTO_INCREMENT
		primary key,
	nome varchar(30) null,
	tipo varchar(30) null,
	codigo_Departamento int not null,
	CPF_funcionario bigint not null,
	verba bigint null,
	horas bigint null,
	constraint fk_cod_depar
		foreign key (codigo_Departamento) references Departamentos (codigo),
	constraint fk_cpf_func
		foreign key (CPF_funcionario) references Funcionarios (CPF)
);

create table Funcionarios_Projetos
(
	CPF_funcionario bigint not null,
	numero_projeto int not null AUTO_INCREMENT,
	numero_horas bigint null,
	constraint fk_cpf_func_projeto
		foreign key (CPF_funcionario) references Funcionarios (CPF),
	constraint fk_num_proj
		foreign key (numero_projeto) references Projetos (numero)
);