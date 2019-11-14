create table Empresa (
	idEmpresa serial not null,
	nomeRazao varchar(100) not null,
	nomeFantazia varchar(200) not null, 
	cnpj varchar(20) not null,
	inscricaoEstadual varchar(30) not null,
	endereco varchar(100) not null,
	cidade varchar(100) not null,
	estado varchar(2) not null,
	telefone varchar(20) not null,
	tipoEmpresa varchar(50) not null,
	emailEmpresa varchar(200) not null,
	senhaEmpresa varchar(200) not null, 
	Constraint pk_empresa primary key (idEmpresa)
);

create table Imagem (
	idImagem serial not null,
	codLink integer not null,
	tabLink varchar (200) not null,
	foto bytea,	
	principal boolean default false,
	constraint pk_imagem primary key (idImagem)	
);

Create table Etapa (
	idEmpresa integer not null,
	Etapa integer not null,
	descricaoEtapa varchar(100),
	FOREIGN KEY (idEmpresa) REFERENCES Empresa (idEmpresa),
	constraint pk_etapa primary key(idEmpresa, Etapa)	
);

Create table Estabelecimento (
	idEstabelecimento serial not null,
	Descricao varchar(100),
	constraint pk_estabelecimento primary key (idEstabelecimento)
);



