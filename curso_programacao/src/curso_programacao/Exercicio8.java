package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double value = sc.nextDouble();

		if (value >= 0 && value <= 25.0) {
			System.out.println("Dentro do Intervalo [0,25]");
		} else if (value > 25 && value <= 50) {
			System.out.println("Dentro do Intervalo [25,50]");
		} else if (value > 50 && value <= 75) {
			System.out.println("Dentro do Intervalo [50,75]");
		} else if (value > 75 && value <= 100) {
			System.out.println("Dentro do Intervalo[75,100]");
		} else {
			System.out.println("Fora do Intervalo");
		}

		sc.close();
	}

}
