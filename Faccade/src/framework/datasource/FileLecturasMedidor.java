/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.datasource;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import business.model.LecturaMedidor;

/**
 * @class FileLecturasMedidor [FACCADE DESING PATTERN]
 * @author GEORGE
 */

public class FileLecturasMedidor {
    
    private static final String PATH = "src\\framework\\datasource\\data\\lecturas.txt"; 
    private static ObjectOutputStream flujo_out;
    private static ObjectInputStream flujo_in;
    
    public static void saveLecturas(LecturaMedidor lectura) {
        try {
            flujo_out = new ObjectOutputStream(
                    new FileOutputStream(PATH));
           
            flujo_out.writeObject(lectura);
            
            flujo_out.flush();
            flujo_out.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static List<LecturaMedidor> getLecturas() {
        List<LecturaMedidor> list = new ArrayList<>();
        LecturaMedidor lm;
        
        try {
            flujo_in = new ObjectInputStream(new FileInputStream(PATH));
            
            while (true) {
                try {
                    lm = (LecturaMedidor) flujo_in.readObject();
                    list.add(lm);
                }catch(EOFException ex) {
                    break;
                }catch(IOException ex) {
                    ex.printStackTrace(System.out);
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace(System.out);
                }
            }
            flujo_in.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return list;
    }
}
