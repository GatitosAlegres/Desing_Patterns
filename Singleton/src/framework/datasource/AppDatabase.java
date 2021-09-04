/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.datasource;

import business.model.Client;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.Constants;

/**
 * @class AppDatabase [SINGLETON DESING PATTERN]
 * @author IRVIN
 */
public class AppDatabase implements ClientDao{

    private static AppDatabase INSTACE;
    
    private Connection cn;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
    
    private AppDatabase() {
        try {
            this.cn = DriverManager.getConnection(Constants.MYSQL_URL,
                    Constants.MYSQL_USER,
                    Constants.MYSQL_PASSWORD);
            System.out.println("\n\n\t\tINICIALIZO LA CONECCION A LA BASE DE DATOS");
        } catch (SQLException ex) {ex.printStackTrace(System.out);}
    }
    
    // ----------------  Thread Safe  ------------------
    
    // PARA MEJORAR EL PERFORMANCE SE RECOMIENDA DEFINIR COMO INLINE A INSTACE,
    // PERMITIENDO CARGAR LA JVM ANTES QUE CUALQUIER HILO DE EJECUCION [THREAD] 
    
    public static synchronized AppDatabase getInstace() {
        if(INSTACE == null)
            INSTACE = new AppDatabase();
        return INSTACE;
    }
    
    @Override
    public List<Client> getAllClients() {
       List<Client> list = new ArrayList();
        try {
            st = cn.createStatement();
            String sql = "SELECT CONCAT(cliepaterno, \" \", cliematerno) AS Apellidos, clienombre, cliedni FROM cliente";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                list.add(
                        new Client(rs.getString(1),
                                rs.getString(2),
                                rs.getString(3))
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            try {
                rs.close();
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return list; 
    }

    @Override
    public Client getClient(String code) {
        Client client = null;
        try {
            final String SQL = "SELECT CONCAT(cliepaterno, \" \", cliematerno) AS Apellidos, clienombre, cliedni FROM cliente WHERE cliecodigo = ?";
            ps = cn.prepareStatement(SQL);
            ps.setString(1, code);
            rs = ps.executeQuery();
            while (rs.next()) {
                client = new Client(rs.getString(1),
                                rs.getString(2),
                                rs.getString(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return client;
    } 
    
    public void endConnection() {
        try {
            if(cn != null)
                cn.close();
            INSTACE = null;
            System.out.println("\n\t\tFINALIZO LA CONECCION A LA BASE DE DATOS\n\n");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}