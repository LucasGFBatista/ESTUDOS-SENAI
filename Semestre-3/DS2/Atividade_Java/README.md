---
created: 2023-10-03
last_modification: 2023-10-03 14:22
title: DSII - Sistema & Documentação
school: Senai
course: Desenvolvimento de Sistemas
period: 03
subject: DS2
aliases: 
status: 
tags:
  - ref/2023
  - educacao/senai/ds2
ref: 2023
---
[[2023-10-03|2023-10-03]]

___
# DSII - Sistema & Documentação



## 1. INTRODUÇÃO
O sistema de gerenciamento de livros foi desenvolvido com o objetivo de organizar, manter e gerir um catálogo de livros.

### 1.1. PROBLEMA
A falta de um sistema automatizado que permite gerenciar, buscar, atualizar e remover livros de um catálogo resulta em ineficiências, erros e demoras na obtenção de informações relevantes sobre os livros disponíveis.

### 1.2. JUSTIFICATIVA
Um sistema organizado facilita a administração de livros, a rápida recuperação de informações e a manutenção eficaz dos registros, evitando redundâncias e possíveis perdas.

### 1.3. OBJETIVOS
Desenvolver um sistema de gerenciamento que permita:
- Adicionar livros ao catálogo.
- Listar todos os livros disponíveis.
- Atualizar informações dos livros.
- Deletar livros.

### 1.4. PÚBLICO ALVO
Bibliotecários, estudantes, professores e qualquer indivíduo ou organização interessada em manter um catálogo organizado de livros.

## 2. LEVANTAMENTO DE REQUISITOS

### 2.1. REQUISITOS FUNCIONAIS
%%
- Cadastro de livros.
- Edição de livros.
- Remoção de livros.
- Busca por livros.

%%

| ID   | Requisito Funcional                                                                      |
|------|------------------------------------------------------------------------------------------|
| RF01 | Registro de livros: Permitir o cadastro de livros com título, autor, ano e ISBN.        |
| RF02 | Listagem de livros: Exibir uma lista de todos os livros cadastrados.                    |
| RF03 | Pesquisa de livros: Permitir pesquisa de livros por ISBN, autor ou título.              |
| RF04 | Atualização de livro: Permitir edição das informações de um livro.                      |
| RF05 | Exclusão de livros: Permitir a remoção de um livro usando seu ISBN.                    |
| RF06 | Autenticação de usuário: Possuir tela de login para acesso ao sistema.                 |
#### 2.1.1. Casos de uso
![Modelo Conceitual](IMG-README\CASO-DE-USO.png)
### 2.2. REQUISITOS NÃO FUNCIONAIS


| **Código** | **Requisito Não Funcional**                              |
|------------|----------------------------------------------------------|
| RNF01      | A interface do sistema deve ser intuitiva e amigável.    |
| RNF02      | O sistema deve proporcionar um desempenho rápido.        |
| RNF03      | O sistema deve ter medidas robustas contra invasões.     |
| RNF04      | Deve haver backup automático dos dados em intervalos regulares. |

### 2.3. REGRA DE NEGÓCIOS
%%
- Cada livro deve ter um ISBN único.
- Os campos de título, autor e ano de publicação são obrigatórios.
%%
| **Código** | **Regra de Negócio**  | **Descrição**                                                                                                                                                           |
|-----|--------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| RN01   | **Unicidade do ISBN**                                        | Cada livro no sistema "BookMaster" deve ter um ISBN único. Isso garante que cada livro seja identificável de forma exclusiva, evitando confusões ou conflitos de dados.|
| RN02   | **Campos Obrigatórios**                                      | Ao cadastrar ou atualizar um livro no sistema, os campos de título, autor e ano de publicação são obrigatórios. Isso garante que os usuários tenham informações mínimas necessárias sobre cada livro.                           |


## 3. TECNOLOGIAS UTILIZADAS NO DESENVOLVIMENTO DO SISTEMA
- Variação do padrão de Arquitetura: MVC (Model-View-Controller), MDV (_Model-DAO-VIEW_).
- Linguagem de programação: Java.
- Banco de dados: MySQL.
- Interface: Swing.

## 4. ESTRUTURA PARA DESENVOLVIMENTO DO SISTEMA

O sistema foi construído usando uma variação do padrão arquitetônico MVC (*Model View Controller*) . Em vez de um padrão MVC tradicional, optou-se por separar a lógica de acesso aos dados (leitura e gravação no banco de dados) em seus próprios objetos (DAOs). Esta escolha foi feita para isolar as responsabilidades, tornar o código mais organizado e reutilizável.

Abaixo está a estrutura de pastas do projeto:

```
.
└───java
    ├───assets
    │   ├─── delete.png
    │   ├─── edit.png
    │   └─── logo.png
    ├───com
    │   └───Java_atividade
    │       └───Atividade_Java
    ├───DAO
    │   ├─── BookDAO.java
    │   ├─── ConnectionDAO.java
    │   └─── LoginDAO.java
    ├───DTO
    │   ├─── BookDTO.java
    │   └─── LoginDTO.java
    └───VIEW
        ├─── CreateBook.java
        ├─── ListBooks.java
        ├─── LoginScreen.java
        ├─── MainScreen.java
        └─── SearchBook.java
```


- **DTO (Data Transfer Object)**: Representa o "Model". São objetos que definem a estrutura de dados.
  
- **DAO (Data Access Object)**: Atua como uma extensão do "Model", sendo responsável pela leitura e gravação de um DTO em um banco de dados ou outra fonte de persistência.
  
- **VIEW**: Representa a visualização dos dados e onde a interação do usuário ocorre.
## 5. ESTRUTURA DE BANCO DE DADOS
O banco de dados escolhido para o BookBud foi o MySQL.
### 5.1. MYSQL
O MySQL é um sistema de gerenciamento de banco de dados relacional (RDBMS) de código aberto, que utiliza a linguagem SQL como interface. A escolha deste sistema de gerenciamento de banco de dados para o BookBud foi motivada pela capacidade técnica do desenvolvedor da aplicação BookBud. 

### 5.2. MODELO CONCEITUAL
Modelo conceitual é uma representação de alto nível do esquema do banco de dados, que descreve a estrutura e as relações entre as diferentes entidades.

![Modelo Conceitual](IMG-README\MODELO-CONCEITUAL.png)


### 5.3. MODELO LÓGICO
Após o modelo conceitual, passamos para a fase de criação do modelo lógico. Esta fase envolve a transformação das entidades e relações do modelo conceitual em tabelas, com suas chaves primárias e seus demais atributos.

![Modelo Conceitual](IMG-README\MODELO-LOGICO.png)

## 6. SEGURANÇA
- Sistema de login para acesso.
- Criptografia de senhas.

## CONCLUSÃO
O sistema de gerenciamento de livros atende às necessidades básicas de organizações e indivíduos que desejam manter um catálogo de livros. Sua facilidade de uso, segurança e desempenho o tornam uma ferramenta valiosa para a gestão de livros.

## REFERÊNCIAS

MICROSOFT. **Padrão ASP.NET MVC**. Disponível em: %3Chttps://dotnet.microsoft.com/pt-br/apps/aspnet/mvc#:~:text=Model%20View%20Controller%20(MVC),obter%20uma%20separa%C3%A7%C3%A3o%20das%20preocupa%C3%A7%C3%B5es%3E. Acesso em: [data de acesso, por exemplo: 10 out. 2023].

RAMALHO, José. **Diferença entre os patterns PO, POJO, BO, DTO e VO**. DevMedia, [s.d.]. Disponível em: <https://www.devmedia.com.br/diferenca-entre-os-patterns-po-pojo-bo-dto-e-vo/28162>. Acesso em: [data de acesso].

WIKIPEDIA. **DAO - Objeto de Acesso de dados**. Disponível em: <https://pt.wikipedia.org/wiki/Objeto_de_acesso_a_dados>. Acesso em: [data de acesso].

HOSTINGER. **O que é MySQL**. Disponível em: <https://www.hostinger.com.br/tutoriais/o-que-e-mysql>. Acesso em: [data de acesso].

