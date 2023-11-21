/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import java.awt.Color;

/**
 *
 * @author Adrian Quej
 */
public class panelBienvenida extends javax.swing.JPanel {

    /**
     * Creates new form panelBienvenida
     */
    public panelBienvenida() {
        initComponents();
        initStyles();
    }
private void initStyles(){        
        //SE DEFINEN LOS ESTILOS DEL FLATLAF      
        r1.putClientProperty( "FlatLaf.style", "font:80% $h1.font" );
        r24.putClientProperty( "FlatLaf.style", "font:80% $h1.font" );
        r26.putClientProperty( "FlatLaf.style", "font:80% $h1.font" );
        r25.putClientProperty( "FlatLaf.style", "font:80% $h1.font" );
        r23.putClientProperty( "FlatLaf.style", "font:80% $h1.font" );
        r3.putClientProperty( "FlatLaf.style", "font:80% $h1.font" );
        r2.putClientProperty( "FlatLaf.style", "font:80% $h1.font" );
        
        
        //SE CAMBIA EL COLOR DE LOS ESTILOS
        REGLAS.setForeground(Color.black);
        r1.setForeground(Color.black);
        r24.setForeground(Color.black);
        r26.setForeground(Color.black);
        r25.setForeground(Color.black);      
        r23.setForeground(Color.black); 
        r3.setForeground(Color.black); 
        r2.setForeground(Color.black); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        REGLAS = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        r23 = new javax.swing.JLabel();
        r24 = new javax.swing.JLabel();
        r25 = new javax.swing.JLabel();
        r26 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(750, 430));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        REGLAS.setFont(new java.awt.Font("NewsGoth BT", 1, 18)); // NOI18N
        REGLAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REGLAS.setText("REGLAS DE LA BIBLIOTECA");
        jPanel2.add(REGLAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 757, -1));

        r1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r1.setText("1 - CONSERVAR LOS LIBROS EN BUEN ESTADO ");
        jPanel2.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 440, -1));

        r2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r2.setText("2 -  NO SE PERMITE PRESTAMOS A DOMICILIO EN ");
        jPanel2.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 470, -1));

        r3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r3.setText(" 3 - DEVOLVER LOS LIBROS EN LA FECHA ACORDADA ");
        jPanel2.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 490, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libros_1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 269, 270));

        r23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r23.setText("PARA EVITAR CONFLICTOS");
        jPanel2.add(r23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        r24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r24.setText("EXISTENCIA");
        jPanel2.add(r24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        r25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r25.setText("LIBROS CON MENOS DE 3 UNIDADES EN");
        jPanel2.add(r25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        r26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r26.setText("Y REVISAR SU ESTADO ANTES DEL PRESTAMO");
        jPanel2.add(r26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel REGLAS;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel r23;
    private javax.swing.JLabel r24;
    private javax.swing.JLabel r25;
    private javax.swing.JLabel r26;
    private javax.swing.JLabel r3;
    // End of variables declaration//GEN-END:variables
}
