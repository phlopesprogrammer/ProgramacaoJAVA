package curso_programacao;

import java.util.Scanner;

public class Exercicio32for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {

				System.out.println(i);
			}

		}

		sc.close();

	}

}
