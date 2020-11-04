package cursopoo.classes.aula09;

import java.util.Scanner;

import cursopoo.classes.aula09.entidade.Estoque;
import cursopoo.classes.aula09.entidade.Produto;

public class ProdutoTesteScanner {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos Produtos você quer cadastrar?");
		int quantidadeProdutos = entrada.nextInt();

		entrada.nextLine();

		// instancia um objeto da classe Estoque
		Estoque estoque = new Estoque();

		// instancia um array de produtos com a quantidade de
		// posições que o usuário informou
		estoque.produtos = new Produto[quantidadeProdutos];

		// percorre todas as posições no array (que estão nulas)
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			System.out.println("Produto " + i);

			System.out.println("----------------");

			System.out.println("Descrição");
			estoque.produtos[i].descricao = entrada.nextLine();

			System.out.println("Quantidade:");
			estoque.produtos[i].quantidade = entrada.nextInt();

			entrada.nextLine();

			System.out.println("------------");

		}

		estoque.listarProdutos();
		estoque.quantidadeTotalProdutos();

	}

}
