package exerciciosMod008;

public class LogicasAninhadas {
	public static void main(String[] args) {

		int nota1 = 50;
		int nota2 = 50;
		int nota3 = 50;
		int nota4 = 60;
		int Media = 0;

		Media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operações logicas aninhadas : são operações dentro de operações */

		 if (Media >= 50) {
			if (Media >= 70) {
				System.out.println("Parabéns vc foi aprovado direto " + Media);
			} else {
				System.out.println("vc esta de recuperação");
			}

		} else {
			System.out.println("Vc esta reprovado direto");
		}
	}
}
