package koneksidb;
import java.sql.*;
import javax.swing.*;

public class koneksi_db {
    Connection koneksi_db;
    
    public static Connection koneksi_db() {
        try {
            String host = "jdbc:mysql://localhost/aplikasi_kasir";
            String user = "root";
            String pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi_db = DriverManager.getConnection(host,user,pass);
            System.out.println("koneksi berhasil");
            return koneksi_db;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("koneksi gagal "+ e);
            return null;
        }
    }
}
