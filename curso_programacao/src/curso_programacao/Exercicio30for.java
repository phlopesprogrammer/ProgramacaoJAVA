package curso_programacao;

import java.util.Scanner;

public class Exercicio30for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("Impossível Calcular");
			} else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}

		}

		sc.close();
	}

}
