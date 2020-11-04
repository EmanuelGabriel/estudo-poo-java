package cursopoo.classes.aula05;

/**
 * 
 * @author Emanuel A. Gabriel
 *
 */
public class TesteVetorArray {

	/**
	 * Verificação de vetores ou arrays para separar String's de tipos de dados
	 * Inteiros e Doubles
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] valores = { "Piauí", "Teresina", "1.3", "12", "345", "Substantivo", "10.2"};

		for (int i = 0; i < valores.length; i++) {

			if (valores[i].matches("^[0-9]*$")) { // se somente possui números
				int n = Integer.parseInt(valores[i]);
				System.out.println("Esse vetor é um número inteiro: " + n);

			} else if (valores[i].matches("^[0-9]*[.]{0,1}[0-9]*$")) {
				double d = Double.parseDouble(valores[i]);
				System.out.println("Esse vetor é um double: " + d);

			} else if (valores[i].matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$")) {
				System.out.println("Esse vetor é uma String: " + valores[i]);
			}
		}

	}

}
