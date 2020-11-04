package cursopoo.classes.executavel;

import java.time.LocalDate;

import cursopoo.classes.modelos.Aluno;
import cursopoo.classes.modelos.Disciplina;

public class AlunoTeste {

	public static void main(String[] args) {

		double[] notaMatematica = { 7.7, 8.0, 10, 8.5 };

		Disciplina matematica = new Disciplina();
		matematica.setNome("Matemática");
		matematica.setNotas(notaMatematica);

		Aluno aluno = new Aluno();
		aluno.setNome("Pedro Alves Cabral");
		aluno.setRg("8237582");
		aluno.setCpf("0902384287384273");
		aluno.setIdade(22);
		aluno.setMatricula(23787823);
		aluno.setDataNascimento(LocalDate.of(2001, 02, 12));
		// aluno.setDisciplinas(Arrays.asList(matematica));
		aluno.getDisciplinas().add(matematica);

		// varrendo disciplinas e as notas
		for (Disciplina d : aluno.getDisciplinas()) {

			System.out.println("Disciplina: " + d.getNome());
			System.out.println("Notas da disciplina ");

			for (double n : d.getNotas()) {
				System.out.println("Nota: " + n);
			}

//			for (int pos = 0; pos < d.getNotas().length; pos++) {
//				System.out.println("Nota " + pos + " é " + d.getNotas()[pos]);
//			}
		}

		System.out.println("Aluno: " + aluno);
		System.out.println("Média: " + aluno.getMediaNota());
		System.out.println("Situação: " + (aluno.getAlunoAprovado() ? "APROVADO" : "REPROVADO"));

	}

}
