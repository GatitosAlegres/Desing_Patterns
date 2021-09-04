/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IRVIN
 */
public class TableClient extends DefaultTableModel{

    private final String[] COLUMNS = {
        "APELLIDOS",
        "NOMBRES",
        "DNI"
    };
    
    private String[] row = new String[3];
    
    public TableClient(List<Client> clients) {
        this.columnIdentifiers = convertToVector(COLUMNS);
        initTable(clients);
    }

    private void initTable(List<Client> clients) {
        clients.forEach((client) -> {
            row[0] = client.getLastName();
            row[1] = client.getFirstName();
            row[2] = client.getDni();
            
            this.addRow(row);
        });
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
