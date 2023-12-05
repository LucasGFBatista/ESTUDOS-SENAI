package VIEW;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.BookDAO;
import DTO.BookDTO;

import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CreateBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel CadastrarLivro;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtAnoPublic;
	private JTextField txtISBN;



	/*Criar freme*/
	public CreateBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		CadastrarLivro = new JPanel();
		CadastrarLivro.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(CadastrarLivro);
		CadastrarLivro.setLayout(null);

		// Título da Janela
		JTextArea h1CadastrarLivro = new JTextArea();
		h1CadastrarLivro.setEditable(false);
		h1CadastrarLivro.setBackground(new Color(240, 240, 240));
		h1CadastrarLivro.setFont(new Font("Monospaced", Font.BOLD, 24));
		h1CadastrarLivro.setText("Cadastrar Livro");
		h1CadastrarLivro.setBounds(150, 10, 230, 40);
		CadastrarLivro.add(h1CadastrarLivro);

		// Campos e Labels
		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(70, 70, 80, 20);
		CadastrarLivro.add(lblTitulo);
		txtTitulo = new JTextField();
		txtTitulo.setBounds(170, 70, 200, 20);
		CadastrarLivro.add(txtTitulo);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(70, 110, 80, 20);
		CadastrarLivro.add(lblAutor);
		txtAutor = new JTextField();
		txtAutor.setBounds(170, 110, 200, 20);
		CadastrarLivro.add(txtAutor);

		JLabel lblAnoPublicacao = new JLabel("Ano Publicação");
		lblAnoPublicacao.setBounds(70, 150, 100, 20);
		CadastrarLivro.add(lblAnoPublicacao);
		txtAnoPublic = new JTextField();
		txtAnoPublic.setBounds(170, 150, 200, 20);
		CadastrarLivro.add(txtAnoPublic);

		JLabel lblISBN = new JLabel("ISBN");
		lblISBN.setBounds(70, 190, 80, 20);
		CadastrarLivro.add(lblISBN);
		txtISBN = new JTextField();
		txtISBN.setBounds(170, 190, 200, 20);
		CadastrarLivro.add(txtISBN);

		// Botões
		//Botao cadastrar
		ImageIcon iconCreate = new ImageIcon("C:\\xampp\\htdocs\\ESTUDOS-SENAI\\Semestre-3\\DS2\\Atividade_Java\\src\\main\\java\\assets\\add.png");
		JButton btnCadastrar = new JButton("Cadastrar",iconCreate);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCadastrarBookActionPerformed(e);
			}
		});
		btnCadastrar.setBounds(150, 220, 120, 30);
		CadastrarLivro.add(btnCadastrar);

		//botão retornar
		JButton btnRetornar = new JButton("← Retornar");
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen mainScreenFrama = new MainScreen();
				CreateBook.this.dispose();
				mainScreenFrama.setVisible(true);
			}
		});
		btnRetornar.setBounds(10, 10, 110, 30);
		CadastrarLivro.add(btnRetornar);
	}

	// Função de BOTÃO CADASTRAR LIVROS NO BANCO DE DADOS
	private void btnCadastrarBookActionPerformed(java.awt.event.ActionEvent e) {
		String titulo, autor, isbn;
		int anoPublicacao;

		titulo = txtTitulo.getText();
		autor = txtAutor.getText();
		anoPublicacao = Integer.parseInt(txtAnoPublic.getText());
		isbn = txtISBN.getText();

		BookDTO objBookDTO = new BookDTO();
		objBookDTO.setTitulo(titulo);
		objBookDTO.setAutor(autor);
		objBookDTO.setAnoPublicacao(anoPublicacao);
		objBookDTO.setIsbn(isbn);

		BookDAO objBookDAO = new BookDAO();
		objBookDAO.insertBook(objBookDTO);
		
		MainScreen mainScreenFrama = new MainScreen();
		CreateBook.this.dispose();
		mainScreenFrama.setVisible(true);
	}

}
