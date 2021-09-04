/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.datasource;

import business.model.Client;
import java.util.List;

/**
 *
 * @author IRVIN
 */
public interface ClientDao {
    
    List<Client> getAllClients();
    
    Client getClient(String code);
    
}
