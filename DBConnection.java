/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
   Autor: Joel Otepa Wembo
 */
package hotelguest.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wembo Mulumba
 * @Email  otepaterry@gmail.com
 */
public class DBConnection {
    
      public Connection connect() {
        String dbURL = "jdbc:mysql://localhost:3306/housing";
       String username = "root";
       String password = "";
       Connection conn = null;
       try {
       //    Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(dbURL, username, password);
           if (conn != null) {
               System.out.println("Connected");
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
       }
       
       return conn;
   }
      
      
    
}
