package cursopoo.classes.aula09;

import javax.swing.JOptionPane;

import cursopoo.classes.aula09.entidade.Estoque;
import cursopoo.classes.aula09.entidade.Produto;

public class ProdutoTesteView {

	public static void main(String[] args) {

		int qtdProdutos = Integer.parseInt(JOptionPane.showInputDialog("Quantos Produtos você quer cadastrar?"));

		Estoque estoque = new Estoque();
		estoque.produtos = new Produto[qtdProdutos];

		for (int i = 0; i < qtdProdutos; i++) {

			estoque.produtos[i] = new Produto();

			String descricao = JOptionPane.showInputDialog("Digite a descrição do produto");
			estoque.produtos[i].descricao = descricao;

			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
			estoque.produtos[i].quantidade = quantidade;

		}

		estoque.listarProdutos();
		estoque.quantidadeTotalProdutos();

	}

}
