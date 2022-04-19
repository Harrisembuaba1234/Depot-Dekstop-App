/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectrumahmakan;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Koneksi {
     public static Connection con;
     public static Statement stm;
 public static Connection configDB()throws SQLException{
 try {
	 String url="jdbc:mysql://localhost:3306/rumah_makan"; //url database
	 String user="root"; //user database
	 String pass=""; //password database
       Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection(url, user, pass);
         stm = con.createStatement();
         System.out.println("Koneksi Berhasil");
} catch (Exception e) {
	 System.err.println("koneksi gagal "+e.getMessage());
	 //perintah menampilkan error pada koneksi
}
   return con;
}
}
     





