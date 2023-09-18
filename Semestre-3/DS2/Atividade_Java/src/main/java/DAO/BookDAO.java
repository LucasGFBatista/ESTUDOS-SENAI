package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
			pstm.setString(4, objBookDTO.getIsbn());

			pstm.execute();
			pstm.close();

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Classe BookDAO" + erro);
		}

	}

    public List<BookDTO> getAllBooks() {
        List<BookDTO> books = new ArrayList<>();

        String sql = "SELECT * FROM livros";
        conn = new ConnectionDAO().connectBd();

        try {
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                BookDTO book = new BookDTO();
                book.setTitulo(rs.getString("Titulo"));
                book.setAutor(rs.getString("Autor"));
                book.setAnoPublicacao(rs.getInt("AnoPublicacao"));
                book.setIsbn(rs.getString("ISBN"));

                books.add(book);
            }
            rs.close();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Classe BookDAO: " + erro);
        }

        return books;
    }
	
	
}