package cursopoo.classes.aula09;

import cursopoo.classes.aula09.entidade.Paciente;

public class PacienteTeste {

	public static void main(String[] args) {

		Paciente pac1 = new Paciente();
		pac1.setNome("Fernando Moura");
		pac1.setPeso(82.0);
		pac1.setAltura(1.70);
		double resultado = pac1.calcularIndiceMassaCorporal();
		System.out.println("IMC do paciente " + pac1.getNome() + " tem resultado: " + resultado);

	}

}
