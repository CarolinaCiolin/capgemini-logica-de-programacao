/*A concessionaria de veiculos Carango Velho esta vendendo seus veiculos com
desconto. Faca um algoritmo que calcule e exiba o valor do desconto e o valor a
ser pago por cliente de varios carros. O desconto devera ser calculado de acordo
com o ano do veiculo. Até 2000 - 12% e acima de 2000 - 7%. O sistema devera
perguntar se deseja continuar calculando o desconto ate que a resposta seja N -
Não. Informar o total de carros com ano até 2000 e total geral
*/

package com.example.ExJava20;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.00f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        char desejaRepetir = 's';
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaRepetir == 's' || desejaRepetir == 'S'){
            
            System.out.println("Digite o ano de fabricação do veículo: ");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o valor do veículo: ");
            valorCarro = leitor.nextFloat();
            
            if(anoFabricacao <= 2000){//carros velhos
                porcentagemDesconto = 0.12f;
            } else{//carros semi-novos
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;
            
            valorDesconto = valorCarro * porcentagemDesconto;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.println("O valor do desconto é: " + valorDesconto);
            System.out.println("O valor a ser pago é: " + valorPagar);
            
            System.out.println("Deseja realizar um novo cadastro? S - Sim / N "
                    + "- Não");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        System.out.println("O total de carros semi-novos é: " +
                 totalCarrosSemiNovos);
        System.out.println("O total de carros é: " + totalCarros);
    }
}
