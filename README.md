# Workshop Spring Boot 3 + JPA

Este repositório contém um projeto de portfólio que demonstra a criação de uma API REST utilizando **Spring Boot 3** e **JPA**. O projeto aborda operações CRUD e a estruturação de um sistema de gerenciamento de dados.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

## Funcionalidades

- Cadastro, listagem, atualização e exclusão de usuários e pedidos.
- Operações CRUD completas.
- Banco de dados H2 em memória para testes rápidos.

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/guilhermeguidat/workshop-springboot3-jpa.git
   ```

2. Acesse a pasta do projeto:

   ```bash
   cd workshop-springboot3-jpa
   ```

3. Execute o projeto via Maven:

   ```bash
   mvn spring-boot:run
   ```

4. Acesse a interface H2 em [http://localhost:8080/h2-console](http://localhost:8080/h2-console) com as seguintes configurações:
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa`
   - Password: *(deixe em branco)*

## Exemplos de Endpoints

- `POST /users`: Cria um novo usuário.
- `GET /users`: Lista todos os usuários.
- `PUT /users/{id}`: Atualiza um usuário pelo ID.
- `DELETE /users/{id}`: Exclui um usuário pelo ID.

## Autor

- [Guilherme Guida](https://github.com/guilhermeguidat)

---

Este projeto foi desenvolvido para demonstrar habilidades em APIs RESTful com Spring Boot e JPA. Sinta-se à vontade para explorar!
