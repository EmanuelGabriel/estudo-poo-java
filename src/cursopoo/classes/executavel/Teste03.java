package cursopoo.classes.executavel;

public class Teste03 {

	public static void main(String[] args) {

		// Leia os números de 0 a 100 e informe qual deles é divisível
		// Divisível por 2 e 3
		// Divisível por 5

		for (int i = 0; i <= 100; i++) {

			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println("Número '" + i + "' é divisível por 2 e 3");

			} else if ((i % 5 == 0)) {
				System.out.println("Número '" + i + "' é divisível por 5");

			}

		}

	}

}
