CREATE TABLE servicos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    imagem VARCHAR(200) NOT NULL,
    avatar VARCHAR(200) NOT NULL,
    descricao TEXT NOT NULL,
    preco NUMERIC(10,2) NOT NULL
);
