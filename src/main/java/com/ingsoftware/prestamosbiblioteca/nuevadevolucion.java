/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import com.ingsoftware.interfaces.DAOlibros;
import com.ingsoftware.interfaces.DAOprestamo;

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
        jPanel1 = new javax.swing.JPanel();
        btn_devolucion = new javax.swing.JButton();
        folioprestamo = new javax.swing.JTextField();
        lb_foliolibro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        fondo.setBackground(new java.awt.Color(51, 51, 51));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("REGISTRAR DEVOLUCION");
        fondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 745, 42));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_devolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book-open-page-variant.png"))); // NOI18N
        btn_devolucion.setText("REGISTRAR DEVOLUCION");
        btn_devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolucionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_devolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 220, 63));

        folioprestamo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        folioprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folioprestamoActionPerformed(evt);
            }
        });
        jPanel1.add(folioprestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 310, -1));

        lb_foliolibro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lb_foliolibro.setForeground(new java.awt.Color(255, 255, 255));
        lb_foliolibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_foliolibro.setText("FOLIO PRESTAMO:");
        jPanel1.add(lb_foliolibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 309, -1));

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 435, 305));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPU.jpg"))); // NOI18N
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 490));

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
        
            try{
            int folioprestamos = Integer.parseInt(folioprestamo.getText());
            DAOprestamo dao = new DAOprestamoImpl();
            dao.eliminar(folioprestamos);
            javax.swing.JOptionPane.showMessageDialog(this, "Prestamo entregado con exito :D \n", "LISTO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e){
            System.out.println(e.getMessage());
            }        
        
    }//GEN-LAST:event_btn_devolucionActionPerformed

    private void folioprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folioprestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_folioprestamoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_devolucion;
    private javax.swing.JTextField folioprestamo;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_foliolibro;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
