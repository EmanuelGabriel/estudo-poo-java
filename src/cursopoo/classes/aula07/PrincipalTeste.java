package cursopoo.classes.aula07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalTeste {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("Pedro Alves Cabral"); // 0
		nomes.add("Eduardo Castro Oliveira"); // 1
		nomes.add("Fernando da Silva Borges"); // 2
		nomes.add("Ryan Jason");
		nomes.add("Allan Sandro Barbosa");
		nomes.add("Edna Melo Santos"); 

		System.out.println(nomes.get(1)); 

		Collections.sort(nomes);
		System.out.println(nomes);

		nomes.forEach(n -> {
			if (n.startsWith("Ed")) {
				System.out.println(n);
			}
		});
		
		
		
		nomes.forEach(n -> n.endsWith("sa"));

	}

}
