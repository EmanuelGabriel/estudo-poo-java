package cursopoo.classes.aula11;

import java.util.Arrays;

public class Aula11ArrayTeste02 {

	public static void main(String[] args) {

		int i;
		int qtdElementos = 5;
		int[] x = new int[qtdElementos]; // terá 5 elementos - padrão dos tipos de dados primitivos em JAVA é 0.

		for (i = 0; i < x.length; i++) {
			System.out.println("na posição " + i + " - " + "tem valor: " + x[i]);
		}

		System.out.println("\n=======ATRIBUÍ O VALOR 50 NO ARRAY DE TAMANHO 10=========\n");

		for (int v = 0; v < x.length; v++) {
			x[v] = 50;
			System.out.println("na posição " + i + " - " + "tem valor: " + x[v]);
		}

		System.out.println("\n=======ARRAY DE STRING=========\n");

		int[] ab = new int[16];

		Arrays.fill(ab, 50);
		for (int a = 0; a < ab.length; a++) {
			System.out.println("Array: ab " + ab[a]);
		}

	}

}
