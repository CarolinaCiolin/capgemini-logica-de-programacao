//faca um algoritmo que receba N numeros e mostre positivo, negativo ou zero
//para cada numero

package com.example.ExJava24;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            
            System.out.println("Digite um número");
            int numero = leitor.nextInt();
            
            if(numero == 0){
                System.out.println("O número é zero");
            } else{
                if(numero > 0){
                    System.out.println("O número é positivo");
                }
                else{
                    System.out.println("O número é negativo");
                }
            }
            
            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = leitor.next().charAt(0);
            
        }
    }

}
