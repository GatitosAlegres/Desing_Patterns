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

public class Contexto {
    private Estrategia estrategia;
    
    public Contexto(Estrategia estrategia){
        this.estrategia = estrategia;
    }
    
    public void ejecutar(){
        this.estrategia.analizar();
    }
}
