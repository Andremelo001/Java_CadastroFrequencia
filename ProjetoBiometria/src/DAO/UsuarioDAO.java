/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 3°Ano Info
 */
public class UsuarioDAO {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
        conn = (Connection) new ConexaoDAO().conexaoBD();
        
        try{
            String sql = "select * from conexaobd where nome_usuario = ? and senha_usuario = ?";
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + erro);
            return null;
        }
    
    
    }
    
      public ResultSet autenticacaoMatricula(CadastroAlunos matriculadto){
        conn = (Connection) new ConexaoDAO().conexaoBD();
        
        try{
            String sql = "select * from alunos where matricula_aluno = ?";
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, matriculadto.getMatricula());
           
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + erro);
            return null;
        }
   
        
        
    
    }
}
