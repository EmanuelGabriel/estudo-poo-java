package cursopoo.classes.aula12.entidade;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Long codigo;
	private String descricao;
	private Cliente cliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	private LocalDateTime dataVenda;
	private BigDecimal descontoVenda;
	private List<Produto> produtos = new ArrayList<>();

	public Venda() {
	}

	public Venda(Long codigo, String descricao, Cliente cliente, String enderecoEntrega, BigDecimal valorTotal,
			LocalDateTime dataVenda) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
		this.valorTotal = valorTotal;
		this.dataVenda = dataVenda;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public LocalDateTime getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDateTime dataVenda) {
		this.dataVenda = dataVenda;
	}

	public BigDecimal getDescontoVenda() {
		return descontoVenda;
	}

	public void setDescontoVenda(BigDecimal descontoVenda) {
		this.descontoVenda = descontoVenda;
	}

	/**
	 * Poderia ser feito várias validações antes de inserir/adicionar um Produto na
	 * Lista
	 * 
	 * @param produto
	 */
	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}

	/**
	 * Responsável em mostrar o valor total da soma de todos os Produtos
	 * 
	 * @return
	 */
	public BigDecimal getValorTotal() {
		this.valorTotal = this.totalVenda();
		return valorTotal;
	}

	private BigDecimal totalVenda() {
		BigDecimal total = BigDecimal.ZERO;
		for (Produto produto : produtos) {
			total = total.add(produto.getValor());
		}
		return total;
	}

	public BigDecimal aplicarDesconto(BigDecimal valorTotalVenda) {
		descontoVenda = this.getValorTotal();
		descontoVenda = descontoVenda.subtract(valorTotalVenda);
		return descontoVenda;
	}

	private double totalVendas() {
		double total = 0.0;
		for (Produto produto : produtos) {
			total += produto.getValor().doubleValue();
		}
		return total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Venda [codigo=" + codigo + ", descricao=" + descricao + ", cliente=" + cliente + ", enderecoEntrega="
				+ enderecoEntrega + ", valorTotal=" + valorTotal + ", dataVenda=" + dataVenda + ", produtos=" + produtos
				+ "]";
	}

}
