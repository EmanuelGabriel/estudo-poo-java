package cursopoo.classes.aula07.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursopoo.classes.aula07.model.Questao;

public class QuestaoViewTeste02 {

	/**
	 * Criando um programa de perguntas e respostas Ideia para o desenvolvimento do
	 * sistema SGQuestões para concursos públicos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Questao q1 = new Questao(
				"O Estatuto da Polícia Militar do Piauí (LEI 3.808/81) aborda vários aspectos EXCETO.\n"
						+ "A) Prerrogativas, Situações;\nB) Deveres, Direitos;\nC) Obrigações, Prerrogativas;\nD) Situações, Inclusão;\nE) Deveres, Obrigações;",
				"D");
		Questao q2 = new Questao("Quanto aos direitos e garantias fundamentais, é correto afirmar que:\n"
				+ "A) ninguém será submetido à tortura, salvo por força da decisão hierárquica superior;\nB) é livre a expressão da atividade intelectual, independentemente de censura ou licença;\nC) é plena a liberdade de associação, inclusive a de caráter paramilitar;\nD) a lei penal não retroagirá, salvo para condenar o réu;\nE) é possível haver crime sem lei anterior que o defina;",
				"B");
		Questao q3 = new Questao(
				"Com base no Código Penal Brasileiro, são qualificadoras do crime de homicídio:\nA) mediante paga ou promessa de recompensa, ou por outro motivo torpe;\nB) por motivo fútil;\nC) contra a mulher, por razões da condição de sexo feminino;\nD) para assegurar a execução, a ocultação, a impunidade ou vantagem de outro crime;\nE) todas estão corretas;",
				"E");

		List<Questao> listaQuestoes = new ArrayList<>();
		listaQuestoes.add(q1);
		listaQuestoes.add(q2);
		listaQuestoes.add(q3);

		exibirQuestoes(listaQuestoes);

	}

	public static void testeQuestoes(Questao[] questoes) {
		int ponto = 0;
		for (int i = 0; i < questoes.length; i++) {
			String q = questoes[i].getPergunta();
			JOptionPane.showMessageDialog(null, q);
			String resposta = JOptionPane.showInputDialog("Escolha a alternativa correta");
			if (resposta.equalsIgnoreCase(questoes[i].getResposta())) {
				ponto++;
			}
		}

		JOptionPane.showMessageDialog(null, "Você acertou " + ponto + "/" + questoes.length);
	}

	public static void exibirQuestoes(List<Questao> questoes) {

		int pontuacao = 0;
		int quantidadeQuestao = Integer.parseInt(JOptionPane.showInputDialog("Quantas questões deseja responder?"));

		for (int pos = 0; pos < quantidadeQuestao; pos++) {

			for (int i = 0; i < questoes.size(); i++) {
				String questao = JOptionPane
						.showInputDialog("Escolha a alternativa correta: " + questoes.get(i).getPergunta());
				if (questao.equalsIgnoreCase(questoes.get(i).getResposta())) {
					pontuacao++;
				}
			}

			JOptionPane.showMessageDialog(null, "Você acertou " + pontuacao + " de " + questoes.size() + " questões!");

		}

		JOptionPane.showMessageDialog(null, "Total de pontos foi " + pontuacao + "/" + questoes.size(),
				"Resultado final", JOptionPane.INFORMATION_MESSAGE);
	}

}
