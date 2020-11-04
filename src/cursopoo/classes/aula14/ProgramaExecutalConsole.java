package cursopoo.classes.aula14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import cursopoo.classes.aula14.model.Cliente;
import cursopoo.classes.aula14.model.ItemPedido;
import cursopoo.classes.aula14.model.Pedido;
import cursopoo.classes.aula14.model.Produto;
import cursopoo.classes.aula14.model.enums.StatusPedido;

public class ProgramaExecutalConsole {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE;

		// Uso do Scanner
		System.out.println("Digite o nome do cliente");
		System.out.print("Nome: ");
		String nome = teclado.nextLine();

		System.out.println("Digite a data de nascimento do cliente " + nome);
		System.out.print("Data de Nascimento: ");
		LocalDate dataNascimento = LocalDate.parse(teclado.nextLine(), format);

		System.out.println("Digite o e-mail do cliente");
		System.out.print("E-mail: ");
		String email = teclado.nextLine();

		Cliente cliente = new Cliente(1L, nome, email, dataNascimento);

		Pedido pedido = new Pedido(1L, LocalDateTime.now(), StatusPedido.PAGAMENTO_PENDENTE, cliente);

		System.out.println("Quantos itens desejar adicionar no pedido?");
		int qtd = teclado.nextInt();

		for (int i = 0; i < qtd; i++) {

			System.out.println("Digite o " + (i + 1) + "º " + "item do pedido");

			System.out.print("Nome do produto: ");
			teclado.nextLine();
			String nomeProduto = teclado.nextLine();

			System.out.print("Preço do produto: ");
			double preco = teclado.nextDouble();

			System.out.print("Digite a quantidade do item do pedido");
			int quantidade = teclado.nextInt();

			Produto produto = new Produto(1L, nomeProduto, preco);
			ItemPedido itemPedido = new ItemPedido(1L, quantidade, preco, produto);
			pedido.adicionarItem(itemPedido);

		}

		// imprimir o pedido:
		System.out.println("\n==========PEDIDO REALIZADO COM SUCESSO!===============\n");
		System.out.println(pedido);

		// finaliza o Scanner
		teclado.close();

	}
}
