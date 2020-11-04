package cursopoo.classes.aula09.excercicios;

public class Pessoa {

	private String nome;
	private Cachorro cachorro;

	public Pessoa() {
	}

	public Pessoa(String nome, Cachorro cachorro) {
		this.nome = nome;
		this.cachorro = cachorro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cachorro getCachorro() {
		return cachorro;
	}

	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cachorro=" + cachorro + "]";
	}

}
