package com.dio.base;

public class Emprestimo{
    public double valorFinal(int parcelas, double valor){
        double taxa = ((parcelas-1)*0.01)*valor;
        return taxa+valor;

    }

}
