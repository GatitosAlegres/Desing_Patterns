/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.presentation;

import util.Navigation;

/**
 *
 * @author GEORGE
 */
public class PanelEditCNatural extends javax.swing.JPanel {

    /**
     * Creates new form PanelEditCNatural
     */
    public PanelEditCNatural() {
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

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setText("Codigo");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));
        add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 230, -1));

        jLabel4.setText("Apellidos");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));
        add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 230, -1));

        jLabel5.setText("Nombres");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));
        add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 230, -1));

        jLabel6.setText("Direccion");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));
        add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, -1));

        jLabel2.setText("DNI");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));
        add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 230, -1));

        jLabel1.setText("Editar Cliente Natural");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Navigation.toPanel(Navigation.PANEL_MAIN);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables
}
