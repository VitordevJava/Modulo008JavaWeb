package exerciciosMod008;

import javax.swing.JOptionPane;

public class ExerEntradaDeDados {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Qual a quantidade de carros ?");
		String pessoas = JOptionPane.showInputDialog("Para quantas pessoas esses carros serão divididos? ");

		double numeroCarros = Double.parseDouble(carros);
		double numeroPessoas = Double.parseDouble(pessoas);

		int divisao = (int) (numeroCarros / numeroPessoas);
		double resto = numeroCarros % numeroPessoas;

		JOptionPane.showMessageDialog(null, "A divisão ficou " + divisao + " carros, e sobraram : " + resto);
	}

}
