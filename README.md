# Desenvolvimento-de-API-com-Spring-Boot
Trabalho da Faculdade Senac Paraná


# Livraria API

API RESTful desenvolvida com **Spring Boot** para gerenciamento de livros.  
Permite realizar operações completas de **CRUD (Create, Read, Update, Delete)**, aplicando boas práticas de arquitetura em camadas, persistência com Spring Data JPA e banco de dados **MySQL**.

---

## Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Maven**

---

##  Funcionalidades

| Método | Endpoint | Descrição |
|--------|-----------|-----------|
| `POST` | `/api/livros` | Cadastra um novo livro |
| `GET` | `/api/livros` | Lista todos os livros |
| `GET` | `/api/livros/{id}` | Busca um livro por ID |
| `PUT` | `/api/livros/{id}` | Atualiza os dados de um livro |
| `DELETE` | `/api/livros/{id}` | Exclui um livro |



