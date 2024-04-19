package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double imposto;

		double salario = sc.nextDouble();

		if (salario > 4500.00) {
			imposto = (1000 * 0.08) + (1500 * 0.18) + (salario - 4500) * 0.28;
			System.out.printf(" Imposto : %.2f%n ", imposto);
		} else if (salario > 3000) {
			imposto = (1000 * 0.08) + (salario - 3000.00) * 0.18 ;
			System.out.printf(" Imposto : %.2f%n ", imposto);
		} else if (salario > 2000) {
			imposto = 1000 * 0.08;
			System.out.printf(" Imposto : %.2f%n ", imposto);
		} else {
			System.out.println("Isento");
		}
		

		sc.close();
	}

}
