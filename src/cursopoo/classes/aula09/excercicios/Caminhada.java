package cursopoo.classes.aula09.excercicios;

public class Caminhada {

	public void andar(Pessoa pessoa) {
		System.out.println("Eu " + pessoa.getNome() + " estou andando com o " + pessoa.getCachorro().getNome());
	}
}
