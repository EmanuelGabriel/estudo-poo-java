package cursopoo.classes;

import cursopoo.classes.modelos.Aluno;

public class UsoDoHashCode {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Júnior");
		aluno1.setCpf("020123456");
		System.out.println(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Júnior");
		aluno2.setCpf("020123456");
		System.out.println(aluno2);

		System.out.println("\n");
		if (aluno1.equals(aluno2)) {
			System.out.println("Resultado: SÃO IGUAIS");
		} else {
			System.out.println("Resultado: NÃO SÃO IGUAIS");
		}

	}

}
