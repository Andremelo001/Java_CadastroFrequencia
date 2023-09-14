/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author 3°Ano Info
 */
public class ConexaoDAO {
    public String driver = "com.mysql.jdbc.Driver";
    public Connection conexaoBD(){
        Connection conn = null;
        
        
        try{
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/projetojavabd?user=root&password=";
            conn = DriverManager.getConnection(url);
         
      
    } catch (Exception erro){
        JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
    }
        return conn;
    
    }

   
}
