/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.data;

import java.util.HashMap;
import java.util.Map;

/**
 * @class Context [INTERPRETER DESING PATTERN]
 * @author JHON CERNA
 */
public class Context {

    private String nextOp;
    private int operator;
    private int result;

//    private final Map<String, Integer> dictionary_n = new HashMap() {
//        {
//            put("cero", 0);
//            put("uno", 1);
//            put("dos", 2);
//            put("tres", 3);
//            put("cuatro", 4);
//            put("cinco", 5);
//            put("seis", 6);
//            put("siete", 7);
//            put("ocho", 8);
//            put("nueve", 9);
//        }
//    };

//    private final Map<String, String> dictionary_op = new HashMap() {
//        {
//            put("mas", "+");
//            put("menos", "-");
//            put("por", "*");
//            put("multiplicado por", "*");
//            put("entre", "/");
//            put("dividido por", "/");
//        }
//    };

    public Context() {
        this.nextOp = "";
        this.operator = 0;
        this.result = 0;
    }

    public String getNextOp() {
        return nextOp;
    }

    public void setNextOp(String nextOp) {
        
        switch (nextOp) {
            case "mas":
                this.nextOp = "+"
                ;break;
            case "menos":
                this.nextOp = "-"
                ;break;
            case "por":
                this.nextOp = "*"
                ;break;
            case "entre":
                this.nextOp = "/"
                ;break;    
            default:
                this.nextOp = "-";
        } 
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

//    public String analyzeNextOp(String nextOp) {
//        return dictionary_op.get(nextOp);
//    }

    public void calculate() {
        switch (nextOp.trim().toLowerCase()) {
            case "+":
                result += operator;
                break;
            case "-":
                result -= operator;
                break;
            case "*":
                result *= operator;
                break;
            case "/":
                result /= operator;
                break;
            default:
                result += operator;;
        }
    }

    public int getInt(String value) {
        switch (value.trim().toLowerCase()) {
            case "cero": {
                return 0;
            }

            case "uno": {
                return 1;
            }

            case "dos": {
                return 2;
            }

            case "tres": {
                return 3;
            }

            case "cuatro": {
                return 4;
            }

            case "cinco": {
                return 5;
            }

            case "seis": {
                return 6;
            }

            case "siete": {
                return 7;
            }

            case "ocho": {
                return 8;
            }

            case "nueve": {
                return 9;
            }

            default: {
                return -1;
            }
        }

    }

    public int getResult() {
        return result;
    }
}
