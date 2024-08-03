package exerciciosMod008;

public class OperadoresLogicos {
	public static void main(String[] args) {

		int N1 = 80;
		int N2 = 90;

		double N3 = ( N1 + N2)/ 2;
		String name = ("Vitor");
    
		/* OPERAÇÕES LOGICAS COM IF e ELSE*/
		if (N3 >= 70 && name.equals("Vitor")) {
			System.out.println("Parabéns você foi aprovado!!");
		} else if (N3 < 70) {
			System.out.println("Uma pena, você foi reprovado");

		} else {
			System.out.println("Uma pena, não encontramos o aluno, tente verificar se está com o Nome correto");
		}
		
		/*OPERADORES TERNARIOS São para micro validações*/
		
		String SaidaResultado;
		SaidaResultado = N3 >= 70 ? "Aluno aprovado" : "Aluno reprovado";
		
		System.out.println(SaidaResultado);

	}
}
