package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import DTO.BookDTO;

public class BookDAO {
	Connection conn;
	PreparedStatement pstm;

	public void insertBook(BookDTO objBookDTO) {
		String sql = "insert into livros (Titulo, Autor, AnoPublicacao, ISBN) values (?,?,?,?)";

		conn = new ConnectionDAO().connectBd();

		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objBookDTO.getTitulo());
			pstm.setString(2, objBookDTO.getAutor());
			pstm.setInt(3, objBookDTO.getAnoPublicacao());
			pstm.setString(4,objBookDTO.getIsbn());
			
			pstm.execute();
			pstm.close();

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Classe BookDAO" + erro);
		}

	}
}