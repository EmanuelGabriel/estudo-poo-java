package cursopoo.classes.aula09.entidade;

public class Paciente {

	private Long codigo;
	private String nome;
	private double peso;
	private double altura;

	public Paciente() {
	}

	public Paciente(Long codigo, String nome, double peso, double altura) {
		this.codigo = codigo;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * método responsável em calcular o índice de massa corporal
	 * 
	 * @return imc
	 */
	public double calcularIndiceMassaCorporal() {
		double imc = peso / (altura * altura);
		return imc;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
