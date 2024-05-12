package curso_programacao;

import java.util.Scanner;

public class Exercicio26For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		if (x > y) {
			for (int i = y + 1; i < x; i++) {
				if (i % 2 != 0) {
					soma = soma + i;
				}
			}
		}
		if (x < y) {
			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0) {

					soma = soma + i;
				}
			}
		}
		System.out.println(soma);

		sc.close();

	}

}
