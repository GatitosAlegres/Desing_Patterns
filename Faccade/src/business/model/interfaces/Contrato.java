/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model.interfaces;

/**
 *
 * @author GEORGE
 */
public interface Contrato extends Conexion, OpcionTarifaria  {
    
    float precioAPagar(float consumo);
}
