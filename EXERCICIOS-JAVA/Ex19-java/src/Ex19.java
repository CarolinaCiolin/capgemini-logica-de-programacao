//Escreva um algoritmo que leia o nome e o sexo de 5 pessoas e informe o nome e se ela é homem ou mulher.
//No final informe total de homens e de mulheres;
import javax.swing.JOptionPane;

public class Ex19 {

	public static void main(String[] args) {
		
		String nome;
		char sexo;
		int contM = 0, contF = 0;
		
		for(int i = 0; i < 5; i++) {
			
			nome = JOptionPane.showInputDialog("Digite seu nome");
			String sexoInput = JOptionPane.showInputDialog("Digite seu sexo (M/F)");
			
			while(!sexoInput.equalsIgnoreCase("m") && !sexoInput.equalsIgnoreCase("f")){//equalsIgnoreCase é um método que pede um atributo. O ! é para fazer a negacao
				JOptionPane.showMessageDialog(null, "Resposta inválida. Digite M para masculino ou F para"
						+ " feminino");
				sexoInput = JOptionPane.showInputDialog("Digite seu sexo (M/F):");
			}
			
			sexo = sexoInput.charAt(0);
			
			if(sexo == 'M' || sexo == 'm') {
				contM++;
				JOptionPane.showMessageDialog(null, nome + " é homem");
			}else{
				contF++;
				JOptionPane.showMessageDialog(null, nome + " é mulher");
			}
				
		}
			
		JOptionPane.showMessageDialog(null, "A quantidade de homens é: " + contM + " e a quantidade"
				+ " de mulheres é: " + contF);
	}
	
	}
	

		

