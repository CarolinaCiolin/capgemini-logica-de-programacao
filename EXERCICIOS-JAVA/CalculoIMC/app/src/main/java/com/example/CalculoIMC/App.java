package com.example.CalculoIMC;

import java.util.Scanner;

public class App {

   public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        Pessoa objetoPessoa = new Pessoa(); //cria uma nova variavel (nao primitiva), do tipo Pessoa

        System.out.println("Digite o peso da pessoa");
        objetoPessoa.peso = leitor.nextFloat();

        System.out.println("Digite a altura da pessoa");
        objetoPessoa.altura = leitor.nextFloat();

        System.out.println("IMC = " + objetoPessoa.calcularIMC());

    }
}
