package compilador;


/*COLOCAR NA CLASSE (Scanner_1TokenManager.java)
    AnalizarLexico analizarlexico;
    public ArrayList<String> Painel2 = new ArrayList<>();
    int countLexError;

Painel2.add("\u005cnErro lexico -> "+"  1  "+jjmatchedKind+"  2  "+jjmatchedPos+" Caractere numero "+jjround+"  4  "+jjnewStateCnt+"  5  "+defaultLexState+"  6  "+curLexState+"  "+image);
                          analizarlexico.Lista(Painel2);
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.console;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import compilador.Scanner_1; //libreria que debo importar

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jordenir
 */
public class AnalizarLexico extends javax.swing.JFrame {

    public String EnderecoArquivo,EnderecoTemporario,bufferIn;
        public String data ;
        public int resultadoJanelas;
        public ArrayList<String> Numero = new ArrayList<>();
        public ArrayList<String> Identificador = new ArrayList<>();
        public ArrayList<String> Operador = new ArrayList<>();
        public ArrayList<String> Separador = new ArrayList<>();
        public ArrayList<String> Palavra = new ArrayList<>();
        
        ArrayList<String> nova = new ArrayList<>();
    
    /**
     * Creates new form AnalizarLexico
     */
       
    public AnalizarLexico() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Botao_Analizar_lexico = new javax.swing.JToggleButton();
        Botao_analizar_sintax = new javax.swing.JToggleButton();
        Botao_Abrir_Arquivo = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea2);

        jToggleButton2.setText("Limpar saida");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Limpar Entrada");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Limpar tudo");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Saida de dados");

        jLabel2.setText("Entrada de dados");

        jToggleButton1.setText("Atualizar Saida");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Botao_Analizar_lexico.setText("Analizar Lex");
        Botao_Analizar_lexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Analizar_lexicoActionPerformed(evt);
            }
        });

        Botao_analizar_sintax.setText("Analizar Sintax");
        Botao_analizar_sintax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_analizar_sintaxActionPerformed(evt);
            }
        });

        Botao_Abrir_Arquivo.setText("Abrir Arquivo");
        Botao_Abrir_Arquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Abrir_ArquivoActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItem2.setText("Abrir Arquivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Analizar");

        jMenuItem1.setText("Analisar Sintático");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem5.setText("Analisar Somente léxico");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Mostrar");

        jMenuItem4.setText("Listar Lexico");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Botao_Analizar_lexico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Botao_Abrir_Arquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Botao_analizar_sintax, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Botao_Abrir_Arquivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botao_Analizar_lexico))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(Botao_analizar_sintax)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
        Analise();
        } catch (IOException ex) {
        Logger.getLogger(AnalizarLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser openFile = new JFileChooser();
                openFile.showOpenDialog(openFile);
                resultadoJanelas = JFileChooser.OPEN_DIALOG;
                
                if(JFileChooser.APPROVE_OPTION == resultadoJanelas){
                          EnderecoArquivo = openFile.getSelectedFile().toString();
                          AbrirArquivo();
                }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        MostrarNoPainel();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       
       jTextArea2.setText("");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        jTextArea1.setText("");
        jTextArea2.setText("");
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       try {
        AnaliseLexSomente();
        } catch (IOException ex) {
        Logger.getLogger(AnalizarLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       jTextArea2.setText("");
       MostrarNoPainel();
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void Botao_Analizar_lexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Analizar_lexicoActionPerformed
        try {
        AnaliseLexSomente();
        } catch (IOException ex) {
        Logger.getLogger(AnalizarLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextArea2.setText("");
       MostrarNoPainel();
    }//GEN-LAST:event_Botao_Analizar_lexicoActionPerformed

    private void Botao_analizar_sintaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_analizar_sintaxActionPerformed
        try {
        Analise();
        } catch (IOException ex) {
        Logger.getLogger(AnalizarLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextArea2.setText("");
       MostrarNoPainel();
    }//GEN-LAST:event_Botao_analizar_sintaxActionPerformed

    private void Botao_Abrir_ArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Abrir_ArquivoActionPerformed
        JFileChooser openFile = new JFileChooser();
                openFile.showOpenDialog(openFile);
                resultadoJanelas = JFileChooser.OPEN_DIALOG;
                
                if(JFileChooser.APPROVE_OPTION == resultadoJanelas){
                          EnderecoArquivo = openFile.getSelectedFile().toString();
                          AbrirArquivo();
                }
    }//GEN-LAST:event_Botao_Abrir_ArquivoActionPerformed

    private void AbrirArquivo(){
                 try{
                          FileReader fileReader = new FileReader(EnderecoArquivo);
                          BufferedReader reader = new BufferedReader(fileReader);
                          while((data = reader.readLine()) != null){
                                 jTextArea1.append(data+"\n");
                         }
                         fileReader.close();
                         reader.close();
                 }
                 catch(Exception erro){
                         JOptionPane.showMessageDialog(null, erro.getMessage());
                 }
         }
    
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
            java.util.logging.Logger.getLogger(AnalizarLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalizarLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalizarLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalizarLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalizarLexico().setVisible(true);
            }
        });
    }

public void MostrarNoPainel(){
    jTextArea2.insert(String.valueOf(nova2), jTextArea2.getCaretPosition());
}

static ArrayList<String> nova2;

     public static void Lista(ArrayList<String> nova){
            //System.out.println(nova);
            nova2 = nova;
        }
    Scanner_1 scanner;
    Scanner_1 parser;
    int i;
    boolean ms = false;
    boolean debug = false;
    
    private void Analise() throws IOException{
                
                 EnderecoTemporario =  System.getProperty("java.io.tmpdir")+"temp.txt";
                 File arquivo = new File(EnderecoTemporario);  
                 FileWriter fw = new FileWriter(arquivo);  
                 BufferedWriter bw = new BufferedWriter(fw);      
                 bw.write(jTextArea1.getText());  
                 bw.flush();  
                 bw.close(); 
                 
      
                 
                 String nomeArq = new String (EnderecoTemporario);
Scanner_1 lex = new Scanner_1(new FileInputStream(nomeArq));
String args[] = null;
try {
          
lex.processa(); //processamento dos lexemas 
//lex.INIT();

}

catch (Exception e)
{
JOptionPane.showMessageDialog(null, "Analise Sintaxica NOT OK");
System.out.println("Erro de Token.");
//System.out.println(e.getMessage()+"MAIS nadaaaaaa");
e.printStackTrace();
}
catch (Error e)
{
System.out.println(e.getMessage());//Mensagem de erro léxico (em ingles) mostrando linha e coluna
}
                 
        }
     private void AnaliseLexSomente() throws IOException{
                
                //archivo temporalal ne tmp
                        EnderecoTemporario =  System.getProperty("java.io.tmpdir")+"temp.txt";
                 File arquivo = new File(EnderecoTemporario);  
                 FileWriter fw = new FileWriter(arquivo);  
                 BufferedWriter bw = new BufferedWriter(fw);      
                 bw.write(jTextArea1.getText());  
                 bw.flush();  
                 bw.close(); 
                 
      
                 
                 String nomeArq = new String (EnderecoTemporario);
Scanner_1 lex = new Scanner_1(new FileInputStream(nomeArq));
String args[] = null;
try {
          
lex.processa(); //processamento dos lexemas 

}

catch (Exception e)
{
JOptionPane.showMessageDialog(null, "Analise Sintaxica NOT OK");
System.out.println("Erro de Token.");

e.printStackTrace();
}
catch (Error e)
{
System.out.println(e.getMessage());//Mensagem de erro léxico (em ingles) mostrando linha e coluna
}     
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Botao_Abrir_Arquivo;
    private javax.swing.JToggleButton Botao_Analizar_lexico;
    private javax.swing.JToggleButton Botao_analizar_sintax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
