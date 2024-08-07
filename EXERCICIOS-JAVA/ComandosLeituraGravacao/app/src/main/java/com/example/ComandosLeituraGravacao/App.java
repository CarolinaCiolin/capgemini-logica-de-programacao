package com.example.ComandosLeituraGravacao;

import java.util.Scanner; //importa o leitor

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); //criacao do leitor que permite que leia os dados das variaveis, por ex
        
        int idade = leitor.nextInt(); //cria uma variavel inteira e diz que quer guardar dentro dela a proxima linha que
        //for inteira que o leitor ler
        float cotacaoDolar = leitor.nextFloat(); //variavel do tipo REAL, com casas decimais
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine(); //variavel de texto. nextLine le toda a linha ate que de enter
        String codigoRua = leitor.next();//le somente uma palavra
        
        System.out.println("texto que sera exibido no console"); //exibe o texto e pula para a proxima linha
        System.out.print("texto que sera exibido no console"); //exibe o texto deixando o cursor na linha
    }
}
