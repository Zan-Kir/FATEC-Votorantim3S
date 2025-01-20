CREATE TABLE Empresa (
    idEmpresa NUMERIC(5) NOT NULL,
    nomeEmpresa VARCHAR(50) NOT NULL,
    telefoneEmpresa VARCHAR(15),
    emailEmpresa VARCHAR(50),
    siteEmpresa VARCHAR(50),
    tipoEmpresa VARCHAR(50),
    CNPJ VARCHAR(18) NOT NULL,
    userImg VARCHAR(255),
    servico VARCHAR(50),
    cidade VARCHAR(50),
    UF CHAR(2),
    CEP VARCHAR(10),
    logradouro VARCHAR(50),
    numero VARCHAR(10),
    complemento VARCHAR(50),
    bairro VARCHAR(50),
	CONSTRAINT PK_Empresa PRIMARY KEY (idEmpresa)
);