package cursopoo.classes.executavel;

public class Teste {

	public static void main(String[] args) {

		/**
		 * Percorrer de 0 a 100
		 */

		int i;
		for (i = 0; i < 100; i++) {

			if ((i % 3 == 0)) {
				System.out.println("Número '" + i + "' é divisível por 3");
			} else if ((i % 5 == 0)) {
				System.out.println("Número '" + i + "' é divisível por 5");
			} else if ((i % 10 == 0)) {
				System.out.println("Número '" + i + "' é divisível por 10");
			}
		}

	}

}
