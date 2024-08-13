package com.example.Heranca;


import java.util.Date;

public class Funcionario {
    private String nome;
    private String cpf;
    private Date dataNascimento; /*Date nao e uma variavel do tipo primitivo.
    necessario importar a biblioteca que contenha este tipo. clicando com no
    simbolo de erro -> add import for Java.util.Date */
    private float salario;


    //metodo construtor
    public Funcionario(){
        
    }

    //metodos acessores
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
}