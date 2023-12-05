package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	
	public boolean validateUser (String userName, String password) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean valid = false;
        
      /*Falta inserir a logica de validação de usuario pegando do banco de dados
        E depois inserir essa função no botão de acessar da tela de login
        */
	}

}
