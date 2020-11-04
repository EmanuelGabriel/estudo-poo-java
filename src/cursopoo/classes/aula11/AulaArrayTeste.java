package cursopoo.classes.aula11;

import java.util.Scanner;

public class AulaArrayTeste {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeroAlunos = 4;
		// 4 é a quantidade de elementos que esse array de notas de alunos terá
		double[] notasAlunos = new double[numeroAlunos];

		for (int i = 0; i < numeroAlunos; i++) {
			// entrada das notas
			System.out.println("Insira a nota " + (i + 1) + "º aluno");
			notasAlunos[i] = teclado.nextDouble();
		}

		System.out.println("=======NOTAS==========");

		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println("nota: " + notasAlunos[i]);
		}

	}

}
