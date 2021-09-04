/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.usecases;

import business.data.Context;
import business.domain.Expression;

/**
 *
 * @author JHON CERNA
 */
public class NumericExpression implements Expression {

    private String value;

    public NumericExpression(String value) {
        this.value = value;
    }
    
    @Override
    public void interpret(Context context) {
        context.setOperator(context.getInt(value));
        context.calculate();
    }
}
