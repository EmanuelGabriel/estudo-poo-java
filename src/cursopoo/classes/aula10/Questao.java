package cursopoo.classes.aula10;

import java.util.ArrayList;
import java.util.List;

public class Questao {

	private Long codigo;
	private String pergunta;
	private List<String> alternativas = new ArrayList<>();
	private int respostaCerta;

	public Questao() {
	}

	public Questao(String pergunta, int respostaCerta, String... alternativas) {
		this.pergunta = pergunta;
		this.alternativas.add(alternativas[0]);
		this.alternativas.add(alternativas[1]);
		this.alternativas.add(alternativas[2]);
		this.alternativas.add(alternativas[3]);
		this.respostaCerta = respostaCerta;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public List<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public int getRespostaCerta() {
		return respostaCerta;
	}

	public void setRespostaCerta(int respostaCerta) {
		this.respostaCerta = respostaCerta;
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
		Questao other = (Questao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Questao [codigo=" + codigo + ", pergunta=" + pergunta + ", alternativas=" + alternativas
				+ ", respostaCerta=" + respostaCerta + "]";
	}

}
