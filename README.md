

# Desenvolvimento de API com Spring Boot

## Semana 2 – Evolução da API

Bem-vindo à **segunda semana** do projeto de API com Spring Boot. Esta versão aprofunda a estrutura do projeto, adiciona funcionalidades iniciais de domínio e prepara o terreno para a persistência de dados.

### 🎯 Objetivo da Semana 2

Desenvolver além do “Hello World”, definindo entidades de domínio, criando endpoints básicos, e estabelecendo o fluxo de requisições e respostas REST-ful.
Visamos construir uma base concreta para manipulação de dados (CRUD simples) e testar a integração inicial com o framework.

### ✅ Funcionalidades implementadas nesta semana

* Definição de pelo menos uma entidade de domínio (por exemplo: `Livro`, `Autor`) com atributos relevantes.
* Criação de pacotes organizados no projeto: `controller`, `service`, `repository`, `model` (ou similar) para seguir a arquitetura MVC.
* Implementação de endpoints REST básicos (por exemplo: `GET /api/livros`, `POST /api/livros`) para a entidade escolhida.
* Inicial configuração de persistência de dados (por exemplo: uso de banco em memória como H2 ou configuração inicial de conexão com MySQL).
* Realização de validações básicas nos dados (por exemplo: campos obrigatórios, formato ISBN) ou tratamento simples de erros.
* Branch separada chamada `semana-2` para focar nesta etapa de evolução e versionamento semanal.

### 🛠 Tecnologias & Ferramentas utilizadas

* Java (versão compatível com Spring Boot)
* Spring Boot como framework principal
* Maven para gerenciamento de dependências
* Banco em memória (ex: H2) ou início da configuração de MySQL
* IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)
* Ferramenta de teste de API (ex: Postman ou Insomnia)
* Git e GitHub para versionamento (branch atual: `semana-2`)

### 🚀 Como rodar o projeto localmente

1. Clone o repositório e vá para esta branch:

   ```bash
   git clone https://github.com/Henrique-Luckmann-Campos/Desenvolvimento-de-API-com-Spring-Boot.git
   cd Desenvolvimento-de-API-com-Spring-Boot
   git checkout semana-2
   ```
2. Execute o projeto via Maven ou diretamente pela IDE:

   ```bash
   ./mvnw spring-boot:run
   ```

   ou abra a classe principal (gerada pelo Spring Boot) na IDE e execute.
3. Acesse via navegador ou ferramenta de API os endpoints da entidade principal.
   *Exemplo*: `http://localhost:8080/api/livros` (GET) ou `http://localhost:8080/api/livros` (POST com body JSON)
4. Verifique a persistência ou banco em memória — se estiver usando H2, acesse o console H2 (normalmente em `http://localhost:8080/h2-console`) para visualizar dados.

### 🧭 Próximos passos (para a semana 3)

* Expandir o CRUD: implementar operações `PUT`, `DELETE` para a entidade.
* Adicionar relacionamentos entre entidades (por exemplo: Autor ↔ Livro).
* Integrar com banco externo (MySQL ou equivalente), configurar propriedades de conexão e migrações.
* Implementar documentação de API (por exemplo: com Swagger UI ou OpenAPI).
* Preparar testes automatizados (unitários e de integração) para os endpoints.
* Criar branch `semana-3` para o próximo ciclo de evolução.

### 🤝 Contribuições

Este é seu projeto de estudo, então contribuições externas não são necessárias por enquanto. Mantenha o fluxo de commits semanal, faça merges conforme estiver pronto, e documente o progresso.

### 📄 Licença

Projeto desenvolvido para fins de estudo e prática acadêmica. Sinta-se livre para reutilizar o código como base de aprendizado, com respeito aos conceitos e à propriedade intelectual das bibliotecas externas.

---


