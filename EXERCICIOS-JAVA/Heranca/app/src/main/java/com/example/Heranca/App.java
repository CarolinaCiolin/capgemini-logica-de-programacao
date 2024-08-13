
package com.example.Heranca;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Márcio");
        v.setSalario(1000.0f);
        v.setCpf("41063302810");
        v.setDataNascimento(new Date());//usa como ex a data de hj
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salário do vendedor é " + v.calcularSalario());
        
        Motorista m = new Motorista();
        
    }

}