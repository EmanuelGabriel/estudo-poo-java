package cursopoo.classes.aula08.entidade;

public class CarroTeste02 {

	public static void main(String[] args) {

		// criando o proprietário
		Proprietario dono01 = new Proprietario();
		dono01.setNome("Fernando da Silva Amorin");
		dono01.setCpf("989528395823");
		dono01.setIdade(23);
		dono01.setEstado("Piauí");
		dono01.setLogradouro("Rua ao lado");
		dono01.setCidade("Teresina");

		// criando o carro
		Carro c1 = new Carro();
		c1.setModelo("Siena");
		c1.setAnoFabricacao(2009);
		c1.setCor("Azul Marinho");
		c1.setFabricante("Fiat");
		c1.setProprietario(dono01);

		System.out.println("---------------------");

		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Ano: " + c1.getAnoFabricacao());
		System.out.println("Fabricante: " + c1.getFabricante());
		System.out.println("Prop/Carro: " + c1.getProprietario().getNome());

		System.out.println("Proprietário: " + dono01.getNome());
		System.out.println("CPF: " + dono01.getCpf());

	}

}
