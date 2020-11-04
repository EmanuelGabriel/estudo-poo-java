package cursopoo.classes.aula07.executavel;

import javax.swing.JOptionPane;

public class QuestaoViewTeste {

	public static void main(String[] args) {

		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para fazer Questões:\nDigite 2 para Sair"));

		switch (opcao) {
		case 1:
			String escolha = JOptionPane.showInputDialog(
					"A investidura em cargo público ocorrerá com a:\n1) Habilitação em concurso público de provas ou de provas e títulos.\n2) Posse.\n3)Homologação do resultado do concurso público pel autoridade competente;\n4) Nomeação;\n5) Declaração de vontade do servidor;");
			if (Double.parseDouble(escolha) == 4) {
				JOptionPane.showMessageDialog(null, "Resposta Certa, parabéns!");
			} else {
				JOptionPane.showMessageDialog(null, "Resposta Incorreta :(");
			}
			break;
		case 2:
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Nenhuma opção foi escolhida", "Atenção", JOptionPane.ERROR_MESSAGE);
			break;
		}

	}

}
