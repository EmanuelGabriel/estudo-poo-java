package cursopoo.classes.executavel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursopoo.classes.modelos.Aluno;

/**
 * 
 * @author Emanuel Gabriel
 *
 */
public class SistemaCadastroAluno {
 
	public static void main(String[] args) {

		// realizar o login/acesso
		String login = JOptionPane.showInputDialog("Digite seu login");
		String senha = JOptionPane.showInputDialog("Digite sua senha");

		if (fazerLogin(login, senha)) {

			JOptionPane.showMessageDialog(null, "Acesso liberado ao sistema! Pressione OK!");

			// CADASTRO DE ALUNOS
			int quatidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja cadastrar?"));
			List<Aluno> alunos = new ArrayList<>();

			for (int qtd = 1; qtd <= quatidadeAlunos; qtd++) {

				String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
				String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno");
				String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno");
				String matricula = JOptionPane.showInputDialog("Digite a matrícula do aluno");
				String rg = JOptionPane.showInputDialog("Digite o RG do aluno");
				String idade = JOptionPane.showInputDialog("Digite a idade do aluno");

				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				aluno.setDataNascimento(LocalDate.parse(dataNascimento));
				aluno.setCpf(cpf);
				aluno.setMatricula(Integer.parseInt(matricula));
				aluno.setRg(rg);
				aluno.setIdade(Integer.parseInt(idade));

				informarDisciplinas(aluno);

				alunos.add(aluno);

				exibirInformacoesAluno(aluno);
				imprimirDadosAluno(aluno);
			}

		} else {
			JOptionPane.showMessageDialog(null,
					"Login ou senha inválido(s)! Acesso não autorizado! Pressione OK para finalizar!", "Informação",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0); // fecha o programa
		}

	}

	private static boolean fazerLogin(String login, String senha) {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("senha");
	}

	private static void exibirInformacoesAluno(Aluno aluno) {
		JOptionPane.showMessageDialog(null, aluno, "Dados do aluno" + aluno.getNome(), JOptionPane.INFORMATION_MESSAGE);
	}

	private static void informarDisciplinas(Aluno aluno) {

		int quantidadeDisciplina = Integer.parseInt(JOptionPane
				.showInputDialog("Quantas disciplinas deseja cadastrar para o aluno " + aluno.getNome() + "?"));

		for (int pos = 1; pos <= quantidadeDisciplina; pos++) {

			String nomeDisciplina = JOptionPane.showInputDialog("Digite o NOME da " + pos + "º disciplina:");
			String notaDisciplina = JOptionPane
					.showInputDialog("Digite a NOTA da " + pos + "º disciplina de " + nomeDisciplina.toUpperCase());

		}
	}

	private static void imprimirDadosAluno(Aluno aluno) {
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Média: " + aluno.getMediaNota());
		System.out.println("Situação: " + aluno.getStatusAluno());
		System.out.println("Aluno: " + aluno);
	}

}
