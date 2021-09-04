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
public class OperatorExpression implements Expression{

    private String operation;

    public OperatorExpression(String operation) {
        this.operation = operation;
    }
    
    @Override
    public void interpret(Context context) {
        context.setNextOp(operation);
    }
}
