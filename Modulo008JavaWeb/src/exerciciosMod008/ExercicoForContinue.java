package exerciciosMod008;

public class ExercicoForContinue {
	public static void main(String[] args) {

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Seus numeros são : " + numero);
				continue;
			}

		}
		
		System.out.println("Processando laços de repetição");

	}
}