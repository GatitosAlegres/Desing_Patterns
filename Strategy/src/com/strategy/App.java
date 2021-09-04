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

public class App {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new AntivirusSimple());
        contexto.ejecutar();
    }
}
