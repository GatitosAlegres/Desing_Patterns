/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author GEORGE
 */
public class ClienteNatural extends Cliente implements Comparable<ClienteNatural>{
    
    private String dni;

    public ClienteNatural(
            int codigo,
            String apellidos,
            String nombres,
            String direccion,
            String dni) {
        super(codigo,apellidos, nombres, direccion);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "ClienteNatural{" + "dni=" + dni + '}';
    }

    @Override
    public int compareTo(ClienteNatural c) {
        return dni.compareToIgnoreCase(c.getDni());
    }

    @Override
    public int getTamaño() {
        return (getApellidos().length()+
                getNombres().length()+
                getDireccion().length()+
                getDni().length())+16;
    }
}
