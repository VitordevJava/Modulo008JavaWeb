package exerciciosMod008;

public class WhileDoWhile {
	public static void main(String[] args) {
/* VERIFICA DEPOIS EXECUTA*/
	int numero = 0;

		while (numero <= 10) {
			System.out.println("A contagem ficou assim :" + numero);
			numero++;
		} 
		
/*************************************************************************************/
	
		
		int numero2 = 0;

		do { /*EXECUTA DEPOIS VERIFICA*/
			System.out.println("O NUMERO ATUAL É :" + numero2);
			numero2++;
		} while (numero2 <= 20);
		

	}
}
