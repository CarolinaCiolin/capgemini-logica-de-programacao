/* Faca um algoritmo que receba o preco de custo e o preco de venda de 40
produtos. Mostre como resultado se houve lucro, prejuizo ou empate para cada
produto. Informe o valor de custo de cada produto, o valor de venda de cada
produto, a media de preco de custo e do preco de venda
*/

package com.example.ExJava22;

import java.util.Scanner;
        
public class App {

    public static void main(String[] args) {
    
    Scanner leitor = new Scanner(System.in);
    
    String nomeProduto;
    float precoCusto;
    float precoVenda;
    float somaPrecoCusto = 0.0f;
    float somaPrecoVenda = 0.0f;
    
    int i = 0; //declarou a variavel fora do for, pra poder usa-la fora do for
    for(; i < 2; i++){
        
        System.out.println("Digite o nome do produto: ");
        nomeProduto = leitor.next();
        
        System.out.println("Digite o preço de custo do produto: R$");
        precoCusto = leitor.nextFloat();
        somaPrecoCusto += precoCusto;
        
        System.out.println("Digite o preço de venda do produto: R$");
        precoVenda = leitor.nextFloat();
        somaPrecoVenda += precoVenda;
        
        if(precoCusto == precoVenda){
            System.out.println("Empate");
        } else if(precoCusto > precoVenda){
            System.out.println("Prejuízo");
        } else{
            System.out.println("Lucro");
        }
        
        System.out.println(nomeProduto + " - preço de custo: R$" + precoCusto
        + " - preço de venda: R$" + precoVenda);
    }
    
    
    System.out.println("A média do preço de custo é: R$" + (somaPrecoCusto / i));
    System.out.println("A média do preço de venda é: R$" + (somaPrecoVenda / i));
}

}