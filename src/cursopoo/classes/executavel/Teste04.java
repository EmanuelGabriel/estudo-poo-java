package cursopoo.classes.executavel;

import java.util.Scanner;

public class Teste04 {

	/**
	 * Faça um programa que peça para o usuário digitar um número, em seguida, faça
	 * a soma de todos os algarismos do número.
	 *
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = teclado.nextInt();

		int soma = 0;

		while (numero > 0) {
			soma += (numero % 10);
			numero /= 10;
			System.out.println("O valor de soma é: " + soma);
		}

		System.out.println();
		System.out.println("A soma dos algarismos é: " + soma);
		teclado.close();

	}

}
