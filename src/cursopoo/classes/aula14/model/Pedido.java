package cursopoo.classes.aula14.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import cursopoo.classes.aula14.model.enums.StatusPedido;

public class Pedido {

	private Long id;
	private LocalDateTime dataPedido;
	private StatusPedido status;

	private Cliente cliente;
	private List<ItemPedido> itens = new ArrayList<>();

	public Pedido() {
	}

	public Pedido(Long id, LocalDateTime dataPedido, StatusPedido status, Cliente cliente) {
		this.id = id;
		this.dataPedido = dataPedido;
		this.status = status;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionarItem(ItemPedido itemPedido) {
		this.itens.add(itemPedido);
	}

	public void removerItem(ItemPedido itemPedido) {
		this.itens.remove(itemPedido);
	}

	/**
	 * Método responsável em somar todos os subtotais dos preços de cada Item do Pedido
	 * 
	 * @return double
	 */
	public double total() {
		double total = 0.0;
		for (ItemPedido itemPedido : itens) {
			total += itemPedido.subTotal();
		}

		return total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Código/Pedido: ");
		sb.append(id + "\n");
		sb.append("Data do pedido: ");
		sb.append(dataPedido + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente.getNome() + "\n");
		sb.append("\nItens do pedido:\n");
		for (ItemPedido ip : itens) {
			sb.append(ip + "\n");
		}
		sb.append("Valor Total do Pedido: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
