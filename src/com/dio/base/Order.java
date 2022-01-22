package com.dio.base;



/**
 * @author Vitor Abreu
 * @version 1.0.0
 * @since Release 1.0.0 
*/


public class Order {
    
    // representa o código do pedido
    private final double totalValue;
    private final String code;

    /**
     * Construtor da classe
     * 
     * @param code          Código do pedido
     * @param totalValue    Valor total do pedido
     */
    public Order(String code, double totalValue) {

        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Calcula o valor total de caordo com o valor do pedido. Se o valor for maior que 100, uma taxa é cobrada.
     * 
     * @return  Valor toral do pedido com as taxas
     * @throws RuntimeException Se o valor do pedido for negativo
     */

    public double calculateFee() throws RuntimeException {
        if (this.totalValue < 0){
            throw new RuntimeException("O pedido não pode ter valor negativo");
        }

        if (this.totalValue > 100) {
            return this.totalValue * 0.99;
        }

        return this.totalValue;

    }
}
