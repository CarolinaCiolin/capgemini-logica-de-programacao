//Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
//Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado
//(media <= 5) e Recuperação (media entre 5.1 a 6.9);

import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {
		
		float nota1 = 0.0f, nota2 = 0.0f, nota3 = 0.0f;
		float media = 0.0f;
		String nome, resultado;

		nome = JOptionPane.showInputDialog("Informe seu nome:");
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 1ª nota:"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 2ª nota:"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 3ª nota:"));
		
		media = (nota1 + nota2 + nota3) / 3;
		
		JOptionPane.showMessageDialog(null, "Aluno: " + nome);
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado"); 
		}else if(media > 5 && media < 7){
			JOptionPane.showMessageDialog(null, "Recuperação"); 
		}else {
			JOptionPane.showMessageDialog(null, "Reprovado"); 
		}
		
	}

}
