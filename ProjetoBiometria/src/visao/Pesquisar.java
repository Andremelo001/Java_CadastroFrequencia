/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import DAO.CadastrarDAO;
import DAO.FrequenciaAlunos;
import DTO.CadastroAlunos;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 3°Ano Info
 */
public class Pesquisar extends javax.swing.JFrame {

   

    /**
     * Creates new form Pesquisar
     */
    public Pesquisar() {
        initComponents();
        listarValoresAlunos();
    }
    
  
    static String foto;
    static String idaluno ;
    static String nomealuno;
    static  String matriculaaluno;
    static String turmaaluno;
    
    private void limparcampos(){
        txtPesquisarValores.setText("");
    }
   
    private void CarrCampos(String matricula) throws IOException, SQLException {
        FrequenciaAlunos objfrequenciaalunos = new FrequenciaAlunos();
         ResultSet rs = objfrequenciaalunos.carrFoto(matricula);

        try {
            while (rs.next()) {
              foto = rs.getString("foto_aluno");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        btnCarregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTurma = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        txtPesquisarValores = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        comPesquisa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Alef", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Frequência de Alunos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 10, 300, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisarnew96.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(560, 10, 110, 120);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(40, 60, 600, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete_102866_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(820, 0, 50, 50);

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Aluno", "Nome", "Matricula", "Turma"
            }
        ));
        jScrollPane1.setViewportView(tabelaAlunos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 150, 480, 320);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("      Voltar");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 130, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(720, 510, 130, 40);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(680, 90, 110, 40);

        btnPesquisar.setBackground(new java.awt.Color(51, 153, 255));
        btnPesquisar.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar);
        btnPesquisar.setBounds(400, 110, 120, 30);

        jLabel5.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(560, 200, 130, 60);

        txtId.setBackground(new java.awt.Color(51, 153, 255));
        txtId.setFont(new java.awt.Font("Alef", 0, 15)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId);
        txtId.setBounds(560, 180, 180, 30);

        jLabel6.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Matricula");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 280, 90, 40);

        txtNome.setBackground(new java.awt.Color(51, 153, 255));
        txtNome.setFont(new java.awt.Font("Alef", 0, 15)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtNome.setEnabled(false);
        jPanel1.add(txtNome);
        txtNome.setBounds(560, 250, 180, 30);

        jLabel8.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Turma:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(560, 340, 90, 60);

        txtMatricula.setBackground(new java.awt.Color(51, 153, 255));
        txtMatricula.setFont(new java.awt.Font("Alef", 0, 15)); // NOI18N
        txtMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtMatricula.setEnabled(false);
        jPanel1.add(txtMatricula);
        txtMatricula.setBounds(560, 320, 180, 30);

        btnCarregar.setBackground(new java.awt.Color(51, 153, 255));
        btnCarregar.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        btnCarregar.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregar.setText("Carregar");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarregar);
        btnCarregar.setBounds(560, 430, 120, 40);

        jLabel9.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Id_Aluno");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(560, 130, 110, 60);

        txtTurma.setBackground(new java.awt.Color(51, 153, 255));
        txtTurma.setFont(new java.awt.Font("Alef", 0, 15)); // NOI18N
        txtTurma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtTurma.setEnabled(false);
        jPanel1.add(txtTurma);
        txtTurma.setBounds(560, 390, 180, 30);

        btnLimpar.setBackground(new java.awt.Color(51, 153, 255));
        btnLimpar.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar);
        btnLimpar.setBounds(700, 430, 120, 40);

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 490, 130, 40);

        btnImprimir.setBackground(new java.awt.Color(51, 153, 255));
        btnImprimir.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pdf.png"))); // NOI18N
        btnImprimir.setText("Baixar ");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir);
        btnImprimir.setBounds(380, 490, 140, 40);

        txtPesquisarValores.setBackground(new java.awt.Color(51, 153, 255));
        txtPesquisarValores.setFont(new java.awt.Font("Alef", 0, 15)); // NOI18N
        txtPesquisarValores.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisarValores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtPesquisarValores);
        txtPesquisarValores.setBounds(160, 110, 230, 30);

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Frequência");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 490, 130, 40);

        comPesquisa.setFont(new java.awt.Font("Alef", 0, 15)); // NOI18N
        comPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        comPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Turma" }));
        jPanel1.add(comPesquisa);
        comPesquisa.setBounds(40, 110, 110, 30);

        jLabel3.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pesquisar por:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 70, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 870, 570);

        setSize(new java.awt.Dimension(870, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        DiracionamentoPB tela = new DiracionamentoPB();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        pesquisarValoresAlunos(txtPesquisarValores.getText());
        LimparCampos();
        limparcampos();
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
         CarregarCampos();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        EditarUsuarios tela = new EditarUsuarios();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CarregarCamposEditar();
        try {
            CarrCampos(txtMatricula.getText());
        } catch (IOException ex) {
            Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
                try {
            tabelaAlunos.print(javax.swing.JTable.PrintMode.FIT_WIDTH,
                    new java.text.MessageFormat("Informações dos Alunos"), // titulo da pagina
                    new java.text.MessageFormat("Page {0}"));
        } catch (java.awt.print.PrinterException e) {
            JOptionPane.showMessageDialog(this, "Erro ao tentar imprimir!\n"
                    + e.getMessage());
        }

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Frequencia tela = new Frequencia();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> comPesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaAlunos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisarValores;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables

    public void listarValoresAlunos() {
        try {

            CadastrarDAO objcadastrardao = new CadastrarDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaAlunos.getModel();
            model.setNumRows(0);

            ArrayList<CadastroAlunos> lista = objcadastrardao.PesquisarAlunos();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    
                    lista.get(num).getId_aluno(),
                    lista.get(num).getAluno(),
                    lista.get(num).getMatricula(),
                    lista.get(num).getTurma()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores: " + erro);
        }
    }
       public void pesquisarValoresAlunos(String pesquisa) {
       
   final String NOME = "nome_aluno";
   final String TURMA = "turma_aluno";
            CadastrarDAO objcadastrardao = new CadastrarDAO();
  if(comPesquisa.getSelectedItem().equals("Nome")){
   try {
       DefaultTableModel model = (DefaultTableModel) tabelaAlunos.getModel();
            model.setNumRows(0);

            ArrayList<CadastroAlunos> lista = objcadastrardao.readForDesc(pesquisa,NOME);

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_aluno(),
                    lista.get(num).getAluno(),
                    lista.get(num).getMatricula(),
                    lista.get(num).getTurma()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores: " + erro);
        }
   } else if(comPesquisa.getSelectedItem().equals("Turma")){
   try {
       DefaultTableModel model = (DefaultTableModel) tabelaAlunos.getModel();
            model.setNumRows(0);

            ArrayList<CadastroAlunos> lista = objcadastrardao.readForDesc(pesquisa,TURMA);

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_aluno(),
                    lista.get(num).getAluno(),
                    lista.get(num).getMatricula(),
                    lista.get(num).getTurma()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores: " + erro);
        }
   }
  }
            
    
       
    private void CarregarCampos(){
        
        int setar = tabelaAlunos.getSelectedRow();
        
        txtId.setText(tabelaAlunos.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaAlunos.getModel().getValueAt(setar, 1).toString());
        txtMatricula.setText(tabelaAlunos.getModel().getValueAt(setar, 2).toString());
        txtTurma.setText(tabelaAlunos.getModel().getValueAt(setar, 3).toString());
        
    }
    
    private void LimparCampos(){
        txtId.setText("");
        txtNome.setText("");
        txtMatricula.setText("");
        txtTurma.setText("");
        txtNome.requestFocus();
        
    }
    
    private void CarregarCamposEditar(){
        int setar = tabelaAlunos.getSelectedRow();
        
        idaluno = tabelaAlunos.getModel().getValueAt(setar,0).toString();
        nomealuno = tabelaAlunos.getModel().getValueAt(setar,1).toString();
        matriculaaluno = tabelaAlunos.getModel().getValueAt(setar,2).toString();
        turmaaluno = tabelaAlunos.getModel().getValueAt(setar,3).toString();
    }
    
    
    
    

}