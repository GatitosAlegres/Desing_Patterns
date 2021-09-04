/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.model.interfaces.Contrato;
import java.util.ArrayList;

/**
 *
 * @author GEORGE
 */
public abstract class Cliente implements Contrato{
    
    private int codigo;
    private String apellidos;
    private String nombres;
    private String direccion;
    private float conexion;
    private float tarifa;
    private ArrayList<LecturaMedidor> lecturasMedidor;

    public Cliente(
            int codigo,
            String apellidos, 
            String nombres,
            String direccion) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.direccion = direccion;
        this.lecturasMedidor = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getConexion() {
        return conexion;
    }

    public void setConexion(float conexion) {
        this.conexion = conexion;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<LecturaMedidor> getLecturasMedidor() {
        return lecturasMedidor;
    }

    public void agregarLectura(LecturaMedidor lc) {
        lecturasMedidor.add(lc);
    }
    
    public void setLecturasMedidor(ArrayList<LecturaMedidor> lecturasMedidor) {
        this.lecturasMedidor = lecturasMedidor;
    }
    
    public abstract int getTamaño();

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", apellidos=" + apellidos + ", nombres=" + nombres + ", direccion=" + direccion + ", conexion=" + conexion + ", tarifa=" + tarifa + ", lecturasMedidor=" + lecturasMedidor + '}';
    }

    @Override
    public float precioAPagar(float consumo) {
        return (conexion*tarifa)*consumo;
    }
}
