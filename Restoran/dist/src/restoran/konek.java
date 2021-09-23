package restoran;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author v-nadia.izzati
 */
public class konek {
 
    static Connection Koneksi;
    public static Connection getConnection(){
        try{
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/restoran","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi database GAGAL");
        }
        return Koneksi; 
    }
}

