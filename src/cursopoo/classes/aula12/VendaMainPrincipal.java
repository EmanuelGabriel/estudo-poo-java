package cursopoo.classes.aula12;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import cursopoo.classes.aula12.entidade.Cliente;
import cursopoo.classes.aula12.entidade.Produto;
import cursopoo.classes.aula12.entidade.Venda;

public class VendaMainPrincipal {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setCodigo(1L);
		produto1.setDescricao("Descrição do Sabão Neutro");
		produto1.setNome("Sabão Neutro Flix");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setCodigo(2L);
		produto2.setDescricao("Descrição do Monitor LG");
		produto2.setNome("Monitor LG Power Ultra");
		produto2.setValor(BigDecimal.valueOf(300));

		Produto produto3 = new Produto();
		produto3.setCodigo(3L);
		produto3.setNome("Curso Spring Boot");
		produto3.setDescricao("Descrição do Curso de Spring Boot");
		produto3.setValor(BigDecimal.valueOf(100));

		Produto produto4 = new Produto();
		produto4.setCodigo(4L);
		produto4.setNome("Notebook DELL Ispiron V787");
		produto4.setDescricao("Descrição do Notebook DELL Ispiron V787");
		produto4.setValor(BigDecimal.valueOf(2000));

		// Criando uma Venda
		Venda venda = new Venda();
		venda.setCodigo(1L);
		venda.setDataVenda(LocalDateTime.now());
		venda.setDescricao("Venda Curso de Lógica de Programção");
		venda.setEnderecoEntrega("Entrega pelo e-mail");
		venda.setCliente(new Cliente(1L, "Pedro Alves Cabral", "992839792"));
		venda.setDescontoVenda(BigDecimal.valueOf(15.90));

		venda.getProdutos().add(produto1);
		venda.getProdutos().add(produto2);
		venda.getProdutos().add(produto3);
		venda.getProdutos().add(produto4);

		// venda.adicionarProduto(produto1); // posso fazer validações antes de
		// adicionar na lista
		// venda.adicionarProduto(produto3);

		System.out.println("\n======PRODUTOS DA VENDA======\n");

		for (Produto produto : venda.getProdutos()) {
			System.out.println(produto);
		}

		System.out.println("\n=======VENDAS=======\n");

		System.out.println("Descrição da venda: " + venda);
		System.out.println("Data da venda: " + venda.getDataVenda());

		System.out.println("\n====== VALOR DO DESCONTO=======\n");
		System.out.println("Valor do Desconto R$ " + venda.getDescontoVenda());
		System.out.println("Desconto " + venda.aplicarDesconto(BigDecimal.valueOf(15.90)));

		System.out.println("Valor Total da Venda R$ " + venda.getValorTotal());

	}

}
