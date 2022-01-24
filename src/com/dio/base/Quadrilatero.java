package com.dio.base;

public class Quadrilatero {

    public static double area(double lado){
        return lado*lado;
    }
    public static double area(double lado, double altura) {
        return lado * altura;
    }
    public static double area(double baseMaior, double baseMenor, double altura) {
        return baseMaior+baseMenor/2*altura;
    }
}



