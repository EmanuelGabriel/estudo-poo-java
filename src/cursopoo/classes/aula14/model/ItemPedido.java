package cursopoo.classes.aula14.model;

public class ItemPedido {

	private Long id;
	private Integer quantidade;
	private Double preco;
	private Produto produto;

	public ItemPedido() {
	}

	public ItemPedido(Long id, Integer quantidade, Double preco, Produto produto) {
		this.id = id;
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	/**
	 * Método será responsável em somar o preço e a quantidade de cada Produto
	 * 
	 * @return double
	 */
	public double subTotal() {
		return this.preco * this.quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
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
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto: " + getProduto().getNome() + ", R$" + String.format("%.2f", preco) + ", Quantidade: "
				+ quantidade + ", SubTotal: R$ " + String.format("%.2f", subTotal());

	}

}
