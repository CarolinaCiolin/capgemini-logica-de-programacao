package com.example.Heranca;

public class Vendedor extends Funcionario{//heranca
    
    private int totalItensVendidos;
    private float comissaoPorItem;
    
    //metodo construtor
    public Vendedor(){
        super();/*informa que deseja que o Vendedor possua todos os atributos
        da classe superior (Funcionario)*/
    }
    
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
        /*chamando metodo de Funcionario. THIS informa que quer pegar um
        atributo da classe atual (Vendedor)*/
    }
    
    public int getTotalItensVendidos(){
        return totalItensVendidos;
    }
    
    public void setTotalItensVendidos(int totalItensVendidos){
        this.totalItensVendidos = totalItensVendidos;
    }
    
    public float getComissaoPorItem(){
        return comissaoPorItem;
    }
    
    public void setComissaoPorItem(float comissaoPorItem){
        this.comissaoPorItem = comissaoPorItem;
    }
    
    
}

