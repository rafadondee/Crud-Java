/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CrudJava;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class Janela extends javax.swing.JFrame {
    ArrayList<Aluno> alunos = new ArrayList<>();
    /**
     * Creates new form Janela
     */
    public Janela() {
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

        tela = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JButton();
        btnExibir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tela.setBackground(new java.awt.Color(255, 255, 255));
        tela.setLayout(null);

        btnCadastro.setBackground(new java.awt.Color(0, 255, 102));
        btnCadastro.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        btnCadastro.setText("Cadastro");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        tela.add(btnCadastro);
        btnCadastro.setBounds(20, 180, 100, 30);

        btnExibir.setBackground(new java.awt.Color(51, 153, 255));
        btnExibir.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });
        tela.add(btnExibir);
        btnExibir.setBounds(140, 180, 100, 30);

        btnEditar.setBackground(new java.awt.Color(255, 255, 51));
        btnEditar.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        tela.add(btnEditar);
        btnEditar.setBounds(260, 180, 100, 30);

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        tela.add(btnExcluir);
        btnExcluir.setBounds(380, 180, 100, 30);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sala.jpg"))); // NOI18N
        tela.add(imagem);
        imagem.setBounds(0, 0, 510, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
       String nome = JOptionPane.showInputDialog(this, "Digite o nome:");
    if (nome.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nome não pode estar em branco.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; // Retorna sem adicionar o aluno
    }
    int idade = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite a idade:"));
    float altura = Float.parseFloat(JOptionPane.showInputDialog(this, "Digite a altura:"));
    String cpf = JOptionPane.showInputDialog(this, "Digite o cpf:");
    String matricula = JOptionPane.showInputDialog(this, "Digite a matrícula:");
    Aluno a = new Aluno(nome, altura, idade, cpf, matricula);
    alunos.add(a);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
     String saida = "Alunos:\n";
     for(Aluno a : alunos){
         saida += "\nNome: " +a.getNome();
         saida += "\nAltura: " +a.getAltura();
         saida += "\nIdade: " +a.getIdade();
         saida += "\nCpf: " +a.getCpf();
         saida += "\nMatricula: " +a.getMatricula();
         saida += "\n---------------------------";
     }
     JOptionPane.showMessageDialog(this, saida);
    }//GEN-LAST:event_btnExibirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
      
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         String identificador = JOptionPane.showInputDialog(this, "Digite a matrícula ou o CPF:");
         Aluno filtrado = filtro(identificador);
        if(filtrado == null){
         JOptionPane.showMessageDialog(this, "Matrícula ou CPF não encontrado!");
        }
        else{
            String mensagem = "O que deseja editar?\n";
            mensagem += "\nDigite 1 para 'nome'";
            mensagem += "\nDigite 2 para 'idade'";
            mensagem += "\nDigite 3 para 'altura'";
            mensagem += "\nDigite 4 para 'CPF'";
            mensagem += "\nDigite 5 para 'matrícula'";
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(this,mensagem));
            switch(escolha){
                case 1:
                    String nome = JOptionPane.showInputDialog(this,"Digite o novo nome!");
                    filtrado.setNome(nome);
                    break;
                case 2:
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite a idade:"));
                    filtrado.setIdade(idade);
                    break;
                case 3:
                    float altura = Float.parseFloat(JOptionPane.showInputDialog(this, "Digite a altura:"));
                    filtrado.setAltura(altura);
                    break;
                case 4:    
                    String cpf = JOptionPane.showInputDialog(this, "Digite o cpf:");
                    filtrado.setCpf(cpf);
                    break;
                case 5:
                    String matricula = JOptionPane.showInputDialog(this, "Digite a matrícula:");
                    filtrado.setMatricula(matricula);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(this, "Você não escolheu uma opção válida!");
                    
            }
    }
  
    }//GEN-LAST:event_btnEditarActionPerformed

       
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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExibir;
    private javax.swing.JLabel imagem;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables
}
