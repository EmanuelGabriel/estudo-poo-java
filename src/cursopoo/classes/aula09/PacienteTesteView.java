package cursopoo.classes.aula09;

import javax.swing.JOptionPane;

import cursopoo.classes.aula09.entidade.Paciente;

public class PacienteTesteView {

	public static void main(String[] args) {

		int opcao = Integer.parseInt(JOptionPane
				.showInputDialog("Digite ( 1 ) para calcula o IMC" + "\nDigite ( 2 ) para fechar o programa"));

		// peso e altura
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));

		switch (opcao) {
		case 1:
			Paciente paciente = new Paciente();
			paciente.setPeso(peso);
			paciente.setAltura(altura);
			double resultado = paciente.calcularIndiceMassaCorporal();
			JOptionPane.showMessageDialog(null, "O paciente " + paciente.getNome() + " tem IMC.: " + resultado);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Programa finalizado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente", "Atenção",
					JOptionPane.ERROR_MESSAGE);
			break;
		}

	}

}
