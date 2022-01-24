package com.dio.base;



/**
 * @author Vitor Abreu
 * @version 1.0.0
 * @since Release 1.0.0
 */


public class Calculadora {




    public double calcular(double firstValue, String operation, double secondValue) throws RuntimeException {

        return switch (operation) {
            case "+" -> firstValue + secondValue;
            case "-" -> firstValue - secondValue;
            case "*" -> firstValue * secondValue;
            case "/" -> firstValue / secondValue;
            default -> throw new RuntimeException("ERRO: operação invalida");
        };
    }
}

