/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.interactors.implementation;

import java.util.List;
import business.model.LecturaMedidor;
import framework.datasource.FileLecturasMedidor;

/**
 *
 * @author GEORGE
 */
public class LecturaMedidorViewModel {
    
    public static void agregarLectura(LecturaMedidor lm) {
       FileLecturasMedidor.saveLecturas(lm);
    }
    
    public static List<LecturaMedidor> getLecturas() {
        return FileLecturasMedidor.getLecturas();
    }
    
}
