package cursopoo.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursopoo.classes.modelos.Aluno;

/**
 * 
 * @author samuel
 * @since 1.0
 *
 */
public class PrimeiraClasse {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno");
		String matricula = JOptionPane.showInputDialog("Digite a matrícula do aluno");
		String rg = JOptionPane.showInputDialog("Digite o RG do aluno");
		String idade = JOptionPane.showInputDialog("Digite a idade do aluno");

		Aluno aluno = new Aluno(nome);
		aluno.setDataNascimento(LocalDate.parse(dataNascimento));
		aluno.setCpf(cpf);
		aluno.setMatricula(Integer.parseInt(matricula));
		aluno.setRg(rg);
		aluno.setIdade(Integer.parseInt(idade));

		Aluno sandro = new Aluno("Sandro Moura Santos");
		sandro.setDataNascimento(LocalDate.of(1885, 12, 22));
		sandro.setCpf("025.568.789-52");
		sandro.setMatricula(98798798);
		sandro.setRg("123.7897.789");
		sandro.setIdade(56);

		List<Aluno> alunos = new ArrayList<>();
		alunos.add(aluno);
		alunos.add(sandro);

		System.out.println("\n");

		for (int pos = 0; pos < alunos.size(); pos++) {
			System.out.println("Na posição: " + pos + " está " + alunos.get(pos).getNome());
		}

		System.out.println("\n\n");

		for (Aluno al : alunos) {
			System.out.println(al.getNome());
			System.out.println("CPF.: ".concat(al.getCpf()));
			System.out.println("Idade.: " + al.getIdade());
			System.out.println("Data de Cadastro.: " + al.getDataCadastro());
			System.out.println("Matrícula.: " + al.getMatricula());
			System.out.println("Data de Nascimento.: " + al.getDataNascimento());
			System.out.println("\n==============");
		}

		System.out.println("\n");

		System.out.println("\n\n");
		if (aluno.getAlunoAprovado() == true) {
			System.out.println(String.format("APROVADO: %s -- Média/Nota: %s", aluno.getNome(), aluno.getMediaNota()));
		} else {
			System.out
					.println(String.format("REPROVADO: %s -- Média/Nota: %s ", aluno.getNome(), aluno.getMediaNota()));
		}

		System.out.println("\n===========");
		System.out.println("Aluno: ".concat(aluno.getNome()));
		System.out.println("Situação: " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Média: " + aluno.getMediaNota());

	}

}
