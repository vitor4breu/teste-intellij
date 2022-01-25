package com.dio.base;

public class Carro {

    String cor;
    String modelo;
    float capacidadeTanque;
    float valorGasolina;

    public Carro(String cor, String modelo, float capacidadeTanque, float valorGasolina) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.valorGasolina = valorGasolina;
    }

    public Carro(String modelo,  float capacidadeTanque, float valorGasolina) {
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.valorGasolina = valorGasolina;
    }

    public Carro(float capacidadeTanque, float valorGasolina) {
        this.capacidadeTanque = capacidadeTanque;
        this.valorGasolina = valorGasolina;
    }

    public float valorEncherTanque(){
        return (capacidadeTanque*valorGasolina);
    }


}
