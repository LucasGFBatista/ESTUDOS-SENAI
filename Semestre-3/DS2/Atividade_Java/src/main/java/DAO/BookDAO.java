/*
 * - [X] CREATE 
 * - [X] READ
 * - [X] UPDATE
 * - [ ] DELETE
 * 
 * 
 * */

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

	// CREATE BOOK
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

	// LIST ALL BOOKS
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

	// SEARCH BOOK BY ONE OF THE INFORMATIONS
	public List<BookDTO> searchBooks(String isbn, String autor, String titulo) {
		List<BookDTO> books = new ArrayList<>();

		StringBuilder sql = new StringBuilder("SELECT Titulo, Autor, AnoPublicacao, ISBN FROM livros WHERE 1=1");

		if (isbn != null && !isbn.isEmpty()) {
			sql.append(" AND ISBN = ?");
		}
		if (autor != null && !autor.isEmpty()) {
			sql.append(" AND Autor = ?");
		}
		if (titulo != null && !titulo.isEmpty()) {
			sql.append(" AND Titulo = ?");
		}

		conn = new ConnectionDAO().connectBd();

		try {
			pstm = conn.prepareStatement(sql.toString());

			int parameterIndex = 1;

			if (isbn != null && !isbn.isEmpty()) {
				pstm.setString(parameterIndex++, isbn);
			}
			if (autor != null && !autor.isEmpty()) {
				pstm.setString(parameterIndex++, autor);
			}
			if (titulo != null && !titulo.isEmpty()) {
				pstm.setString(parameterIndex++, titulo);
			}

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

	// UPDATE BOOK
	public void updateBook(BookDTO objBookDTO) {
	    String sql = "UPDATE livros SET ISBN = ?, Titulo = ?, Autor = ?, AnoPublicacao = ? WHERE ISBN = ?";

	    conn = new ConnectionDAO().connectBd();

	    try {
	        pstm = conn.prepareStatement(sql);
	        pstm.setString(1, objBookDTO.getIsbn());
	        pstm.setString(2, objBookDTO.getTitulo());
	        pstm.setString(3, objBookDTO.getAutor());
	        pstm.setInt(4, objBookDTO.getAnoPublicacao());
	        pstm.setString(5, objBookDTO.getIsbn());

	        pstm.execute();
	        pstm.close();

	    } catch (Exception erro) {
	        JOptionPane.showMessageDialog(null, "Classe BookDAO" + erro);
	    }
	}


	// DELETE BOOK
	public void deleteBook(String isbn) {

		String sql = "DELETE FROM livros WHERE ISBN = ?";

		conn = new ConnectionDAO().connectBd();

		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, isbn);

			pstm.execute();
			pstm.close();

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Classe BookDAO: " + erro);
		}
	}

}