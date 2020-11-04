package cursopoo.classes.aula13;

import java.math.BigDecimal;
import java.time.LocalDate;

import cursopoo.classes.aula13.model.Cliente;
import cursopoo.classes.aula13.model.Venda;

public class VendaMainConsole {

	public static void main(String[] args) {

		Venda venda = new Venda();
		venda.setId(1L);
		venda.setDataVenda(LocalDate.now());
		venda.setFrete(BigDecimal.valueOf(4.50));
		venda.setCliente(new Cliente(1L, "Pedro Alves Cabral", "pedroalves@gmail.com", "86928398392"));

		System.out.println(venda);

	}

}
