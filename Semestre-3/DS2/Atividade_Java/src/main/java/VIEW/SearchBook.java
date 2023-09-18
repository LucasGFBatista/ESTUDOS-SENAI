package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;

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
		txtH1.setText("Pesquisar Livro");
		txtH1.setFont(new Font("Monospaced", Font.PLAIN, 24));
		txtH1.setBackground(UIManager.getColor("Button.background"));
		txtH1.setBounds(118, 11, 215, 37);
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
		textField.setBounds(129, 59, 200, 20);
		SearchScreen.add(textField);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(29, 99, 80, 20);
		SearchScreen.add(lblAutor);

		textField_1 = new JTextField();
		textField_1.setBounds(129, 99, 200, 20);
		SearchScreen.add(textField_1);

		JLabel lblAnoPublicacao = new JLabel("Ano Publicação");
		lblAnoPublicacao.setBounds(29, 139, 100, 20);
		SearchScreen.add(lblAnoPublicacao);

		textField_2 = new JTextField();
		textField_2.setBounds(129, 139, 200, 20);
		SearchScreen.add(textField_2);

		JLabel lblISBN = new JLabel("ISBN");
		lblISBN.setBounds(29, 179, 80, 20);
		SearchScreen.add(lblISBN);

		textField_3 = new JTextField();
		textField_3.setBounds(129, 179, 200, 20);
		SearchScreen.add(textField_3);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(119, 219, 110, 30);
		SearchScreen.add(btnPesquisar);
	}
}
