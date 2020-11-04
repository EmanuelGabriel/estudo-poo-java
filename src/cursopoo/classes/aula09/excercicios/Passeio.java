package cursopoo.classes.aula09.excercicios;

public class Passeio {

	public static void main(String[] args) {

		Cachorro viralata = new Cachorro();
		viralata.setNome("Viralata");
		viralata.setRaca("Raça Pobre");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pedro Alves Cabral");
		// pessoa.setCachorro(new Cachorro("Viralata Ruim", "Raça Ruim"));
		pessoa.setCachorro(viralata);

		Caminhada caminhada = new Caminhada();
		caminhada.andar(pessoa);

	}

}
