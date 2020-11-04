package cursopoo.classes.modelos;

import java.util.Arrays;

/**
 * 
 * @author Emanuel Gabriel
 *
 */
public class Disciplina {

	private String nome;
	private double[] notas;

	public Disciplina() {
	}

	public Disciplina(String nome, double nota) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getMediaNotas() {
		double somaNotas = 0.0;
		for (int pos = 0; pos < notas.length; pos++) {
			somaNotas += notas[pos];
		}
		return somaNotas / 4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Disciplina other = (Disciplina) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", notas=" + Arrays.toString(notas) + "]";
	}

}
