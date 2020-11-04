package cursopoo.classes.aula13.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Venda {

	private Long id;
	private LocalDate dataVenda;
	private Cliente cliente;
	private List<Item> itens;
	private BigDecimal frete;
	private BigDecimal total;

	public Venda() {

	}

	public Venda(Long id, LocalDate dataVenda, Cliente cliente, BigDecimal frete, BigDecimal total) {
		this.id = id;
		this.dataVenda = dataVenda;
		this.cliente = cliente;
		this.frete = frete;
		this.total = total;
	}

	public void cadastrarVenda(Venda venda) {
		venda.setDataVenda(LocalDate.now());
		venda.getItens().forEach(add -> {
			add.setVenda(venda);
			add.setProduto(add.getProduto());
		});

		BigDecimal totalItens = venda.getItens().stream()
				.map(v -> v.getProduto().getValor().multiply(new BigDecimal(v.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		venda.setTotal(totalItens.add(venda.getFrete()));

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public BigDecimal getFrete() {
		return frete;
	}

	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
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
		Venda other = (Venda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", dataVenda=" + dataVenda + ", cliente=" + cliente + ", itens=" + itens + ", frete="
				+ frete + ", total=" + total + "]";
	}

}
