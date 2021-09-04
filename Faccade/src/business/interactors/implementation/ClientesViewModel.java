/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.interactors.implementation;

import java.util.ArrayList;
import java.util.List;
import business.model.*;
import framework.datasource.FileClientes;

/**
 *
 * @author GEORGE
 */
public class ClientesViewModel {
    
    private static int indexEdit = 0;
    private static ClienteNatural cnBuscado;
    private static ClienteJuridico cjBuscado;
    
    public static void agregarClienteNatural(ClienteNatural cn) {
        FileClientes.agregarClienteNatural(cn);
    }
    
    public static void agregarClienteJuridico(ClienteJuridico cj) {
        FileClientes.agregarClienteJuridico(cj);
    }

    public static int getIndexEdit() {
        return indexEdit;
    }

    public static void setIndexEdit(int indexEdit) {
        ClientesViewModel.indexEdit = indexEdit;
    }
    
    public static List<ClienteJuridico> getListCJ() {
        return FileClientes.getListClientesJuridico();
    }
    
    public static List<ClienteNatural> getListCN() {
        return FileClientes.getListClientesNatural();
    }
    
    public static ClienteNatural buscarCodigoCN(int codigo) {
        List<ClienteNatural> listaAux = new ArrayList<>();
        listaAux.addAll(getListCN());
        
        
        listaAux.forEach((cn) -> {
            if (codigo == cn.getCodigo()) {
                cnBuscado = cn;
            }
        });
        
        return cnBuscado;
    }
    
    public static ClienteJuridico buscarCodigoCJ(int codigo) {
        List<ClienteJuridico> listaAux = new ArrayList<>();
        listaAux.addAll(getListCJ());
        
        listaAux.forEach((cj) -> {
            if (codigo == cj.getCodigo()) {
                cjBuscado = cj;
            }
        });
        
        return cjBuscado;
    }
}
