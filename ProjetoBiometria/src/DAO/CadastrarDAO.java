/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CadastroAlunos;
import DTO.FrequenciaDTO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 3°Ano Info
 */
public class CadastrarDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CadastroAlunos> lista = new ArrayList<>();
    ArrayList<FrequenciaDTO> listar = new ArrayList<>();

    //cadastrar Alunos
    public void cadastrarAluno(CadastroAlunos objcadastroalunos) {

        String sql = "insert into alunos (nome_aluno, turma_aluno, matricula_aluno, foto_aluno) values (?,?,?,?)";

        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objcadastroalunos.getAluno());
            pstm.setString(2, objcadastroalunos.getTurma());
            pstm.setString(3, objcadastroalunos.getMatricula());
            pstm.setString(4, objcadastroalunos.getFoto());
           

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "CadastrarAlunos Cadastrar: " + erro);

        }

    }

    
    //Pesquisar Alunos
    public ArrayList<CadastroAlunos> PesquisarAlunos() {
        String sql = "select * from alunos";

        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                CadastroAlunos objcadastroalunos = new CadastroAlunos();
                objcadastroalunos.setId_aluno(rs.getInt("id_aluno"));
                objcadastroalunos.setAluno(rs.getString("nome_aluno"));
                objcadastroalunos.setMatricula(rs.getString("matricula_aluno"));
                objcadastroalunos.setTurma(rs.getString("turma_aluno"));

                lista.add(objcadastroalunos);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroAlunos Pesquisar: " + erro);
        }
        return lista;
    }

    
    //Alterar Valores dos Alunos
    public void alterarAlunos(CadastroAlunos objcadastroalunos) {
        String sql = "update alunos set nome_aluno = ?, matricula_aluno = ?, turma_aluno = ? where id_aluno = ?";
        
        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objcadastroalunos.getAluno());
            pstm.setString(2, objcadastroalunos.getMatricula());
            pstm.setString(3, objcadastroalunos.getTurma());
            pstm.setInt(4, objcadastroalunos.getId_aluno());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "CadastrarAlunos Alterar: " + erro);

        }
    }
        
    
    //Excluir alunos
        public void excluirAlunos(CadastroAlunos objcadastroalunos){
            String sql = "delete from alunos where id_aluno = ?";
            
            conn = (Connection) new ConexaoDAO().conexaoBD();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, objcadastroalunos.getId_aluno());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "CadastrarAlunos Excluir: " + erro);

        }
        }
        
        
        //Pesquisar Valores dos Alunos na tabela
        public ArrayList<CadastroAlunos> readForDesc(String pesquisa, String pesquisaby) {
        String sql = "select * from alunos where "+pesquisaby+" like '%"+pesquisa+"%'";

        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();
      

            while (rs.next()) {
                CadastroAlunos objcadastroalunos = new CadastroAlunos();
                objcadastroalunos.setId_aluno(rs.getInt("id_aluno"));
                objcadastroalunos.setAluno(rs.getString("nome_aluno"));
                objcadastroalunos.setMatricula(rs.getString("matricula_aluno"));
                objcadastroalunos.setTurma(rs.getString("turma_aluno"));

                lista.add(objcadastroalunos);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroAlunos Pesquisar: " + erro);
        }
        return lista;
    }
        
        
        
        
        
        //teste no login
        public ResultSet carrCampos(String nome) {
        String sql = "select * from alunos where matricula_aluno = ?";

        conn = (Connection) new ConexaoDAO().conexaoBD();

        try {
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1,nome);
            return pstm.executeQuery();
     

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroAlunos Pesquisar: " + erro);
            return null;
        }
        
    }
        
        
        
    }


