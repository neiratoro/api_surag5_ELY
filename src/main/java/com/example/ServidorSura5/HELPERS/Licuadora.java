package com.example.ServidorSura5.HELPERS;

public class Licuadora {

    // Diseñar un proceso para sumar 2 numeros

    public void licuadora(){

        int numeroUno = 10;
        int numeroDos=8;
        int resultado = numeroUno + numeroDos;
        System.out.println("La suma es: "+resultado);

        int numeroTres = 10;
        int numeroCuatro=8;
        int resultadoDos = numeroTres + numeroCuatro;
        System.out.println("La suma es: "+resultadoDos);

        int numeroCinco = 1000000;
        int numeroSeis=15000000;
        int resultadoTres = numeroCinco + numeroSeis;
        System.out.println("La suma es: "+resultadoTres);

    }
    //cuerpo de funcion
    public Integer sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
}
