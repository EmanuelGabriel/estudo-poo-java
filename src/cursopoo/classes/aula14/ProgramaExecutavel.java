package cursopoo.classes.aula14;

import java.time.LocalDate;
import java.time.LocalDateTime;

import cursopoo.classes.aula14.model.Cliente;
import cursopoo.classes.aula14.model.ItemPedido;
import cursopoo.classes.aula14.model.Pedido;
import cursopoo.classes.aula14.model.Produto;
import cursopoo.classes.aula14.model.enums.StatusPedido;

public class ProgramaExecutavel {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.setId(1L);
		p1.setNome("TV Samsung");
		p1.setValor(1000.0);

		Produto p2 = new Produto();
		p2.setId(2L);
		p2.setNome("Mouse Microsoft");
		p2.setValor(58.90);

		ItemPedido itemPedido = new ItemPedido();
		itemPedido.setId(1L);
		itemPedido.setPreco(1000.0);
		itemPedido.setQuantidade(1);
		itemPedido.setProduto(p1);
		itemPedido.subTotal();

		ItemPedido itemPedido2 = new ItemPedido();
		itemPedido2.setId(2L);
		itemPedido2.setPreco(350.0);
		itemPedido2.setQuantidade(5);
		itemPedido2.setProduto(p2);
		itemPedido2.subTotal();

		Pedido pedido1 = new Pedido();
		pedido1.setId(1L);
		pedido1.setCliente(
				new Cliente(1L, "Júlio Cardoso Pinto", "juliocardoso@gmail.com", LocalDate.of(1998, 02, 12)));
		pedido1.setDataPedido(LocalDateTime.now());
		pedido1.setStatus(StatusPedido.PAGAMENTO_PENDENTE);
		pedido1.adicionarItem(itemPedido);
		pedido1.adicionarItem(itemPedido2);

		// System.out.println(itemPedido);
		// System.out.println(cliente);
		System.out.println(pedido1);

	}

}
