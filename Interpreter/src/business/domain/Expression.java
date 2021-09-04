/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.domain;

import business.data.Context;

/**
 *
 * @author JHON CERNA
 */
public interface Expression {
    
    void interpret(Context context);
}
