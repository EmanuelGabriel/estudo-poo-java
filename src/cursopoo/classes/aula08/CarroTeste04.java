package cursopoo.classes.aula08;

import cursopoo.classes.aula08.entidade.Carro;

public class CarroTeste04 {
	
	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.setModelo("New Civic");
		
		Carro seuCaroo = new Carro();
		seuCaroo.setModelo("Corolla");
		
		// são objetos diferentes porém chamando o mesmo método
		meuCarro.ligarCarro();
		seuCaroo.ligarCarro();
		
		
	}

}
