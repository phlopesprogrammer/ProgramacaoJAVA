package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15WhileEnquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);

		sc.close();
	}

}
