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
public class TableCJ extends DefaultTableModel {
    private final String[] COLUMS = {"CODIGO", 
        "APELLIDOS", 
        "NOMBRES", 
        "DIRECCION", 
        "RUC",
        "RAZON SOCIAL",
        "REPRESENTANTE L.",
        "CONEXION",
        "TARIFA"
    };
    
    private String[] row = new String[9];

    public TableCJ(List<ClienteJuridico> listaClientesJ) {
        columnIdentifiers = convertToVector(COLUMS);
        initTable(listaClientesJ);
    }

    private void initTable(List<ClienteJuridico> listaClientesJ) {
        listaClientesJ.forEach((cliente) -> {
            row[0] = String.valueOf(cliente.getCodigo());
            row[1] = cliente.getApellidos();
            row[2] = cliente.getNombres();
            row[3] = cliente.getDireccion();
            row[4] = cliente.getRuc();
            row[5] = cliente.getRazonSocial();
            row[6] = cliente.getRepresentanteLegal();
            row[7] = String.valueOf(cliente.getConexion());
            row[8] = String.valueOf(cliente.getTarifa());
            
            this.addRow(row);
        });
    } 
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;//To change body of generated methods, choose Tools | Templates.
    }
}
