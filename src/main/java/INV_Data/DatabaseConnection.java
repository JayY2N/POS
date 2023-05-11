/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INV_Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author YYN
 */
public class DatabaseConnection {
    Connection Conn = null;
   String url = "jdbc:postgresql://localhost/POS_DB";
   String user = "postgres";
   String password = "admin1";
   public Connection databaseConn() {

       try {
           Conn = DriverManager.getConnection(url, user, password);

       } catch (SQLException ex) {
           Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
        return Conn;
   }

    
}
