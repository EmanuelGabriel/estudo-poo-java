package cursopoo.classes.aula08;

import cursopoo.classes.aula08.entidade.Carro;
import cursopoo.classes.aula08.entidade.Proprietario;

public class CarroTeste03 {

	public static void main(String[] args) {

		Proprietario dono01 = new Proprietario();
		dono01.setNome("João da Silva");
		dono01.setCpf("092.283.823-23");

		Carro c1 = new Carro();
		c1.setModelo("Corolla");
		c1.setProprietario(dono01);
		c1.getProprietario().setNome("Sebastião da Fonseca");

		Carro c2 = new Carro();
		c2.setModelo("Civic");
		c2.setProprietario(dono01);

		System.out.println("Carro - dono: " + c1.getProprietario().getNome());
		System.out.println("Dono 01 " + dono01.getNome());

	}

}
