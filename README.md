

---

# Desenvolvimento de API com Spring Boot

## Semana 1 – Versão Inicial

Bem-vindo ao repositório do projeto de API com Spring Boot (versão da semana 1). Este trabalho faz parte da disciplina de programação / desenvolvimento back-end da Faculdade Senac Paraná.

### 🎯 Objetivo

Construir uma API REST básica utilizando Spring Boot, com foco inicial na estrutura do projeto, configuração do ambiente e endpoints primários para gerenciar entidades de dados.

### ✅ Funcionalidades implementadas nesta semana

* Projeto Spring Boot criado a partir do modelo Maven (pom.xml incluído)
* Configuração inicial do wrapper Maven (`mvnw`, `mvnw.cmd`, `.mvn/wrapper/`)
* Arquivo `.gitignore` ajustado para Spring Boot / Maven
* Criada a estrutura de pacotes dentro de `src/` para os controllers, serviços e entidades (ou o que for definido)
* Endpoint(s) de teste implementados para verificar o funcionamento da aplicação (ex: “Hello World”, ou lista vazia)
* Branch separada chamada `semana-1` para esta versão inicial (estratégia de versionamento semanal)

### 🛠 Tecnologias utilizadas

* Java (versão compatível com Spring Boot)
* Spring Boot
* Maven para gerenciamento de dependências
* Git & GitHub para versionamento (esta branch: `semana-1`)
* IDE de sua preferência (ex: IntelliJ IDEA, Eclipse, VS Code)
* (Opcional) Postman / Insomnia para testes de API

### 🚀 Como rodar o projeto localmente

1. Clone este repositório:

   ```bash
   git clone https://github.com/Henrique-Luckmann-Campos/Desenvolvimento-de-API-com-Spring-Boot.git
   cd Desenvolvimento-de-API-com-Spring-Boot
   git checkout semana-1
   ```
2. Execute o projeto via Maven ou IDE:

   ```bash
   ./mvnw spring-boot:run
   ```

   ou abra o projeto na IDE e execute a classe `main` gerada pelo Spring Boot.
3. Acesse o endpoint de teste no navegador ou via ferramenta de API:
   *Exemplo*: `http://localhost:8080/api/teste`

### 🧭 Próximos passos

* Definir entidade(s) de domínio (por exemplo: Livro, Autor, etc)
* Configurar persistência com banco de dados (ex: H2 para teste, MySQL para produção)
* Criar endpoints CRUD para as entidades
* Implementar tratamento de erros, validações e documentação (ex: Swagger)
* Preparar branch `semana-2` com nova funcionalidade e seguir fluxo semanal

### 🤝 Contribuições

Como este é o seu projeto académico pessoal, contribuições externas não são necessárias no momento. Se quiser, você mesmo pode manter o progresso semanal fazendo commits na sua própria branch e depois realizando merge na `main`.

### 📄 Licença

Este projeto é para fins de estudo e acadêmicos.
Sinta-se livre para usar o código como base para aprendizado, mas não para fins comerciais sem a devida adaptação.

---

