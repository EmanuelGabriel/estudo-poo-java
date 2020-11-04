package cursopoo.classes.aula07.executavel;

import cursopoo.classes.aula07.model.Banca;
import cursopoo.classes.aula07.model.Questao;

public class QuestaoTeste {
 
	public static void main(String[] args) { 

		Questao q1 = new Questao();
		q1.setCodigo(1L);
		q1.setEnunciado("Quem foi Pedro Alves Cabral?");
		q1.setBanca(new Banca(1L, "NUCEPE"));
		String[] respostas = new String[5];
		respostas[0] = "Um Flameguista sofredor";
		respostas[1] = "Um Pedreiro da NASA";
		respostas[2] = "Descobriu o Brasil dizendo ele";
		respostas[3] = "Não sei opiniar";
		respostas[4] = "Todas estão corretas";
		q1.setRespostas(respostas);

		if (respostas[2].contains("Brasil")) {
			System.out.println("Resposta correta");
		}

		System.out.println(q1);

	}

}
