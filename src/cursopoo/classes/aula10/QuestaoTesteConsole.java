package cursopoo.classes.aula10;

import java.util.ArrayList;
import java.util.List;

public class QuestaoTesteConsole {

	public static void main(String[] args) {

		int pontuacao = 0;
		Questao q1 = new Questao("Qual a cor do céu?", 0, "Azul", "Preto", "Amarelo", "Vermelho", "Verde");
		Questao q2 = new Questao("Qual a cor da SpaceX?", 4, "Azul", "Preto", "Amarelo", "Vermelho", "Branco");

		List<Questao> listaQuestoes = new ArrayList<>();
		listaQuestoes.add(q1);
		listaQuestoes.add(q2);

		for (int i = 0; i < listaQuestoes.size(); i++) {
			System.out.println(listaQuestoes.get(i));
			Questao q = new Questao();
			List<String> alternativas = q.getAlternativas();

		}

		System.out.println(q1);
		System.out.println(q2);
		System.out.println("Você acertou " + pontuacao + " questões.");

	}

}
