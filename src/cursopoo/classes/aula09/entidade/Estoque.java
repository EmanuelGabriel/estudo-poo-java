package cursopoo.classes.aula09.entidade;

public class Estoque {

	public Produto[] produtos;

	public void listarProdutos() {
		System.out.println("Produtos em estoque");
		System.out.println("----------------------");
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}

	public void quantidadeTotalProdutos() {
		int qtdProduto = 0;
		for (int i = 0; i < produtos.length; i++) {
			qtdProduto += produtos[i].quantidade;
		}
		System.out.println("Quantidade Total: " + qtdProduto);
	}

}
