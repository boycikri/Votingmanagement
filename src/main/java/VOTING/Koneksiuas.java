/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VOTING;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class Koneksiuas {
    public static Connection konek () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection konekDB = DriverManager.getConnection("jdbc:mysql://localhost/pemilihan","root","");
            return konekDB;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
