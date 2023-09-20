package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.BookDAO;
import DTO.BookDTO;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextPane;

public class SearchBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel SearchScreen;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchBook frame = new SearchBook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		SearchScreen = new JPanel();
		SearchScreen.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(SearchScreen);
		SearchScreen.setLayout(null);

		JTextArea txtH1 = new JTextArea();
		txtH1.setEditable(false);
		txtH1.setText("Pesquisar Livro");
		txtH1.setFont(new Font("Monospaced", Font.BOLD, 24));
		txtH1.setBackground(UIManager.getColor("Button.background"));
		txtH1.setBounds(150, 10, 230, 37);
		SearchScreen.add(txtH1);

		JButton btnReturn = new JButton("← Retornar");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen mainScreenFrama = new MainScreen();
				mainScreenFrama.setVisible(true);
			}
		});

		btnReturn.setBounds(10, 10, 110, 30);
		SearchScreen.add(btnReturn);

		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(29, 59, 80, 20);
		SearchScreen.add(lblTitulo);

		textField = new JTextField();
		textField.setBounds(160, 59, 200, 20);
		SearchScreen.add(textField);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(29, 99, 80, 20);
		SearchScreen.add(lblAutor);

		textField_1 = new JTextField();
		textField_1.setBounds(160, 99, 200, 20);
		SearchScreen.add(textField_1);

		JLabel lblAnoPublicacao = new JLabel("Ano Publicação");
		lblAnoPublicacao.setBounds(29, 139, 80, 20);
		SearchScreen.add(lblAnoPublicacao);

		textField_2 = new JTextField();
		textField_2.setBounds(160, 139, 200, 20);
		SearchScreen.add(textField_2);

		JLabel lblISBN = new JLabel("ISBN");
		lblISBN.setBounds(29, 179, 80, 20);
		SearchScreen.add(lblISBN);

		textField_3 = new JTextField();
		textField_3.setBounds(160, 179, 200, 20);
		SearchScreen.add(textField_3);

		//botão de pesquisar
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(160, 220, 110, 30);
		SearchScreen.add(btnPesquisar);
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDAO bookDAO = new BookDAO();

				String titulo = textField.getText().isEmpty() ? null : textField.getText();
				String autor = textField_1.getText().isEmpty() ? null : textField_1.getText();
				String anoStr = textField_2.getText().isEmpty() ? null : textField_2.getText();
				String isbn = textField_3.getText().isEmpty() ? null : textField_3.getText();

				try {
					if (anoStr != null) {
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Ano inválido. Por favor, insira um ano válido.");
					return;
				}

				List<BookDTO> books = bookDAO.searchBooks(isbn, autor, titulo);
				if (!books.isEmpty()) {

					String message = "Livros encontrados:\n";
					for (BookDTO book : books) {
						message += "Título: " + book.getTitulo() + ", Autor: " + book.getAutor() + ", Ano: "
								+ book.getAnoPublicacao() + ", ISBN: " + book.getIsbn() + "\n";
					}
					JOptionPane.showMessageDialog(null, message);
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum livro encontrado.");
				}
			}
		});
		btnPesquisar.setBounds(160, 220, 110, 30);
		SearchScreen.add(btnPesquisar);
	}

}
