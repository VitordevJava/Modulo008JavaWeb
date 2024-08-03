package exerciciosMod008;

public class OperadoresLogicos {
	public static void main(String[] args) {

		int N1 = 80;
		int N2 = 10;

		double N3 = ( N1 + N2)/ 2;
		String name = ("Vitor");

		if (N3 >= 70 && name.equals("Vitor")) {
			System.out.println("Parabéns você foi aprovado!!");
		} else if (N3 < 70) {
			System.out.println("Uma pena, você foi reprovado");

		} else {
			System.out.println("Uma pena, não encontramos o aluno, tente verificar se está com o Nome correto");
		}

	}
}
