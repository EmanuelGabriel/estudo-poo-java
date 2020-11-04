package cursopoo.classes.aula06;

import cursopoo.classes.aula06.model.CorreioEletronico;

public class TesteEnvioEmailEletronico {

	public static void main(String[] args) {

		// criar uma instancia da classe CorreioEletronico
		CorreioEletronico ce = new CorreioEletronico();
		ce.enviarEmail("soenviaumemail@email.com.br");
		ce.enviarEmail("pedrinho@gmail.com", "joazinho@hotmail.com.br", "carlos@gmail.com.br", "afonso@yahoo.com");
	}

}
