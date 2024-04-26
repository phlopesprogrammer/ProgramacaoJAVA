package curso_programacao;

import java.util.Scanner;

public class Exercicio18While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != y) {
			if (x < y) {
				System.out.println(x + "-" + y + " Crescente");
			} else {
				System.out.println(x + "-" + y + " Decrescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();

			sc.close();

		}

	}
}
