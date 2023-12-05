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
