package curso_programacao;

import java.util.Scanner;

public class Exercicio22While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int fuel = sc.nextInt();

		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;

		while (fuel > 0 && fuel != 4) {
			if (fuel == 1) {
				cont1 = cont1 + 1;

			}
			if (fuel == 2) {
				cont2 = cont2 + 1;

			}
			if (fuel == 3) {
				cont3 = cont3 + 1;

			}
			if (fuel != 1 || fuel != 2 || fuel != 3 || fuel != 4) {
				fuel = sc.nextInt();
			}

		}

		if (fuel == 4) {

			System.out.println("Muito Obrigado");
			System.out.println("Álcool : " + cont1);
			System.out.println("Gasolina : " + cont2);
			System.out.println("Diesel : " + cont3);
			sc.close();
		}
	}

}
