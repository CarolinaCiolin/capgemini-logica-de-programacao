package com.example.CalculoIMC;

public class Pessoa {//responsavel por calcular o IMC

    //Atributos
    float peso;
    float altura;

    //Metodos
    public float calcularIMC(){//public = modificador de acesso; float = caso o metodo gere um retorno, este retorno sera do tipo float; calcularIMC = nome do metodo
        float imc = peso / (altura * altura);
        return imc;
    }
}