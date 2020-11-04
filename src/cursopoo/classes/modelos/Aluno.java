package cursopoo.classes.modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import cursopoo.classes.constantes.StatusAluno;

/**
 * 
 * @author Emanuel Gabriel
 * @since 1.0
 *
 */
public class Aluno {

	private String nome;
	private int idade;
	private LocalDate dataNascimento;
	private LocalDate dataCadastro;
	private String cpf;
	private String rg;
	private int matricula;
	private List<Disciplina> disciplinas = new ArrayList<>();

	public Aluno() {
	}

	public Aluno(String nome) {
		this.nome = nome;
		this.dataCadastro = LocalDate.now();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	/**
	 * 
	 * @return a média do Aluno
	 */
	public double getMediaNota() {
		double soma = 0.0;
		for (Disciplina disciplina : this.disciplinas) {
			soma += disciplina.getMediaNotas();
		}
		return soma / this.disciplinas.size();
	}

	/**
	 * true ou false
	 * 
	 * @return true para aprovado ou false para reprovado
	 */
	public boolean getAlunoAprovado() {
		double media = getMediaNota();
		if (media >= 7.0) {
			return true;
		}
		return false;
	}

	public String getStatusAluno() {
		double media = this.getMediaNota();
		if (media >= 5.0) {
			if (media >= 7.0) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", dataCadastro="
				+ dataCadastro + ", cpf=" + cpf + ", rg=" + rg + ", matricula=" + matricula + ", disciplinas="
				+ disciplinas + "]";
	}

}
