package cursopoo.classes.aula04.teste;

import javax.swing.JOptionPane;

public class EstudandoMetodoMain {

	public static void main(String[] args) {

		int quantidadesNome = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de nomes a serem cadastrados"));

		args = new String[quantidadesNome];

		for (int i = 0; i < quantidadesNome; i++) {
			String nome = JOptionPane.showInputDialog(null, "Digite o nome da " + i + " º posição");
			JOptionPane.showMessageDialog(null, "O " + nome.toUpperCase() + " está na posição " + i);
		}

	}

}
