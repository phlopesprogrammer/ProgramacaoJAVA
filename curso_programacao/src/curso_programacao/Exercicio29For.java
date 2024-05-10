package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio29For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();

			double media = (A * 2.0 + B * 3.0 + C * 5.0) / 10;

			System.out.printf("%.1f%n", media);

		}

		sc.close();

	}

}
