
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Gonçalves
 */
public class ConnectionDAO {
    public Connection connectBd( ){
        Connection conn = null;
        
        try {
        String url = "jdbc:mysql://localhost/bibliotecadb?user=root&password=";
        conn = DriverManager.getConnection(url);
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog( null, erro.getMessage());
        }
        return conn;
    }
}