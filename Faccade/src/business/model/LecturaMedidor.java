/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.io.Serializable;

/**
 *
 * @author GEORGE
 */
public class LecturaMedidor implements Serializable{
    
    private int codigoCliente;
    private float consumoKWh;
    private int mes;
    private float precio;

    public LecturaMedidor(
            int codigoCliente, 
            float consumoKWh, 
            int mes,
            float precio) {
        this.codigoCliente = codigoCliente;
        this.consumoKWh = consumoKWh;
        this.mes = mes;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public float getConsumoKWh() {
        return consumoKWh;
    }

    public void setConsumoKWh(float consumoKWh) {
        this.consumoKWh = consumoKWh;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "LecturaMedidor{" + "codigoCliente=" + codigoCliente + ", consumoKWh=" + consumoKWh + ", mes=" + mes + ", precio=" + precio + '}';
    }

}
