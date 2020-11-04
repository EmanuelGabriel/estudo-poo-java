package cursopoo.classes.aula11;

public class Aula11ArraysTeste {

	public static void main(String[] args) {

		int numeros = 100;
		int count;
		for (count = 0; count <= numeros; count++) {

			if (count % 3 == 0) {
				System.out.println("Número " + count + " é divisível por 3");
			}

			if (count % 5 == 0) {
				System.out.println("Número " + count + " é divisível por 5");
			}

			if (count % 10 == 0) {
				System.out.println("Número " + count + " é divisível por 10");
			}

		}

	}

}
