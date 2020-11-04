package cursopoo.classes.executavel;

import java.util.Scanner;

public class TesteLogin {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Login: ");
		String login = teclado.nextLine();

		System.out.print("Senha: ");
		String senha = teclado.nextLine();

		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("12345")) {
			System.out.printf("Usuário %s logado com sucesso!", login);
		} else {
			System.out.println("Login ou senha inválidos!");
		}

		teclado.close();

	}
}
