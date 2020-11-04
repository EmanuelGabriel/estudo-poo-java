package cursopoo.classes.aula04.teste;

import javax.swing.JOptionPane;

/**
 * @author Emanuel A. Gabriel
 * 
 */
public class MainArrayTest {

	/**
	 * CRIANDO UMA CALCULADORA
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite 1 para Soma:\nDigite 2 para Subtração:\nDigite 3 para Multiplicação:\nDigite 4 para Divisão"));

		double digito01 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
		double digito02 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

		switch (opcao) {
		case 1:
			double soma = digito01 + digito02;
			JOptionPane.showMessageDialog(null, "A soma dos números (" + digito01 + " + " + digito02 + ") = " + soma);
			break;

		case 2:
			double subtrair = digito01 - digito02;
			JOptionPane.showMessageDialog(null,
					"A subtração dos números (" + digito01 + " - " + digito02 + ") = " + subtrair);
			break;

		case 3:
			double multiplicar = digito01 * digito02;
			JOptionPane.showMessageDialog(null,
					"A multiplicação dos números (" + digito01 + " * " + digito02 + ") = " + multiplicar);
			break;

		case 4:
			double dividir = digito01 / digito02;
			JOptionPane.showMessageDialog(null,
					"A divisão dos números (" + digito01 + " / " + digito02 + ") = " + dividir);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Nenhuma opção foi escolhida", "Atenção", JOptionPane.ERROR_MESSAGE);
			break;
		}

	}

}
