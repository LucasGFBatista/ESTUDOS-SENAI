package VIEW;
import DAO.BookDAO;
import DTO.BookDTO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.Color;
import java.awt.Font;
public class ListBooks extends JFrame {
    private JPanel ListBookScreen;
    private JTable tableBooks;
    public ListBooks() {
    	
    	
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        ListBookScreen = new JPanel();
        ListBookScreen.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(ListBookScreen);
        ListBookScreen.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 55, 564, 240);
        ListBookScreen.add(scrollPane);
        
        
    	//Botão retornar
        JButton btnReturn = new JButton("← Retornar");
        btnReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainScreen mainScreen = new MainScreen();
                mainScreen.setVisible(true);
                dispose();
            }
        });
        btnReturn.setBounds(10, 10, 110, 30);
        ListBookScreen.add(btnReturn);
        
        
        tableBooks = new JTable();
        tableBooks.setCellSelectionEnabled(true);
        tableBooks.setSurrendersFocusOnKeystroke(true);
        tableBooks.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(tableBooks);
        
        JTextArea txtH1 = new JTextArea();
        txtH1.setEditable(false);
        txtH1.setFont(new Font("Monospaced", Font.BOLD, 24));
        txtH1.setBackground(new Color(240, 240, 240));
        txtH1.setText("Lista de Livros");
        txtH1.setBounds(150, 10, 230, 40);
        ListBookScreen.add(txtH1);
       
		// Botão de deletar e imagem
		ImageIcon iconDel = new ImageIcon("/Atividade_Java/src/main/java/assets/delete.png");
		JButton btnDel = new JButton("Deletar", iconDel);
		btnDel.setLocation(352, 310);
		btnDel.setSize(110, 30);
		ListBookScreen.add(btnDel);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDelBookActionPerformed(e);
			}
		});

		// Botão de atualizar e imagem
		ImageIcon iconUpdate = new ImageIcon("/Atividade_Java/src/main/java/assets/edit.png");
		JButton btnUpdate = new JButton("Atulizar", iconUpdate);
		btnUpdate.setLocation(121, 310);
		btnUpdate.setSize(110, 30);
		ListBookScreen.add(btnUpdate);
        
        
        populateTable();
        
        
    }
    //MOSTRAR TABELA
    private void populateTable() {
        BookDAO bookDAO = new BookDAO();
        List<BookDTO> books = bookDAO.getAllBooks();
        
        String[][] data = new String[books.size()][5];
        String[] columnNames = {"ISBN","Título", "Autor", "Ano Publicação"};
        for (int i = 0; i < books.size(); i++) {
            BookDTO book = books.get(i);
            //data[i][0] = String.valueOf(book.getId());
            data[i][0] = book.getIsbn();
            data[i][1] = book.getTitulo();
            data[i][2] = book.getAutor();
            data[i][3] = String.valueOf(book.getAnoPublicacao());
            
            
        }
        tableBooks.setModel(new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int column) {
                if (column == 5) return JButton.class;
                return Object.class;
            }
        });

                
    }
    
    private void btnDelBookActionPerformed(ActionEvent e) {
		int selectedRow = tableBooks.getSelectedRow();
		if (selectedRow != -1) {
			String isbn = (String) tableBooks.getValueAt(selectedRow, 0); 
																			
			BookDAO bookDAO = new BookDAO();
			bookDAO.deleteBook(isbn);
			populateTable();
			JOptionPane.showMessageDialog(null, "Livro deletado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Por favor, selecione um livro para deletar.");
		}
	}
    
}