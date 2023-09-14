/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CadastroAlunos;
import DTO.FrequenciaDTO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 3°Ano Info
 */
public class FrequenciaAlunos {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FrequenciaDTO> listar = new ArrayList<>();
    

    
    //cadastrar Frequência
    public void cadastrarFrequencia(FrequenciaDTO objfrequenciadto) {

        String sql = "insert into frequencia ( nome, turma) values (?,?)";

        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objfrequenciadto.getNome());
            pstm.setString(2, objfrequenciadto.getTurma());
         
            
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Frequencia registrada: " + erro);

        }

    }
    
    
    //Pesquisar frequência na tabela
     public ArrayList<FrequenciaDTO> PesquisarFrequencia() {
        String sql = "select * from frequencia";

        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                FrequenciaDTO objfrequenciadto = new FrequenciaDTO();
                objfrequenciadto.setFrequencia(rs.getString("frequencia"));
                objfrequenciadto.setNome(rs.getString("nome"));  
                objfrequenciadto.setData(rs.getString("data"));
                objfrequenciadto.setTurma(rs.getString("turma"));
             
      
             
                
                

                listar.add(objfrequenciadto);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroAlunos Pesquisar: " + erro);
        }
        return listar;
    }
     
     
     
     
     //Pesquisar Frequencia
        public ArrayList<FrequenciaDTO> readForFrequencia(String frequencia, String frequenciaby) {
        String sql = "select * from frequencia where "+frequenciaby+" like '%"+frequencia+"%'";

        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();
      

            while (rs.next()) {
                FrequenciaDTO objfrequenciadto = new FrequenciaDTO();
               
                objfrequenciadto.setNome(rs.getString("nome"));
                objfrequenciadto.setTurma(rs.getString("turma"));
                objfrequenciadto.setData(rs.getString("data"));
                objfrequenciadto.setFrequencia(rs.getString("frequencia"));

                listar.add(objfrequenciadto);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroAlunos Pesquisar: " + erro);
        }
        return listar;
    }
        
  public ResultSet carrFoto(String matricula) {
        String sql = "select * from alunos where matricula_aluno = ?";

        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1,matricula);
            return pstm.executeQuery();
     

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroAlunos Pesquisar: " + erro);
            return null;
        }
        
    }
  
  //tabela frequencia alunos 02
  
   public ArrayList<FrequenciaDTO> PesquisarFrequencia02(String frequencia) {
        String sql = "select * from frequencia where nome = '"+frequencia+"'";

        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                FrequenciaDTO objfrequenciadto = new FrequenciaDTO();
                objfrequenciadto.setFrequencia(rs.getString("frequencia"));
                objfrequenciadto.setData(rs.getString("data"));


                listar.add(objfrequenciadto);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroAlunos Pesquisar: " + erro);
        }
        return listar;
    }
   
   
}
