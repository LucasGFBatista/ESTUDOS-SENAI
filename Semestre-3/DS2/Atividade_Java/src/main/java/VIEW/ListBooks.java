package VIEW;

import DAO.BookDAO;
import DTO.BookDTO;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
        scrollPane.setBounds(10, 40, 564, 300);
        ListBookScreen.add(scrollPane);
        
        tableBooks = new JTable();
        scrollPane.setViewportView(tableBooks);

        JButton btnReturn = new JButton("← Retornar");
        btnReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainScreen mainScreen = new MainScreen();
                mainScreen.setVisible(true);
                dispose();
            }
        });
        btnReturn.setBounds(10, 10, 110, 25);
        ListBookScreen.add(btnReturn);

        populateTable();
    }

    private void populateTable() {
        BookDAO bookDAO = new BookDAO();
        List<BookDTO> books = bookDAO.getAllBooks();

        String[][] data = new String[books.size()][5];
        String[] columnNames = {"ID", "Título", "Autor", "Ano Publicação", "ISBN", "Excluir"};

        for (int i = 0; i < books.size(); i++) {
            BookDTO book = books.get(i);
            data[i][0] = String.valueOf(book.getId());
            data[i][1] = book.getTitulo();
            data[i][2] = book.getAutor();
            data[i][3] = String.valueOf(book.getAnoPublicacao());
            data[i][4] = book.getIsbn();
            //data[i][5] = "Excluir";
        }

        tableBooks.setModel(new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int column) {
                if (column == 5) return JButton.class;
                return Object.class;
            }
        });
        
        // Aqui você adicionará a funcionalidade de exclusão.
    }
}
