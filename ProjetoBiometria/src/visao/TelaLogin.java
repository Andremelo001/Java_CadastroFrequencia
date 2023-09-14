/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import DAO.CadastrarDAO;
import DAO.FrequenciaAlunos;
import DAO.UsuarioDAO;
import DTO.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 3°Ano Info
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtnome = new javax.swing.JTextField();
        txtturma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbfotoAluno = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtMatricula = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(16, 38, 82));
        jPanel4.setLayout(null);
        jPanel4.add(jPanel3);
        jPanel3.setBounds(0, 20, 580, 10);
        jPanel4.add(jPanel2);
        jPanel2.setBounds(470, 0, 10, 570);

        txtnome.setEditable(false);
        txtnome.setBackground(new java.awt.Color(51, 153, 255));
        txtnome.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        txtnome.setForeground(new java.awt.Color(255, 255, 255));
        txtnome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(txtnome);
        txtnome.setBounds(100, 110, 270, 40);

        txtturma.setEditable(false);
        txtturma.setBackground(new java.awt.Color(51, 153, 255));
        txtturma.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        txtturma.setForeground(new java.awt.Color(255, 255, 255));
        txtturma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(txtturma);
        txtturma.setBounds(100, 250, 270, 40);

        jLabel3.setFont(new java.awt.Font("Alef", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(100, 70, 120, 40);

        jLabel4.setFont(new java.awt.Font("Alef", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Turma:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(100, 210, 90, 40);

        lbfotoAluno.setBackground(new java.awt.Color(51, 153, 255));
        lbfotoAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        foto.setFont(new java.awt.Font("Alef", 0, 15)); // NOI18N
        foto.setForeground(new java.awt.Color(255, 255, 255));
        foto.setText("  Foto do Aluno");

        javax.swing.GroupLayout lbfotoAlunoLayout = new javax.swing.GroupLayout(lbfotoAluno);
        lbfotoAluno.setLayout(lbfotoAlunoLayout);
        lbfotoAlunoLayout.setHorizontalGroup(
            lbfotoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbfotoAlunoLayout.createSequentialGroup()
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        lbfotoAlunoLayout.setVerticalGroup(
            lbfotoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbfotoAlunoLayout.createSequentialGroup()
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(lbfotoAluno);
        lbfotoAluno.setBounds(180, 350, 112, 132);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 480, 570);

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete_102866.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel2);
        jLabel2.setBounds(350, -10, 50, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brennda.png"))); // NOI18N
        jPanel5.add(jLabel6);
        jLabel6.setBounds(130, 70, 128, 128);

        jLabel8.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Digite sua Matrícula:");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(90, 230, 210, 30);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(90, 310, 210, 10);

        txtMatricula.setBackground(new java.awt.Color(16, 38, 82));
        txtMatricula.setFont(new java.awt.Font("Alef", 0, 20)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(255, 255, 255));
        txtMatricula.setBorder(null);
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyPressed(evt);
            }
        });
        jPanel5.add(txtMatricula);
        txtMatricula.setBounds(90, 270, 210, 40);
        jPanel5.add(jPanel6);
        jPanel6.setBounds(0, 670, 670, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sexo2.png"))); // NOI18N
        jPanel5.add(jLabel5);
        jLabel5.setBounds(60, 120, 260, 350);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Alef", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Administração");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 140, 40);

        jPanel5.add(jPanel1);
        jPanel1.setBounds(10, 10, 140, 40);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(480, 0, 400, 570);

        setSize(new java.awt.Dimension(873, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtMatricula.setFocusable(true);

    }//GEN-LAST:event_formWindowActivated

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed


    }//GEN-LAST:event_formKeyPressed

    private void txtMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {
            String mat = txtMatricula.getText();
            int confirm = JOptionPane.showConfirmDialog(this, "Essa é sua Matricula: "+mat, "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                 try {
                CarrCampos(txtMatricula.getText());
                
            }   catch (IOException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

         if(confirm==JOptionPane.YES_OPTION){
             CadastrarFrequenciaAlunos();
             locMatricula();
             LimparMatricula();
           
         }
         
       
            if (mat.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Digite sua matrícula!");
                txtMatricula.setFocusable(true);

            } else if(confirm==JOptionPane.NO_OPTION){

                
                LimparMatricula();
                
             

            }

        
         
        }


    }//GEN-LAST:event_txtMatriculaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    private void locMatricula() {
        try {
            String matricula;

            matricula = txtMatricula.getText();

            CadastroAlunos objusuariodto = new CadastroAlunos();
            objusuariodto.setMatricula(matricula);

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet matriculadto = objusuariodao.autenticacaoMatricula(objusuariodto);

            if (matriculadto.next()) {

                
                txtMatricula.setFocusable(true);

            } else {
                JOptionPane.showMessageDialog(null, "Matrícula não encontrada!");
                txtMatricula.setFocusable(true);

            }

        } catch (SQLException erro) {

        }
    }

    private void LimparMatricula() {
        txtMatricula.setText("");
        txtnome.setText("");
        txtturma.setText("");
        foto.setIcon(null);
        foto.revalidate();
        
    }

    //teste
    private void CarrCampos(String matricula) throws IOException {
        CadastrarDAO objcadastrardao = new CadastrarDAO();
        ResultSet rs = objcadastrardao.carrCampos(matricula);

        try {
            while (rs.next()) {
                ImageIcon imageIcon = new ImageIcon(rs.getString("foto_aluno"));

                Image image = imageIcon.getImage(); // transform it 
                Image newimg = image.getScaledInstance(110, 130, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way 
                /* Fim do código do redimensionamento */

                ImageIcon icon = new ImageIcon(newimg);
                txtnome.setText(rs.getString("nome_aluno"));
                txtturma.setText(rs.getString("turma_aluno"));
                foto.setIcon(icon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void CadastrarFrequenciaAlunos() {
        try {
            String nome, turma;

            nome = txtnome.getText();
            turma = txtturma.getText();

            FrequenciaDTO objfrequenciadto = new FrequenciaDTO();
            objfrequenciadto.setNome(nome);
            objfrequenciadto.setTurma(turma);

            FrequenciaAlunos objfrequenciaalunos = new FrequenciaAlunos();
            objfrequenciaalunos.cadastrarFrequencia(objfrequenciadto);

            JOptionPane.showMessageDialog(null, "Frequência registrada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aluno não Cadastrado: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel lbfotoAluno;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtturma;
    // End of variables declaration//GEN-END:variables
}