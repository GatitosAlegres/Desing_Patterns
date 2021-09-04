/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.interactors.implementation;

import business.model.Client;
import framework.datasource.AppDatabase;
import java.util.List;

/**
 *
 * @author IRVIN
 */

// DELEGACION DE METODOS MEDIANTE EL SINGLETON | CONEXION DATOS - UI
public class ClientViewModel {
    
    public static List<Client> getAllClients() {
        return AppDatabase.getInstace().getAllClients();
    }
    
    public static Client getClient(String code) {
        return AppDatabase.getInstace().getClient(code);
    }
}
