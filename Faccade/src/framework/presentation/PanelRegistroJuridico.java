/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.presentation;

import business.model.*;
import business.interactors.implementation.ClientesViewModel;
import util.Navigation;

/**
 *
 * @author GEORGE
 */
public class PanelRegistroJuridico extends javax.swing.JPanel {

    /**
     * Creates new form PanelRegistroJuridico
     */
    public PanelRegistroJuridico() {
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
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ruc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_rz = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_representante = new javax.swing.JTextField();
        btn_registroCJ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbox_conexion = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbox_tarifa = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("REGISTRO CLIENTE JURIDICO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jLabel3.setText("Codigo");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, -1));

        jLabel4.setText("Apellidos");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 130, -1));

        jLabel5.setText("Nombres");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 130, -1));

        jLabel6.setText("Direccion");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, -1));

        jLabel7.setText("RUC");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));
        add(txt_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 130, -1));

        jLabel8.setText("Razon Social");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        add(txt_rz, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 130, -1));

        jLabel9.setText("<html>Representante<br> Legal</html>");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));
        add(txt_representante, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 130, -1));

        btn_registroCJ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_registroCJ.setText("Registrar");
        btn_registroCJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroCJActionPerformed(evt);
            }
        });
        add(btn_registroCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("Servicio");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        jLabel11.setText("Conexion");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        cbox_conexion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monofasico", "Bifasico", "Trifasico" }));
        add(cbox_conexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        jLabel12.setText("Tarifa");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        cbox_tarifa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residencial", "Comercial", "Industrial", "Especial" }));
        add(cbox_tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Navigation.toPanel(Navigation.PANEL_MAIN);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_registroCJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroCJActionPerformed
       int codigo = Integer.parseInt(txt_codigo.getText());
       String apellidos = txt_apellidos.getText();
       String nombres = txt_nombres.getText();
       String direccion = txt_direccion.getText();
       String ruc = txt_ruc.getText();
       String razonSocial = txt_rz.getText();
       String representanteLegal = txt_representante.getText();
       
       ClienteJuridico cj = new ClienteJuridico(
                codigo, 
                apellidos, 
                nombres, 
                direccion, 
                ruc, 
                razonSocial, 
                representanteLegal);
       
        try {
            switch(cbox_conexion.getSelectedIndex()) {
            case 0: cj.setConexion(ClienteNatural.MONOFASICO);break;
            case 1: cj.setConexion(ClienteNatural.BIFASICO);break;
            case 2: cj.setConexion(ClienteNatural.TRIFASICO);break;
            }
        } catch (Exception e) {
        }
        
        try {
            switch(cbox_tarifa.getSelectedIndex()) {
                case 0: cj.setTarifa(ClienteNatural.RESIDENCIAL);break;
                case 1: cj.setTarifa(ClienteNatural.COMERCIAL);break;
                case 2: cj.setTarifa(ClienteNatural.INDUSTRIAL);break;
                case 3: cj.setTarifa(ClienteNatural.ESPECIAL);break;
            }
        } catch (Exception e) {
        }
       
        ClientesViewModel.agregarClienteJuridico(cj);
        
        txt_codigo.setText(null);
        txt_apellidos.setText(null);
        txt_nombres.setText(null);
        txt_direccion.setText(null);
        txt_ruc.setText(null);
        txt_rz.setText(null);
        txt_representante.setText(null);
       
        
    }//GEN-LAST:event_btn_registroCJActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registroCJ;
    private javax.swing.JComboBox<String> cbox_conexion;
    private javax.swing.JComboBox<String> cbox_tarifa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_representante;
    private javax.swing.JTextField txt_ruc;
    private javax.swing.JTextField txt_rz;
    // End of variables declaration//GEN-END:variables
}
