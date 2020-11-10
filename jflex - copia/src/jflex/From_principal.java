/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jflex;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.security.Principal;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



/**
 *
 * @author ivanb
 */
public class From_principal extends javax.swing.JFrame {

    String texto = "";
    String valores = "";
    
    public From_principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ruta = new javax.swing.JTextField();
        expresion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Vista = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Analizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        abrir.setText("Archivo");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        jButton3.setText("Validar RegEx");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaActionPerformed(evt);
            }
        });

        Vista.setColumns(20);
        Vista.setRows(5);
        jScrollPane1.setViewportView(Vista);

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane2.setViewportView(resultado);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Consola");

        Analizar.setText("Analizar");
        Analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                    .addComponent(expresion))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(abrir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Analizar)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(244, 244, 244))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(abrir)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Analizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String resultado1 = resultado.getText();
        guardarComo(resultado1);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void ExpresionRegular(String regex, String txt) {
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(txt);

        while (matcher.find()) {

            for (int i = 0; i <= matcher.groupCount(); i++) {

                valores += matcher.group(i) + "\n";
            }

        }
        resultado.setText(valores);

    }
    
    public void guardarComo(String cadena) {

        JFileChooser guardar = new JFileChooser();
        guardar.showSaveDialog(null);
        guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        File archivo = guardar.getSelectedFile();

        FileWriter escribir;
        try {

            escribir = new FileWriter(archivo, true);
            escribir.write(cadena);
            escribir.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar, ponga nombre al archivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar, en la salida");
        }

    }
    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File archivo = fc.getSelectedFile();
        if (archivo != null) {
            ruta.setText(archivo.getAbsolutePath());
        }
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while (((linea = br.readLine()) != null)) {
                texto += linea + "\n";
            }
            Vista.setText(texto);
            JOptionPane.showMessageDialog(null, "Archivo leido conrrectamente");
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
    }//GEN-LAST:event_abrirActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String regex = expresion.getText();
        String txt = Vista.getText();
        if (regex.equals("")) {
            JOptionPane.showMessageDialog(null, "No se ha ingresado una expresion regular");
        } else {
            ExpresionRegular(regex, txt);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaActionPerformed

    private void AnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarActionPerformed
         File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(Vista.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
        //    Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(Jflex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
//        try {
        Reader lector;
        try {
            lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado1 = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado1 += "FIN";
                    resultado.setText(resultado1);
                    return;
                }
                switch (tokens) {
                    case ERROR:
                        resultado1 += "Símbolo no definido\n";
                        break;
                    case Identificador: case Numero: case Reservadas:
                        resultado1 += lexer.lexeme + ": Es un " + tokens + "\n";
                        break;
                    default:
                        resultado1 += "Token: " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jflex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Jflex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//        }
    

    }//GEN-LAST:event_AnalizarActionPerformed
 
   
    
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
            java.util.logging.Logger.getLogger(From_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new From_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Analizar;
    private javax.swing.JTextArea Vista;
    private javax.swing.JButton abrir;
    private javax.swing.JTextField expresion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextField ruta;
    // End of variables declaration//GEN-END:variables
}
