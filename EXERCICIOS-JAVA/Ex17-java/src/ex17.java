//Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
//(inclusive);

import javax.swing.JOptionPane;

public class ex17 {

	public static void main(String[] args) {
		
		int num, contador = 0;

		for(int i = 1; i <= 80; i++){
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
			
			if(num >= 10 && num <= 150) {
				contador++;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de números no intervalo entre 10 e 150 é: " +
		contador);

	}

}
