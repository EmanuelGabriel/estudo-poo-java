package cursopoo.classes.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursopoo.classes.modelos.Endereco;
import cursopoo.classes.modelos.Pessoa;

public class SistemaCadastroPessoa {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Digite o login");
		String senha = JOptionPane.showInputDialog("Digite a senha");

		if (fazerLogin(login, senha)) {

			JOptionPane.showMessageDialog(null, "Acesso liberado ao sistema! Pressione OK!", "Informação",
					JOptionPane.INFORMATION_MESSAGE);

			// CADASTRO DE ALUNOS
			int quatidadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas deseja cadastrar?"));
			List<Pessoa> pessoas = new ArrayList<>();

			for (int pos = 1; pos <= quatidadePessoa; pos++) {
				// input de entrada de dados de Pessoa
				String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
				String idade = JOptionPane.showInputDialog("Digite a idade da pessoa");
				String sexo = JOptionPane.showInputDialog("Digite o sexo da pessoa");

				// criar o objeto do tipo Pessoa
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(nome);
				pessoa.setIdade(Integer.parseInt(idade));
				pessoa.setSexo(sexo);

				informarEndereco(pessoa);

				pessoas.add(pessoa);

				exibirInformacaoPessoa(pessoa);
				imprimirDadosPessoa(pessoa);
			}

		} else {
			JOptionPane.showMessageDialog(null,
					"Login ou senha inválido(s)! Acesso não autorizado! Pressione OK para finalizar!", "Atenção",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0); // fecha o programa
		}

	}

	private static void informarEndereco(Pessoa pessoa) {

		int quantidadeEndereco = Integer
				.parseInt(JOptionPane.showInputDialog("Digite quantos enderecos tem " + pessoa.getNome() + "?"));

		Endereco[] enderecos = new Endereco[quantidadeEndereco];

		for (int pos = 0; pos < quantidadeEndereco; pos++) {

			String complemento = JOptionPane.showInputDialog("Digite o complemento do endereço de nº " + pos);
			String logradouro = JOptionPane.showInputDialog("Digite o logradouro do endereço de nº " + pos);
			String cep = JOptionPane.showInputDialog("Digite o CEP do endereço de nº " + pos);
			String numero = JOptionPane.showInputDialog("Digite o número do endereço de nº " + pos);

			enderecos[pos] = new Endereco();
			enderecos[pos].setComplemento(complemento);
			enderecos[pos].setLogradouro(logradouro);
			enderecos[pos].setCep(cep);
			enderecos[pos].setNumero(Integer.parseInt(numero));

			pessoa.setEnderecos(enderecos);

		}

	}

	private static boolean fazerLogin(String login, String senha) {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("senha");
	}

	private static void exibirInformacaoPessoa(Pessoa pessoa) {
		JOptionPane.showMessageDialog(null, pessoa, "Informação", JOptionPane.INFORMATION_MESSAGE);
	}

	private static void imprimirDadosPessoa(Pessoa pessoa) {
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println(pessoa);
	}

}
