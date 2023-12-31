/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ingsoftware.prestamosbiblioteca;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.formdev.flatlaf.ui.FlatUIUtils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Adrian Quej
 */
public class vistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form vistaPrincipal
     */
    public vistaPrincipal() {
        initComponents();
        initStyles();
        conseguirFecha();
        iniciarContenido();
        //mostrarPrincipal();
    }
    
    public vistaPrincipal(String usuario){
        initComponents();
        initStyles();
        conseguirFecha();
        iniciarContenido();
        nombreBibliotecario.setText(usuario);
    }

    private void initStyles(){        
        //SE DEFINEN LOS ESTILOS DEL FLATLAF        
        titulo.putClientProperty( "FlatLaf.style", "font: 170% $monospaced.font" );        
        fecha.putClientProperty( "FlatLaf.style", "font: 200% $monospaced.font" );        
        nombreBibliotecario.putClientProperty( "FlatLaf.style", "font: 150% $monospaced.font" );
        nombreAPP.putClientProperty( "FlatLaf.style", "font: 100% $h00.font" );
        
        //SE CAMBIA EL COLOR DE LOS ESTILOS
        bienvenida.setForeground(Color.black);
        titulo.setForeground(Color.white);
        fecha.setForeground(Color.white);
        nombreBibliotecario.setForeground(Color.white);
        nombreAPP.setForeground(Color.white);        
    }
    
    private void conseguirFecha(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es","ES");
        fecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy",spanishLocale)));
    }
    
    private void iniciarContenido(){
        mostrarPanel(new panelBienvenida());
        
    }
    
    private void mostrarPanel(JPanel p){
        p.setSize(750, 430);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
//    private void showPanel(JPanel p){
//        p.setSize(460,420);
//        p.setLocation(0,0);
//        content.removeAll();
//        content.add(p);
//        content.revalidate();
//        content.repaint();
//    }
//    
//    private void mostrarPrincipal(){
//        bienvenida b = new bienvenida();
//        showPanel(b.getFondo());
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        nombreAPP = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JButton();
        btn_libros = new javax.swing.JButton();
        btn_principal = new javax.swing.JButton();
        btn_devoluciones = new javax.swing.JButton();
        btn_reportes = new javax.swing.JButton();
        btn_prestamos = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        nombreBibliotecario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1032, 650));

        fondo.setBackground(new java.awt.Color(204, 204, 204));

        menu.setBackground(new java.awt.Color(72, 72, 72));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        nombreAPP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreAPP.setText("JUSTREAD");

        btn_usuarios.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-multiple.png"))); // NOI18N
        btn_usuarios.setText("CLIENTES");
        btn_usuarios.setBorder(null);
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuariosActionPerformed(evt);
            }
        });

        btn_libros.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book-open-page-variant.png"))); // NOI18N
        btn_libros.setText("LIBROS");
        btn_libros.setBorder(null);
        btn_libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_librosActionPerformed(evt);
            }
        });

        btn_principal.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-outline.png"))); // NOI18N
        btn_principal.setText("PRINCIPAL");
        btn_principal.setBorder(null);
        btn_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principalActionPerformed(evt);
            }
        });

        btn_devoluciones.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar-multiple-check.png"))); // NOI18N
        btn_devoluciones.setText("DEVOLVER LIBRO");
        btn_devoluciones.setBorder(null);
        btn_devoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_devoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolucionesActionPerformed(evt);
            }
        });

        btn_reportes.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file-chart.png"))); // NOI18N
        btn_reportes.setText("PRESTAMOS ACTUALES");
        btn_reportes.setBorder(null);
        btn_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        btn_prestamos.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_prestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar-plus.png"))); // NOI18N
        btn_prestamos.setText("NUEVO PRESTAMO");
        btn_prestamos.setBorder(null);
        btn_prestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestamosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreAPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_devoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(btn_libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_prestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(nombreAPP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btn_devoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btn_libros, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btn_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        encabezado.setBackground(new java.awt.Color(153, 153, 153));
        encabezado.setPreferredSize(new java.awt.Dimension(750, 150));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulo.setText("CONTROL BIBLIOTECA");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Hoy es {dayname} {day} de {month} de {year}");

        nombreBibliotecario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreBibliotecario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombreBibliotecario.setText("///////////////");

        jButton1.setText("CERRAR SESION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("BIBLIOTECARIO:");

        javax.swing.GroupLayout encabezadoLayout = new javax.swing.GroupLayout(encabezado);
        encabezado.setLayout(encabezadoLayout);
        encabezadoLayout.setHorizontalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encabezadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        encabezadoLayout.setVerticalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(encabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bienvenida.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenida.setText("BIENVENIDO A JUSTREAD! EMPIEZA A ADMINISTRAR LOS PRESTAMOS DE LA BIBLIOTECA :D");
        bienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        content.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuariosActionPerformed
         mostrarPanel(new vistaUsuarios());
    }//GEN-LAST:event_btn_usuariosActionPerformed

    private void btn_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_librosActionPerformed
         mostrarPanel(new verLibros());
    }//GEN-LAST:event_btn_librosActionPerformed

    private void btn_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principalActionPerformed
         mostrarPanel(new panelBienvenida());
    }//GEN-LAST:event_btn_principalActionPerformed

    private void btn_devolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolucionesActionPerformed
         mostrarPanel(new nuevadevolucion());
    }//GEN-LAST:event_btn_devolucionesActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
         mostrarPanel(new reportes());
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void btn_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestamosActionPerformed
         mostrarPanel(new nuevoPrestamo(nombreBibliotecario.getText()));
    }//GEN-LAST:event_btn_prestamosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        login frame1 = new login();
        frame1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialDarkerIJTheme.setup();
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JButton btn_devoluciones;
    private javax.swing.JButton btn_libros;
    private javax.swing.JButton btn_prestamos;
    private javax.swing.JButton btn_principal;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JButton btn_usuarios;
    public static javax.swing.JPanel content;
    private javax.swing.JPanel encabezado;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombreAPP;
    private javax.swing.JLabel nombreBibliotecario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
