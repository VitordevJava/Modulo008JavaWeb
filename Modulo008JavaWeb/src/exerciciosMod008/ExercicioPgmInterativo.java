package exerciciosMod008;

import javax.swing.JOptionPane;

public class ExercicioPgmInterativo {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Qual a quantidade de carros ?");
		String pessoas = JOptionPane.showInputDialog("Para quantas pessoas esses carros serão divididos? ");

		double numeroCarros = Double.parseDouble(carros);
		double numeroPessoas = Double.parseDouble(pessoas);

		int divisao = (int) (numeroCarros / numeroPessoas);
		double resto = numeroCarros % numeroPessoas;

		int resposta = JOptionPane.showConfirmDialog(null, "Você deseja ver o resultado da divisão? ");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "A divisão ficou " + divisao + " carros para cada uma das pessoas! ");

			JOptionPane.showConfirmDialog(null, "E você deseja ver quantos carros restaram? ");
			if (resposta == 0) {
				JOptionPane.showMessageDialog(null, "E sobraram no nosso estoque apenas : " + resto);

			}
		}

	}

}
