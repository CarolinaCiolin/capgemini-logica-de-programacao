//Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas
//efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
//suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {

		String nomeVendedor;
		float salarioFixo = 0.0f, totalVendas = 0.0f, comissao = 0.0f, salarioFinal = 0.0f;

		nomeVendedor = JOptionPane.showInputDialog("Informe o nome do vendedor: ");
		salarioFixo = Integer.parseInt(JOptionPane.showInputDialog("Informe o salário"));
		totalVendas = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de vendas"));

		comissao = totalVendas * 0.15f;
		salarioFinal = salarioFixo + comissao;

		JOptionPane.showMessageDialog(null,
				"Nome do vendedor: " + nomeVendedor + " - Salário: " + salarioFixo + " - Salário final: " +
		salarioFinal);

	}
}

