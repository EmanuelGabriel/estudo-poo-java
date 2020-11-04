package cursopoo.classes.aula04.teste;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class EstudoArray04 {

	/**
	 * Array pode ser de todos os tipos de dados como Objetos e tipos primitivos em
	 * JAVA
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] nomes = { "Jonas Nunes", "Fernando Cezar", "Carlos Nascimento", "Amaral Cabral" };
		Arrays.sort(nomes); // ordenar os nomes
		for (String n : nomes) {
			System.out.println("Meu nome é " + n.toUpperCase());
		}

		System.out.println("\n-----------");

		double[] n = new double[4]; // quantidade de elementos no vetor ou array é 4
		n[0] = 6.7; // 1
		n[1] = 9.5; // 2
		n[2] = 10.0; // 3
		n[3] = 7.2; // 4
		for (int i = 0; i < n.length; i++) {
			System.out.println("Nota " + (i + 1) + " é " + n[i]);
		}

		System.out.println("\n========VETOR/ARRAY==========");

		String posicoes = JOptionPane.showInputDialog("Quantas posições o seu Vetor/Array deve ter?");

		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição " + pos + "º ?");
			notas[pos] = Double.valueOf(valor);
		}

		for (int i = 0; i < notas.length; i++) {
			JOptionPane.showMessageDialog(null, "Nota " + (i + 1) + " é " + notas[i]);
			System.out.println("Nota " + (i + 1) + " é " + notas[i]);
		}

	}

}
