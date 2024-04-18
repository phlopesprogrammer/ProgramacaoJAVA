package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int qtd = sc.nextInt();

		double valor;

		if (cod == 1) {
			valor = qtd * 4.0;
		} else if (cod == 2) {
			valor = qtd * 4.5;

		} else if (cod == 3) {
			valor = qtd * 5.0;

		} else if (cod == 4) {
			valor = qtd * 2.0;
			

		} else {
			valor = 1.50 * qtd;
		}

		System.out.printf("Total: R$ %.2f%n", valor);
		sc.close();

		
	}

}
