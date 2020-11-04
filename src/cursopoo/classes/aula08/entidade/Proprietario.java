package cursopoo.classes.aula08.entidade;

public class Proprietario {

	private Long codigo;
	private String nome;
	private String cpf;
	private int idade;
	private String logradouro;
	private String estado;
	private String cidade;

	public Proprietario() {
	}

	public Proprietario(Long codigo, String nome, String cpf, int idade, String logradouro, String estado,
			String cidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.logradouro = logradouro;
		this.estado = estado;
		this.cidade = cidade;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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
		Proprietario other = (Proprietario) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Proprietario [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", estado="
				+ estado + ", cidade=" + cidade + "]";
	}

}
