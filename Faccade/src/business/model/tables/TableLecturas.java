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
public class TableLecturas extends DefaultTableModel{
    
    private final String[] COLUMS = {"CODIGO DEL CLIENTE", "CONSUMO", "MES", "PRECIO"};
    private String[] row = new String[4];

    public TableLecturas(List<LecturaMedidor> lista) {
        columnIdentifiers = convertToVector(COLUMS);
        initTable(lista);
    }

    private void initTable(List<LecturaMedidor> lista) {
        lista.forEach((medicion) -> {
            row[0] = String.valueOf(medicion.getCodigoCliente());
            row[1] = String.valueOf(medicion.getConsumoKWh()) + "KW/h";
            row[2] = String.valueOf(medicion.getMes());
            row[3] = String.valueOf(medicion.getPrecio());
            
            addRow(row);
        });
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;//To change body of generated methods, choose Tools | Templates.
    }
}
