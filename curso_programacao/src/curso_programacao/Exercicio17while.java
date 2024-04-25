package curso_programacao;

import java.util.Scanner;

public class Exercicio17while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = 2;
		int y = 10;

		System.out.println("Olá");

		while (x < y) {
			System.out.println(x + "-" + y);
			x = x * 2;
			y = y + 1;
		}

		sc.close();

	}

}
