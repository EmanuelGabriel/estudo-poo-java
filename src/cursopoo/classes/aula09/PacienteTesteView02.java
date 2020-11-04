package cursopoo.classes.aula09;

import javax.swing.JOptionPane;

import cursopoo.classes.aula09.entidade.Paciente;

public class PacienteTesteView02 {

	/**
	 * Faça uma sistema para cadastrar Paciente e calcular seu IMC (ÍNDICE DE MASSA
	 * CORPORAL)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// CADASTRO DE PACIENTES
		int quatidadePaciente = Integer.parseInt(JOptionPane.showInputDialog("Quantos pacientes deseja cadastrar?"));

		for (int i = 0; i < quatidadePaciente; i++) {

			String nome = JOptionPane.showInputDialog("Digite o nome do paciente");
			double peso = Double
					.parseDouble(JOptionPane.showInputDialog("Digite o peso do paciente " + nome.toUpperCase()));
			double altura = Double
					.parseDouble(JOptionPane.showInputDialog("Digite a altura do paciente " + nome.toUpperCase()));

			// criar o objeto do tipo Paciente
			Paciente paciente = new Paciente();
			paciente.setNome(nome);
			paciente.setPeso(peso);
			paciente.setAltura(altura);

			exibirResultadoPaciente(paciente);
			exibirConsolePaciente(paciente);

		}

	}

	private static void exibirResultadoPaciente(Paciente paciente) {
		JOptionPane.showMessageDialog(null, "Nome: " + paciente.getNome() + "\n" + "Peso: " + paciente.getPeso() + "\n"
				+ "Altura: " + paciente.getAltura() + "\n" + "IMC: " + paciente.calcularIndiceMassaCorporal());
	}

	private static void exibirConsolePaciente(Paciente paciente) {
		System.out.println("Nome: " + paciente.getNome());
		System.out.println("Peso: " + paciente.getPeso());
		System.out.println("Altura: " + paciente.getAltura());
		System.out.println("IMC: " + paciente.calcularIndiceMassaCorporal());
	}

}
