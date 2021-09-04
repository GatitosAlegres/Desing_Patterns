/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.datasource;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import business.model.*;

/**
 * @class FileClientes [FACCADE DESING PATTERN]
 * @author GEORGE
 */

public class FileClientes {
    
    private static RandomAccessFile flujo;
    private static final String PATH = "src\\framework\\datasource\\data\\";
    private static final String PATH_CN = "clientesNaturales.txt";
    private static final String PATH_CJ = "clientesJuridicos.txt";
    private static final int TAMREG = 110;
    private static int numRegistros;

    public static void initStreamCN() {
        try {
            flujo = new RandomAccessFile(PATH+PATH_CN,"rw");
            numRegistros = (int) (Math.ceil(((double)flujo.length())/(TAMREG)));
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void initStreamCJ() {
        try {
            flujo = new RandomAccessFile(PATH+PATH_CJ,"rw");
            numRegistros = (int) (Math.ceil(((double)flujo.length())/(TAMREG)));
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
    
    public static boolean setClienteNatural(int posicion, ClienteNatural cliente) {
        try {
            if (posicion >= 0 && posicion <= numRegistros) {
                if (cliente.getTamaño()>TAMREG)
                    return false;
                else {
                    initStreamCN();
                    
                    flujo.seek(posicion*TAMREG);
                    
                    flujo.writeInt(cliente.getCodigo());
                    flujo.writeUTF(cliente.getApellidos());
                    flujo.writeUTF(cliente.getNombres());
                    flujo.writeUTF(cliente.getDireccion());
                    flujo.writeUTF(cliente.getDni());
                    
                    // Tarifa y Conexion
                    flujo.writeFloat(cliente.getConexion());
                    flujo.writeFloat(cliente.getTarifa());
                }
            }
        } catch (IOException e) {
            return false;
        } finally {
            try {
                flujo.close();
            } catch (IOException e) {}
        }
        return true;
    }
    
    public static boolean setClienteJuridico(int posicion, ClienteJuridico cliente) {
        try {
            if (posicion >= 0 && posicion <= numRegistros) {
                if (cliente.getTamaño()>TAMREG)
                    return false;
                else {
                    initStreamCJ();
                    
                    flujo.seek(posicion*TAMREG);
                    
                    flujo.writeInt(cliente.getCodigo());
                    flujo.writeUTF(cliente.getApellidos());
                    flujo.writeUTF(cliente.getNombres());
                    flujo.writeUTF(cliente.getDireccion());
                    flujo.writeUTF(cliente.getRuc());
                    flujo.writeUTF(cliente.getRazonSocial());
                    flujo.writeUTF(cliente.getRepresentanteLegal());
                    
                    // Tarifa y Conexion
                    flujo.writeFloat(cliente.getConexion());
                    flujo.writeFloat(cliente.getTarifa());
                }
            }
        } catch (IOException e) {
            return false;
        } finally {
            try {
                flujo.close();
            } catch (IOException e) {}
        }
        return true;
    }
 
    public static boolean agregarClienteNatural(ClienteNatural cn) {
        try {
            if (setClienteNatural(numRegistros, cn)) {
                numRegistros++;
                return true;
            } else return false;
        } finally {
            try {
                flujo.close();
            } catch (IOException e) {}
        }
    }
    
    public static boolean agregarClienteJuridico(ClienteJuridico cj) {
        try {
            if (setClienteJuridico(numRegistros, cj)) {
                numRegistros++;
                return true;
            } else return false;
        } finally {
            try {
                flujo.close();
            } catch (IOException e) {}
        }
    }
    
    public static ClienteNatural getClienteNatural(int posicion) {
        int codigo;
        String apellidos;
        String nombres;
        String direccion;
        String dni;
        float conexion;
        float tarifa;
        
        ClienteNatural cn = null;
        
        try {
            initStreamCN();
            
            flujo.seek(posicion*TAMREG);
            
            codigo = flujo.readInt();
            apellidos = flujo.readUTF();
            nombres = flujo.readUTF();
            direccion = flujo.readUTF();
            dni = flujo.readUTF();
            
            // Tarifa y Conexion
            
            conexion = flujo.readFloat();
            tarifa = flujo.readFloat();
            
            cn = new ClienteNatural(codigo, apellidos, nombres, direccion, dni);
            cn.setConexion(conexion);
            cn.setTarifa(tarifa);
            
            return cn;
            
        } catch (IOException e) {} 
        finally {
            try {
                flujo.close();
            } catch (IOException e) {}
        }
        return cn;
    }
    
    public static ClienteJuridico getClienteJuridico(int posicion) {
        int codigo;
        String apellidos;
        String nombres;
        String direccion;
        String ruc;
        String razonSocial;
        String representanteLegal;
        float conexion;
        float tarifa;
        
        ClienteJuridico cj = null;
        
        try {
            initStreamCJ();
            
            flujo.seek(posicion*TAMREG);
            
            codigo = flujo.readInt();
            apellidos = flujo.readUTF();
            nombres = flujo.readUTF();
            direccion = flujo.readUTF();
            ruc = flujo.readUTF();
            razonSocial = flujo.readUTF();
            representanteLegal = flujo.readUTF();
            
            // Tarifa y Conexion
            
            conexion = flujo.readFloat();
            tarifa = flujo.readFloat();
            
            cj = new ClienteJuridico(
                    codigo, 
                    apellidos,
                    nombres, 
                    direccion, 
                    ruc, 
                    razonSocial,
                    representanteLegal);
            cj.setConexion(conexion);
            cj.setTarifa(tarifa);
            
            return cj;
            
        } catch (IOException e) {} 
        finally {
            try {
                flujo.close();
            } catch (IOException e) {}
        }
        return cj;
    }
    
    public static List<ClienteNatural> getListClientesNatural() {
        List<ClienteNatural> list = new ArrayList<>();
        ClienteNatural cn;
        
        try {
            initStreamCN();
            
            for (int i = 0; i < numRegistros; i++) {
            cn = getClienteNatural(i);
            list.add(cn);
        }
        } catch (Exception e) {}
        finally {
            try {
                flujo.close();
            } catch (IOException e) {}
        }
        return list;
    }
    
    public static List<ClienteJuridico> getListClientesJuridico() {
        List<ClienteJuridico> listJ = new ArrayList<>();
        ClienteJuridico cj;
        
        try {
            initStreamCJ();
            
            for (int i = 0; i < numRegistros; i++) {
            cj = getClienteJuridico(i);
            listJ.add(cj);
        }
        } catch (Exception e) {}
        finally {
            try {
                flujo.close();
            } catch (IOException e) {}
        }
        return listJ;
    }
    
    public static int getNumRegistros() {
        return numRegistros;
    }

    public static void setNumRegistros(int numRegistros) {
        FileClientes.numRegistros = numRegistros;
    } 
}
