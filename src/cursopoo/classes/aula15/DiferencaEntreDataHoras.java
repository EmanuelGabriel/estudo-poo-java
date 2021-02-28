package cursopoo.classes.aula15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiferencaEntreDataHoras {

	public static void main(String[] args) {

		// Definir a data atual e uma data de cadastro
		LocalDate hoje = LocalDate.now();
		LocalDate dataCadastro = LocalDate.of(2020, 12, 16); // Ano-Mês-Dia/2021-01-01 ----> 1 de Janeiro/02 de 2021

		System.out.printf("Data atual: %s", hoje);

		System.out.println();

		long quantidadeDias = dataCadastro.until(hoje, ChronoUnit.DAYS);
		System.out.printf("Da data de cancelamento do curso ocorrido em %s a data atual %s, já se passaram %d dias.", dataCadastro, hoje, quantidadeDias);

	}

}
