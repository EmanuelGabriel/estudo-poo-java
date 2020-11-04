package cursopoo.classes.aula06.model;

public class CorreioEletronico {

	/**
	 * método responsável em enviar vários e-mails
	 * 
	 * @param varargs emails
	 */
	public void enviarEmail(String... emails) {
		for (String email : emails) {
			System.out.println("E-mail enviado para ".concat(email));
		}
	}

	public void enviarEmail(String email) {
		System.out.println("E-mail enviado para ".concat(email));
	}

}
