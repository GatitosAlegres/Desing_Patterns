/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy;
import javax.swing.*;

/**
 *
 * @author luisr
 */

public class AntivirusSimple extends AnalisisSimple{

    @Override
    void iniciar() {
        JOptionPane.showMessageDialog(null, "ANALISIS INICIADO", "ANTIVIRUS SIMPLE", 3);
    }

    @Override
    void saltarZip() {
        try {
            JOptionPane.showMessageDialog(null, "Analizando archivos de extensión '.zip'...", "ANTIVIRUS SIMPLE", 1);
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    void detener() {
        JOptionPane.showMessageDialog(null, "ANALISIS TERMINADO \nNO SE ENCONTRARON VIRUS", "ANTIVIRUS SIMPLE", 1);
    }
}
