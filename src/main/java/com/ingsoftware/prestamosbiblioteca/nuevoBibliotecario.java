/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import com.ingsoftware.interfaces.DAObibliotecarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian Quej
 */
public class nuevoBibliotecario extends javax.swing.JPanel {

    /**
     * Creates new form nuevoUsuario
     */
    public nuevoBibliotecario() {
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

        jLabel1 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        Text3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lacontrasena = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPU.jpg"))); // NOI18N

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 27, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Registrar nuevo Bibliotecario");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("Contraseña");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("Nombre");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 18));

        nombretxt.setForeground(new java.awt.Color(102, 102, 102));
        nombretxt.setText("Ingrese el nombre completo");
        nombretxt.setBorder(null);
        nombretxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombretxtMousePressed(evt);
            }
        });
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 260, 30));

        Text3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Text3.setForeground(new java.awt.Color(255, 255, 255));
        Text3.setText("Usuario");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Ingrese un nombre de usuario");
        name.setBorder(null);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameMousePressed(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 260, 30));

        jButton1.setText("REGISTRAR USUARIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 160, 30));

        lacontrasena.setText("jPasswordField1");
        lacontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lacontrasenaActionPerformed(evt);
            }
        });
        add(lacontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 260, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPU.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void nombretxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombretxtMousePressed
        nombretxt.setText("");
    }//GEN-LAST:event_nombretxtMousePressed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        jButton1.doClick();
    }//GEN-LAST:event_nombretxtActionPerformed

    private void nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMousePressed
        name.setText("");
    }//GEN-LAST:event_nameMousePressed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        jButton1.doClick();
    }//GEN-LAST:event_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = name.getText();
        String contrasena = lacontrasena.getText();
        String nombre = nombretxt.getText();
        
        //VALIDACIONES    
        if(name.getText().equals("Ingrese un nombre de usuario") || lacontrasena.getText().equals("")
            || nombretxt.getText().equals("Ingrese el nombre completo") ){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            name.requestFocus();
            return;
        }
        
        
        com.ingsoftware.models.bibliotecarios bib = new com.ingsoftware.models.bibliotecarios();
        bib.setUsuario(usuario);
        bib.setContrasena(contrasena);
        bib.setNombre(nombre);
        
        try {
            DAObibliotecarios dao = new DAObibliotecariosImpl();
            dao.registrar(bib);
            JOptionPane.showMessageDialog(null, "Bibliotecario agregado con exito");
            name.setText("");
            lacontrasena.setText("");
            nombretxt.setText("");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error al añadir el bibliotecario");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lacontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lacontrasenaActionPerformed
        jButton1.doClick();
    }//GEN-LAST:event_lacontrasenaActionPerformed

    private void lacontrasenaMousePressed(java.awt.event.MouseEvent evt) {                                    
        lacontrasena.setText("");
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField lacontrasena;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}
