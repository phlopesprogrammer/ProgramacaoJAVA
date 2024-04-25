package curso_programacao;

import java.util.Scanner;

public class Exercicio16while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = 4;
		int y = 0;
		int i = 0;

		while (i < x) {
			i = i + 1;
			y = y + i;
			System.out.println(i);
			System.out.println(y);
		}

		sc.close();
	}

}
