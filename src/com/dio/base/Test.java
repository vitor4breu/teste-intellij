package com.dio.base;

import com.dio.base.Carro;



class Test{
    public static void main(String[] args) {
      Carro carro = new Carro(42f, 6.10f);
        System.out.println(carro.valorEncherTanque());
    }

}