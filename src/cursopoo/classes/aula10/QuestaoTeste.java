package cursopoo.classes.aula10;

import java.util.ArrayList;
import java.util.List;

public class QuestaoTeste {

	public static void main(String[] args) {

		Questao questoes = new Questao();
		questoes.setPergunta("Qual o protocolo da Internet?");
		List<String> alternativas = new ArrayList<>();
		alternativas.add("HTTP");
		alternativas.add("SMTP");
		alternativas.add("QUALQUER");
		alternativas.add("VPN");

		questoes.setAlternativas(alternativas);
		questoes.setRespostaCerta(0);

		System.out.println("Pergunta " + questoes.getPergunta());
		System.out.println("Resposta " + alternativas.get(0));

		System.out.println("===========================\n");

		List<Questao> q = new ArrayList<>();
		q.add(new Questao("Qual o protocolo da Internet?", 2, "VPN", "INTRANET", "HTTP", "SMTP", "NENHUM ACIMA"));
		q.add(new Questao("Quem descobriu o Brasil?", 1, "São Tomé de Aquino", "Pedro Alves Cabral", "Leandro Pinheiro",
				"Carlos Nascimento", "Fernando de Noronha"));

	}

}
