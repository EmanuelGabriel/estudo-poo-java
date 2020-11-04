package cursopoo.classes.aula07.model;

import java.util.Arrays;

public class Materia {

	private Long codigo;
	private String nome;
	private Assunto[] assuntos;

	public Materia() {

	}

	public Materia(Long codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
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

	public Assunto[] getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(Assunto[] assuntos) {
		this.assuntos = assuntos;
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
		Materia other = (Materia) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nome=" + nome + ", assuntos=" + Arrays.toString(assuntos) + "]";
	}

}
