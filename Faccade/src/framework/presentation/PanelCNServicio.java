/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.presentation;

import business.interactors.implementation.ClientesViewModel;
import business.model.ClienteNatural;
import util.Navigation;


/**
 *
 * @author GEORGE
 */
public class PanelCNServicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelClienteServicio
     */
    public PanelCNServicio() {
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
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_conexion = new javax.swing.JTextField();
        txt_tarifa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Consulta servicio de un Cliente Natural");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setText("Codigo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
        add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 110, -1));

        jLabel3.setText("Conexion");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, 30));

        jLabel4.setText("Tarifa");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 80, 30));

        txt_conexion.setEnabled(false);
        add(txt_conexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 100, 30));

        txt_tarifa.setEnabled(false);
        add(txt_tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("RESULTADO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        int codigo = Integer.parseInt(txt_codigo.getText());
        
        ClienteNatural cn = ClientesViewModel.buscarCodigoCN(codigo);
        
        txt_conexion.setText(String.valueOf(cn.getConexion()));
        txt_tarifa.setText(String.valueOf(cn.getTarifa()));
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Navigation.toPanel(Navigation.PANEL_MAIN);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_conexion;
    private javax.swing.JTextField txt_tarifa;
    // End of variables declaration//GEN-END:variables
}
