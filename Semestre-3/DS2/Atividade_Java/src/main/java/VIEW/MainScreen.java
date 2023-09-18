package VIEW;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel MainScreen;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		MainScreen = new JPanel();
		MainScreen.setBorder(new EmptyBorder(5, 5, 5, 5));
		MainScreen.setLayout(null); 
		setContentPane(MainScreen);

		JTextArea txtH1 = new JTextArea();
		txtH1.setFont(new Font("Monospaced", Font.BOLD, 25));
		txtH1.setBackground(new Color(240, 240, 240));
		txtH1.setText("Menu Livros");
		txtH1.setBounds(140, 10, 180, 40);  
		MainScreen.add(txtH1);

		
		JButton btnVisualizar = new JButton("Visualizar Livros");
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListBooks listBooksFrame = new ListBooks();
	            listBooksFrame.setVisible(true);
			}
		});
		btnVisualizar.setBounds(140, 70, 150, 30);
		MainScreen.add(btnVisualizar);

		
		JButton btnPesquisar = new JButton("Pesquisar Livros");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchBook searchBook = new SearchBook();
				searchBook.setVisible(true);
			}
		});
		btnPesquisar.setBounds(140, 110, 150, 30);
		MainScreen.add(btnPesquisar);

			
		JButton btnCadastrar = new JButton("Cadastrar Livro");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateBook createBookFrame = new CreateBook();
	            createBookFrame.setVisible(true);
			}
		});
		btnCadastrar.setBounds(140, 150, 150, 30);
		MainScreen.add(btnCadastrar);
	}
}
