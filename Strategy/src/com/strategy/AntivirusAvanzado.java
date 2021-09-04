/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.strategy;

import javax.swing.JOptionPane;

/**
 *
 * @author luisr
 */
public class AntivirusAvanzado extends AnalisisAvanzado{

    @Override
    void iniciar() {
        JOptionPane.showMessageDialog(null, "ANALISIS INICIADO", "ANTIVIRUS AVANZADO", 3);
    }

    @Override
    void analizarMemoriaRAM() {
        try {
            JOptionPane.showMessageDialog(null, "Analizando Memoria RAM...", "ANTIVIRUS AVANZADO", 1);
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    void analizarKeyLoggers() {
        try {
            JOptionPane.showMessageDialog(null, "En Búsqueda de KeyLoggers...", "ANTIVIRUS AVANZADO", 1);
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    void analizarRoomKits() {
        try {
            JOptionPane.showMessageDialog(null, "En Búsqueda de RootKits...", "ANTIVIRUS AVANZADO", 1);
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    void descomprimirZip() {
        try {
            JOptionPane.showMessageDialog(null, "Analizando archivos de extensión '.zip'...", "ANTIVIRUS AVANZADO", 1);
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    void detener() {
        JOptionPane.showMessageDialog(null, "ANALISIS FINALIZADO \nNO SE ENCONTRARON VIRUS", "ANTIVIRUS AVANZADO", 1);
    }
    
}
