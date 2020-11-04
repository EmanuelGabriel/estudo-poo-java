package cursopoo.classes.aula08.entidade;

public class Carro {

	private Long codigo;
	private String fabricante;
	private String modelo;
	private String cor;
	private int anoFabricacao;
	private Proprietario proprietario; // A classe Carro TEM UM Proprietário - TemUm (OneToOne)

	public Carro() {
	}

	public Carro(Long codigo, String fabricante, String modelo, String cor, int anoFabricacao) {
		this.codigo = codigo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
	}

	/**
	 * método sem retorno - void
	 */
	public void ligarCarro() {
		System.out.println("Ligando o carro: " + this.modelo);
	}

	 
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Carro [codigo=" + codigo + ", fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor
				+ ", anoFabricacao=" + anoFabricacao + "]";
	}

}
