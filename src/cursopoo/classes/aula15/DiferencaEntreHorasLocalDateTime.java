package cursopoo.classes.aula15;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DiferencaEntreHorasLocalDateTime {

	public static void main(String[] args) {

		//LocalDateTime inicio = LocalDateTime.of(entrada.getYear(), entrada.getMonth(), entrada.getDayOfMonth(),
				//entrada.getHour(), entrada.getMinute(), entrada.getSecond());

		//LocalDateTime fim = LocalDateTime.of(saida.getYear(), saida.getMonth(), saida.getDayOfMonth(), saida.getHour(),
				//saida.getMinute(), saida.getSecond());

		//Duration duracao = Duration.between(inicio, fim);

		LocalDateTime i = LocalDateTime.of(2021, 2, 25, 1, 10, 10);
		LocalDateTime f = LocalDateTime.of(2021, 2, 25, 1, 20, 10);
		Duration d = Duration.between(i, f);
		System.out.println(d);
		
		
		
		// Definir a data atual e a de cadastro
		LocalDateTime hoje = LocalDateTime.now(); // data e hora atual
		LocalDateTime dataCadastro = LocalDateTime.of(2021, 2, 24, 12, 0, 0); // ano, mês, dia, hora, minuto, segundos
		
		long diferencaHoras = dataCadastro.until(hoje, ChronoUnit.HOURS);
		System.out.printf("Cálculo das horas da data atual com a data de cadastro: %dh", diferencaHoras);
		
		// resultado deve dar a diferença de 25h

	}

}
