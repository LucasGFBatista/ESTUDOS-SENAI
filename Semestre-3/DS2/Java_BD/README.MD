---
created: 2023-08-29
last_modification : 2023-08-29 20:45
title: DSII-2023-08-2029
institute: Senai
course: Desenvolvimento de Sistemas
period: 3
subject: Desenvolvimento de Sistemas 2
aliases: Conexão com Bannco de dados em Java
status: Done
Tags: educacao/senai/ds2
---
[[Journal/2023-08-29|2023-08-29]]
Ref: #ref/2023
___
# DSII-2023-08-2029

Todo o código dado em sala de aula conta no repositório do [Github](https://github.com/LucasGFBatista/ESTUDOS-SENAI/tree/master/Semestre-3/DS2/Java_BD).

## Código da aula

![Content tree docs from class](doc/image/image.png)

Cria pacotes `DAO`, `DTO`, `VIEW`

> [!info]
>
> **DAO** -> Data Access Object
>
> **DTO** -> Data transfer object
>
> **VIEW** -> *A _View_ , which is a collection of classes representing the elements in the user interface (all of the things the user can see and respond to on the screen, such as buttons, display boxes, and so forth)*

Dentro do pacote `DAO` cria a classe `ConexaoDAO.java`, código abaixo: 
```JAVA
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Gonçalves
 */
public class ConexaoDAO {
    public Connection conectaBd( ){
        Connection conn = null;
        
        try {
        String url = "jdbc:mysql://localhost/banco?user=root&password=";
        conn = DriverManager.getConnection(url);
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog( null, erro.getMessage());
        }
        return conn;
    }
}

```


Dentro da pasta `Project Files` tem um arquivo `pom.xml`, que deve ser inserido o seguinte codigo, entre `</packing>` e `<properties>`

> [!note]
> POM: Project Object Model

```XML
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.30</version>
        </dependency>
    </dependencies>
```
O que fica por completo:
```XML 
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.mycompany</groupId>
    <artifactId>Java_BD</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.30</version>
        </dependency>
    </dependencies>
    
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
</project>
```

# DSII-2023-09-05

- No pacote `VIEW` cria um `jframe` chamado **`frmFuncioonario.java`**
- No pacocte `DAO` cria uma classe chamada **`FuncionarioDAO.java`**
- E no pacote `DTO` cria a classe **`FuncionarioDTO.java`** 
 
![Alt text](doc/image/image-1.png)

**FuncnionarioDTO.java**

Cria classe `FuncionarioDTO` e apenas dois atributo do tipo String `nome_funcionario` e `cidade_funcionario`. Depois só encapsula os atributos da classe.

```java
package DTO;

/**
 *
 * @author lucas Gonçalves
 */
public class FuncionarioDTO {
	private String nome_funcionario, cidade_funcionario;

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getCidade_funcionario() {
		return cidade_funcionario;
	}

	public void setCidade_funcionario(String cidade_funcionario) {
		this.cidade_funcionario = cidade_funcionario;
	}
	
	
}
```

**FuncionarioDAO.java**

Em `FuncionarioDAO` enviamos os dados do usairio para o banco de dados. 

Foi criada o atributo `conn` do tipo `Connection` (que é um tipo não primitivo de Java, utilizado para conexão com banco de dados).

Cria também o atributo `pstm` do tipo `PreparedStatement` (outro tipo não primitivo do Java, utilizado para executar comandos SQL).

Cria o metodo `cadastrarfuncionario` do tipo `void`, e como parametro um obejto `objfunconariodto` do tipo `FuncionarioDTO` (classe que foi criada aneriormente)

![Alt text](image.png)

```java
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import DTO.FuncionarioDTO;

public class FuncionarioDAO {
	Connection conn;
	PreparedStatement pstm;

	public void cadastrarFuncionario(FuncionarioDTO objfuncionariodto) {
		String sql = "insert into tabela (nome, cidade) values (?,?)";

		conn = new ConexaoDAO().conectaBd();

		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objfuncionariodto.getNome_funcionario());
			pstm.setString(2, objfuncionariodto.getCidade_funcionario());

			pstm.execute();
			pstm.close();

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Classe FuncionarioDAO" + erro);
		}

	}
}

```


**frmFuncionario.java**

Em `frmFuncionario` apenas modificamos o metodo que chama um objeto de `FuncionarioDAO`

![Alt text](doc/image/image-2.png)

```java
    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String nome, cidade;
        nome = txtnome.getText();
        cidade = txtcidade.getText();
        
        FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
        objfuncionariodto.setNome_funcionario(nome);
        objfuncionariodto.setCidade_funcionario(cidade);
        
       FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
       objfuncionariodao.cadastrarFuncionario(objfuncionariodto);
    }           
```

