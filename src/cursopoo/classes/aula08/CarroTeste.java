package cursopoo.classes.aula08;

import cursopoo.classes.aula08.entidade.Carro;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		c1.setModelo("Celta");
		c1.setAnoFabricacao(1999);

		Carro c2 = new Carro();
		c2.setModelo("Celta");
		c2.setAnoFabricacao(2005);

		System.out.println(c1);
		if (c1.getModelo().equals(c2.getModelo())) {
			System.out.println("Iguais");
		} else {
			System.out.println("Não são iguais");
		}

		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Ano: " + c1.getAnoFabricacao());

	}

}
