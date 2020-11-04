package cursopoo.classes.aula10;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class QuestaoViewTeste {

	public static void main(String[] args) {
		
		List<Questao> questoes = new ArrayList<>();
		questoes.add(new Questao("Qual a cor do céu?", 0, "Azul", "Preto", "Amarelo", "Vermelho", "Verde"));
		questoes.add(new Questao("Todos são iguais perante a Lei sem distinção de raça, cor e etnia, está CERTO.", 1, "Errado, pois nem todos pode ser iguais", "Certo, pois é constitucional", "Errado, a Lei proibe para os brasileiros naturalizados", "Certo, desde que eles sejam brasileiros nato", "Certo, porém a Lei proibe para terroristas"));
		questoes.add(new Questao("Qual a cor da SpaceX?", 4, "Azul", "Preto", "Amarelo", "Vermelho", "Branco"));
		questoes.add(new Questao("Quem descobriu o Brasil?", 2, "Paulo da Fonseca", "João Amoedo", "Pedro Alves Cabral", "Sílvio Santos", "João XI"));
		
		exibirQuestoes(questoes);
		
	

	}

	private static void exibirQuestoes(List<Questao> questoes) {
		int pontuacao = 0;
		int qtdQuestao = Integer.parseInt(JOptionPane.showInputDialog("Quantas questões deseja responder?"));

		// contar quantas questões se deseja fazer
		for (int i = 0; i < qtdQuestao; i++) {

			// dados das questões
			for (int q = 0; q < questoes.size(); q++) {
				String questao = JOptionPane
						.showInputDialog("Escolha a alternativa correta: " + questoes.get(i).getPergunta());

				// verificar qual resposta certa para dada pergunta
				if (questao.equals(questoes.get(i).getAlternativas().get(i))) {
					pontuacao++;
				}

			}
			JOptionPane.showMessageDialog(null, "Você acertou " + pontuacao + " de " + questoes.size() + " questões!");
		}

		JOptionPane.showMessageDialog(null, "Total de pontos foi " + pontuacao + "/" + questoes.size(),
				"Resultado final", JOptionPane.INFORMATION_MESSAGE);

	}

}
