/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy;

/**
 *
 * @author luisr
 */
public abstract class AnalisisAvanzado implements Estrategia{
    public void analizar(){
        iniciar();
        analizarMemoriaRAM();
        analizarKeyLoggers();
        analizarRoomKits();
        descomprimirZip();
        detener();
    }

    abstract void iniciar();

    abstract void analizarMemoriaRAM();

    abstract void analizarKeyLoggers();

    abstract void analizarRoomKits();

    abstract void descomprimirZip();

    abstract void detener();
}
