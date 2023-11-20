/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import com.ingsoftware.interfaces.DAObibliotecarios;
import com.ingsoftware.interfaces.DAOprestamo;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian Quej
 */
public class nuevoPrestamo extends javax.swing.JPanel {

    /**
     * Creates new form nuevoPrestamo
     */
    public nuevoPrestamo() {
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

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lb_foliolibro = new javax.swing.JLabel();
        jt_foliolibro = new javax.swing.JTextField();
        lb_foliousuario = new javax.swing.JLabel();
        jt_foliousuario = new javax.swing.JTextField();
        lb_foliobibliotecario = new javax.swing.JLabel();
        jt_foliobibliotecario = new javax.swing.JTextField();
        lb_fechaprestamo = new javax.swing.JLabel();
        jt_fechaprestamo = new javax.swing.JTextField();
        lb_fechadevolucion = new javax.swing.JLabel();
        jt_fechadevolucion = new javax.swing.JTextField();
        jTB_tipoprestamo = new javax.swing.JToggleButton();
        txt_tipoPrestamo = new javax.swing.JLabel();
        btn_nuevoprestamo = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));

        titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("NUEVO PRESTAMO");

        lb_foliolibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_foliolibro.setText("FOLIO LIBRO:");

        jt_foliolibro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lb_foliousuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_foliousuario.setText("FOLIO USUARIO:");

        jt_foliousuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lb_foliobibliotecario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_foliobibliotecario.setText("FOLIO BIBLIOTECARIO:");

        jt_foliobibliotecario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lb_fechaprestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fechaprestamo.setText("FECHA PRESTAMO:");

        jt_fechaprestamo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lb_fechadevolucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fechadevolucion.setText("FECHA DEVOLUCION");

        jt_fechadevolucion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTB_tipoprestamo.setText("EN BIBLIOTECA");
        jTB_tipoprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTB_tipoprestamoActionPerformed(evt);
            }
        });

        txt_tipoPrestamo.setText("TIPO PRESTAMO:");

        btn_nuevoprestamo.setText("Añadir Prestamo");
        btn_nuevoprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoprestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jt_foliolibro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_foliousuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_foliobibliotecario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_fechaprestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_foliolibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jt_foliousuario)
                    .addComponent(jt_foliobibliotecario)
                    .addComponent(jt_fechaprestamo)
                    .addComponent(lb_fechadevolucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jt_fechadevolucion))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txt_tipoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTB_tipoprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311)
                .addComponent(btn_nuevoprestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_foliolibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_foliolibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_foliousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_foliousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_foliobibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_foliobibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_fechaprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_fechaprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_fechadevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_fechadevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTB_tipoprestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_tipoPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nuevoprestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTB_tipoprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTB_tipoprestamoActionPerformed
        if (jTB_tipoprestamo.isSelected()) {
            jTB_tipoprestamo.setText("DOMICILIO");
        } else {
            jTB_tipoprestamo.setText("EN BIBLIOTECA");
        }
    }//GEN-LAST:event_jTB_tipoprestamoActionPerformed

    private void btn_nuevoprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoprestamoActionPerformed

        int libroid = Integer.parseInt(jt_foliolibro.getText());
        int bibliotecarioid = Integer.parseInt(jt_foliobibliotecario.getText());
        int clienteid = Integer.parseInt(jt_foliousuario.getText());
        String fechaprestamo = jt_fechaprestamo.getText();
        String fechadevolucion = jt_fechadevolucion.getText();
        
        String tipoprestamo ="";
        
        if(jTB_tipoprestamo.isSelected()){
            tipoprestamo = "DOMICILIO";
        } else {
            tipoprestamo = "EN BIBLIOTECA";
        }
        
        com.ingsoftware.models.prestamo pre = new com.ingsoftware.models.prestamo();
        pre.setLibroID(libroid);
        pre.setBibliotecarioID(bibliotecarioid);
        pre.setClienteID(clienteid);
        pre.setFecha_prestamo(fechaprestamo);
        pre.setFecha_devolucion(fechadevolucion);
        pre.setTipo_prestamo(tipoprestamo);
        
        try {
            DAOprestamo dao = new DAOprestamoImpl();
            dao.registrar(pre);
            JOptionPane.showMessageDialog(null, "Bibliotecario agregado con exito");
            jt_foliolibro.setText("");
            jt_foliobibliotecario.setText("");
            jt_foliousuario.setText("");
            jt_fechaprestamo.setText("");
            jt_fechadevolucion.setText("");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error al añadir el bibliotecario");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_nuevoprestamoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_nuevoprestamo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jTB_tipoprestamo;
    private javax.swing.JTextField jt_fechadevolucion;
    private javax.swing.JTextField jt_fechaprestamo;
    private javax.swing.JTextField jt_foliobibliotecario;
    private javax.swing.JTextField jt_foliolibro;
    private javax.swing.JTextField jt_foliousuario;
    private javax.swing.JLabel lb_fechadevolucion;
    private javax.swing.JLabel lb_fechaprestamo;
    private javax.swing.JLabel lb_foliobibliotecario;
    private javax.swing.JLabel lb_foliolibro;
    private javax.swing.JLabel lb_foliousuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txt_tipoPrestamo;
    // End of variables declaration//GEN-END:variables
}
