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
public class ClienteJuridico extends Cliente implements Comparable<ClienteJuridico>{
    
    private String ruc;
    private String razonSocial;
    private String representanteLegal;
    
    public ClienteJuridico(
            int codigo,
            String apellidos,
            String nombres,
            String direccion,
            String ruc,
            String razonSocial,
            String representanteLegal) {
        super(codigo, apellidos, nombres, direccion);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.representanteLegal = representanteLegal;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" + "ruc=" + ruc + ", razonSocial=" + razonSocial + ", representanteLegal=" + representanteLegal + '}';
    }

    @Override
    public int compareTo(ClienteJuridico c) {
        return ruc.compareToIgnoreCase(c.getRuc());
    }

    @Override
    public int getTamaño() {
        return (getApellidos().length()+
                getNombres().length()+
                getDireccion().length()+
                getRuc().length()+
                getRazonSocial().length()+
                getRepresentanteLegal().length()*2)+20;
    }
}
