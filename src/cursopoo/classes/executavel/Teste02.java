package cursopoo.classes.executavel;

public class Teste02 {

	public static void main(String[] args) {
		
		 //Faça um programa que mostre a soma de todos os números no intervalo de 1 até 100.
		
			System.out.println("Faça um programa que mostre a soma de todos os números no intervalo de 1 até 100.");
			int resultado = somarNumeros(50);
			System.out.println("Resultado da soma total dos números: " + resultado);
		}

		static int somarNumeros(int numero) {
			int soma = 0;
			for (int i = 1; i <= numero; i++) {
				soma += i;
			}
			return soma;

		}
	}
