# Desenvolvimento de API com Spring Boot – Semana 3  
Branch: `semana-3`

## Visão Geral  
Este projeto faz parte de uma evolução semanal para construir uma API REST com **Spring Boot**. Na **semana 3**, o escopo foi expandido para permitir um **CRUD completo**, melhorar a persistência e adicionar validações mais robustas.

## Novidades introduzidas nesta semana (vs Semana 2)  
- Implementação de **PUT** e **DELETE** para a entidade `Livro` (ou outras entidades de domínio), completando o CRUD.  
- Melhoria no tratamento de erros e nas respostas da API, garantindo feedback mais claro em casos de falha.  
- Validações mais rigorosas nos dados de entrada (por exemplo, usando `@Valid`, constraints como `@NotNull`, `@Size`).  
- Potencial introdução de **relacionamentos entre entidades** (por exemplo, `Autor` ↔ `Livro`) para modelar o domínio de forma mais realista.  
- Refinamento da camada **service**, separando lógica de negócio dos controllers.  
- Preparação ou inclusão de **documentação da API** (Swagger / OpenAPI) para facilitar a exploração e uso dos endpoints.  
- Estrutura de persistência aprimorada (JPA), possivelmente com configuração de banco mais robusta ou migração para banco “pragmático”.

## Tecnologias & Ferramentas  
- Java + Spring Boot  
- Spring Web (REST)  
- Spring Data JPA  
- Banco de dados (H2 ou outro configurado)  
- Maven  
- Validação de Bean (Jakarta Validation)  
- (Opcional) Swagger / OpenAPI para documentação  

## Como Executar Localmente  
1. Clone o repositório e acesse a branch `semana-3`:
   ```bash
   git clone https://github.com/Henrique-Luckmann-Campos/Desenvolvimento-de-API-com-Spring-Boot.git  
   cd Desenvolvimento-de-API-com-Spring-Boot  
   git checkout semana-3  
