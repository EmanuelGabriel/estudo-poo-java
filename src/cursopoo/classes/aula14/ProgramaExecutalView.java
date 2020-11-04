package cursopoo.classes.aula14;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import cursopoo.classes.aula14.model.Cliente;
import cursopoo.classes.aula14.model.ItemPedido;
import cursopoo.classes.aula14.model.Pedido;
import cursopoo.classes.aula14.model.Produto;
import cursopoo.classes.aula14.model.enums.StatusPedido;

public class ProgramaExecutalView {

	
	public static void main(String[] args) {

		String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
		String dataNascimentoCliente = JOptionPane
				.showInputDialog("Digite a data de nascimento do cliente " + nomeCliente.toUpperCase());
		String email = JOptionPane.showInputDialog("Digite o e-mail do cliente");

		Cliente cliente = new Cliente(1L, nomeCliente, email, LocalDate.parse(dataNascimentoCliente));

		Pedido pedido = new Pedido(1L, LocalDateTime.now(), StatusPedido.PROCESSANDO, cliente);

		int qtdItensPedido = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens a serem adicionado no pedido"));
		
		for (int i = 0; i < qtdItensPedido; i++) {

			JOptionPane.showMessageDialog(null, "Agora, digite o " + (i + 1) + "º item do pedido");
			
			String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto");
			Double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + nomeProduto.toUpperCase()));
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do item do pedido"));

			Produto produto = new Produto(1L, nomeProduto, valorProduto);
			ItemPedido itemPedido = new ItemPedido(1L, quantidade, valorProduto, produto);
			pedido.adicionarItem(itemPedido);

		}

		imprimirPedido(pedido);

	}

	public static void imprimirPedido(Pedido pedido) {
		System.out.println("\n==========PEDIDO REALIZADO COM SUCESSO===============\n");
		System.out.println(pedido);
		System.out.println("\n==========PEDIDO GERADO EM " + pedido.getDataPedido() + " ===============\n");
	}

}
