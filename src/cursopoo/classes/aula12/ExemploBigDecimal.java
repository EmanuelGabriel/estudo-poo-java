package cursopoo.classes.aula12;

import java.math.BigDecimal;

public class ExemploBigDecimal {

	public static void main(String[] args) {

		System.out.println("Subtrai");
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));

		System.out.println("");
		System.out.println("Soma");
		BigDecimal valor1 = new BigDecimal("2.00");
		BigDecimal valor2 = new BigDecimal("1.2");
		BigDecimal resultado = valor1.add(valor2);
		System.out.println(resultado);

		System.out.println("");
		System.out.println("Compara");
		System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("1.3")));

		System.out.println("");
		System.out.println("Divide");
		System.out.println(new BigDecimal("2.00").divide(new BigDecimal("2.00")));

		System.out.println("");
		System.out.println("Máximo");
		System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

		System.out.println("");
		System.out.println("Mínimo");
		System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

		System.out.println("");
		System.out.println("Potência");
		System.out.println(new BigDecimal("2.00").pow(2));

		System.out.println("");
		System.out.println("Multiplica");
		System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.8")));

		System.out.println("\nTeste - Subtrair");
		System.out.println(new BigDecimal("10.0").subtract(new BigDecimal("5.0")));

	}

}
