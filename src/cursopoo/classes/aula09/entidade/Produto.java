package cursopoo.classes.aula09.entidade;

public class Produto {

	public String descricao;
	public int quantidade;

	public void descrever() {
		System.out.println("Descrição do produto: " + descricao + " - " + quantidade + " itens");
	}

}
