/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAXnya;

/**
 *
 * @author ArifS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PAX_7 { // koneksi ke database
    private static Connection mysqlkonek;
    public static Connection koneksiDB() {
        if(mysqlkonek==null){
            try {
                String DB="jdbc:mysql://localhost/web-cis"; //  database
                String user="root"; // user database
                String pass=""; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek = (Connection) DriverManager.getConnection(DB,user,pass);
                JOptionPane.showMessageDialog(null,"tersambung koneksi 7");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"gagal koneksi");
            }
        }
        return mysqlkonek;
    }
    public static void main(String[] args) {
        PAX_7.koneksiDB();
    }
}
