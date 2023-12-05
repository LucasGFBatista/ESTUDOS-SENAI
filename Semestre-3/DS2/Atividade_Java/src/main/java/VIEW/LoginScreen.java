package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;

public class LoginScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

/*Inciar aplicação daqui*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
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
	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		ImageIcon logoIcon = new ImageIcon("C:\\xampp\\htdocs\\ESTUDOS-SENAI\\Semestre-3\\DS2\\Atividade_Java\\src\\main\\java\\assets\\logo.png");
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 JLabel logoLabel = new JLabel(logoIcon);
	        logoLabel.setBounds(10, 30, 230, 210);  
	        contentPane.add(logoLabel);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLogin.setBounds(312, 32, 65, 30);
		contentPane.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSenha.setBounds(312, 121, 71, 33);
		contentPane.add(lblSenha);

		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(312, 72, 260, 30);
		contentPane.add(formattedTextField);

		passwordField = new JPasswordField();
		passwordField.setBounds(312, 165, 260, 30);
		contentPane.add(passwordField);

		Button btnAcess = new Button("Acessar");

		btnAcess.setBounds(262, 220, 110, 30);
		contentPane.add(btnAcess);
		btnAcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen mainScreenFrama = new MainScreen();
				mainScreenFrama.setVisible(true);
				LoginScreen.this.dispose();

			}
		});

	}
}
