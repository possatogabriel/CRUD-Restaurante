# CRUD Restaurante - Java com JDBC

## Descrição
Este projeto Java implementa um sistema de gerenciamento para um restaurante, permitindo a criação, leitura, atualização e deleção de dados relacionados a clientes, funcionários, pedidos, estoque, entre outros. O sistema utiliza JDBC para se conectar a um banco de dados SQL e realizar as operações CRUD.

## Tecnologias Utilizadas
* **Java:** Linguagem de programação principal.
* **JDBC:** API para conectar a bancos de dados relacionais.
* **SQL:** Linguagem de consulta para bancos de dados.

## Estrutura do Projeto
* **src:** Contém o código fonte Java do projeto.
    * **DAO:** Classes de acesso a dados (Data Access Object) para interagir com o banco de dados.
    * **DTO:**  Classe de transporte de dados (Data Transfer Object) para uso em outras classes.
    * **VIEW:** Classes responsáveis pela interface do usuário. 
* **SQL:** Script SQL para criação e povoamento do banco de dados.
* **driver:** Driver necessário para uso de JDBC no programa.
* **build/classes:** Destino de arquivos de build do java.

## Como Executar o Projeto
1. **Pré-requisitos:**
    * **Java Development Kit (JDK):** Instale o JDK 17
    * **Ferramenta de build:** Ant.
    * **Banco de dados:** MySQL.
    * **[Apache NetBeans(Optional)](https://netbeans.apache.org/front/main/index.html)**

2. **Clonar o repositório:**
     Use o comando abaixo para clonar o repositorio na branch mais atual
     ```terminal
     git clone https://github.com/Adilson-kina/CRUD-Restaurante.git
     ```
3. **Executar o database**
     ```terminal
     mysql -u root -p < ./SQL/Banco_Finalizado.sql
     ```

4. **Compile e execute o projeto **
     Use o ant para compilar o projeto
     ```terminal
     ant run
     ```
   **OU Abra o projeto no NetBeans, compile e rode**




