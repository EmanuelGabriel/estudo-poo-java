package cursopoo.classes.aula11;

import javax.swing.JOptionPane;

public class Aula11Teste03 {

	public static void main(String[] args) {

		// criar uma array de 10 posições e atribuí as posições de cada elemento do
		// array

		int quantidadeElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas a serem cadastradas"));		
		
		double[] notas = new double[quantidadeElementos];

		for (int i = 0; i < quantidadeElementos; i++) {
			double tecladoNota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da posição " + (i + 1) + "º"));
			notas[i] = tecladoNota;
		}

		// exibindo as notas
		for (int i = 0; i < quantidadeElementos; i++) {
			System.out.println("na posição " + (i + 1) + " - " + "tem nota: " + notas[i]);
		}

	}

}
