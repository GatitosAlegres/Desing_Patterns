/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model.tables;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import business.model.*;

/**
 *
 * @author GEORGE
 */
public class TableCN extends DefaultTableModel {
    
    private final String[] COLUMS = {"CODIGO", 
        "APELLIDOS", 
        "NOMBRES", 
        "DIRECCION", 
        "DNI",
        "CONEXION",
        "TARIFA"
    };
    
    private String[] row = new String[7];

    public TableCN(List<ClienteNatural> listaClientesN) {
        columnIdentifiers = convertToVector(COLUMS);
        initTable(listaClientesN);
    }

    private void initTable(List<ClienteNatural> listaClientesN) {
        listaClientesN.forEach((cliente) -> {
            row[0] = String.valueOf(cliente.getCodigo());
            row[1] = cliente.getApellidos();
            row[2] = cliente.getNombres();
            row[3] = cliente.getDireccion();
            row[4] = cliente.getDni();
            row[5] = String.valueOf(cliente.getConexion());
            row[6] = String.valueOf(cliente.getTarifa());
            
            this.addRow(row);
        });
    } 

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;//To change body of generated methods, choose Tools | Templates.
    }   
}
