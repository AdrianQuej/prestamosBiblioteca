/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

/**
 *
 * @author Adrian Quej
 */
public class nuevadevolucion extends javax.swing.JPanel {

    /**
     * Creates new form nuevadevolucion
     */
    public nuevadevolucion() {
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

        fondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lb_foliolibro = new javax.swing.JLabel();
        jt_foliolibro = new javax.swing.JTextField();
        lb_foliousuario = new javax.swing.JLabel();
        jt_foliousuario = new javax.swing.JTextField();
        btn_devolucion = new javax.swing.JButton();

        fondo.setBackground(new java.awt.Color(51, 51, 51));

        titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("REGISTRAR DEVOLUCION");

        lb_foliolibro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lb_foliolibro.setForeground(new java.awt.Color(255, 255, 255));
        lb_foliolibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_foliolibro.setText("FOLIO LIBRO:");

        jt_foliolibro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lb_foliousuario.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lb_foliousuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_foliousuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_foliousuario.setText("FOLIO USUARIO:");

        jt_foliousuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_devolucion.setText("REGISTRAR DEVOLUCION");
        btn_devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_foliolibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jt_foliolibro)
                    .addComponent(lb_foliousuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jt_foliousuario))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(btn_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(lb_foliolibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_foliolibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_foliousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_foliousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_devolucionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_devolucion;
    private javax.swing.JPanel fondo;
    private javax.swing.JTextField jt_foliolibro;
    private javax.swing.JTextField jt_foliousuario;
    private javax.swing.JLabel lb_foliolibro;
    private javax.swing.JLabel lb_foliousuario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}