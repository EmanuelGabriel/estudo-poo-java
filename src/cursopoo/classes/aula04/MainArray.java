package cursopoo.classes.aula04;

public class MainArray {

	public static void main(String[] args) {

		String[] mes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		int[] totalDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < mes.length; i++) {
			System.out.println("O mês de " + mes[i] + " tem " + totalDias[i] + " dias");
		}

		System.out.println("\n\n=============");
		
		// 1) Entrar com número de 0 a 100 e informar se ele é ou não divisível por 5 --- (X) FEITO
		// 2) Entrar com número de 0 a 100 e informar se ele é ou não divisível por 3 e Divisível por 5
		// 3) Entrar com número de 0 a 100 e informar se ele é ou não divisível por 10 ou divisível por 5 ou divisível por 2 ou não tem nenhum deste.

		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println("Divisível por 5: " + i);
			} else {
				System.out.println("O número " + i + " não é divisível por 5");
			}

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Divisível por 3 e 5" + i);
			} else {
				System.out.println("O número " + i + " não é divisível por 3 e 5");
			}

			if (i % 10 == 0 || i % 5 == 0 || i % 2 == 0) {
				System.out.println("O número " + i + " é divisível por 10, 5 e 2");
			} else {
				System.out.println("Não é divisível por 10, 5, 2");
			}
			
		}

	}

}
