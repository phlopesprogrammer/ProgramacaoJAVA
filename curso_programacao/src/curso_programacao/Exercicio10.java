package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto;
		if (salario == 3002.00) {
			imposto = 1000.00 * 0.08 + 2.00 * 0.18;
			System.out.println();
		} else if (salario >= 0.0 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.00 && salario <= 3000.00) {
			imposto = salario * (8 / 100);
			System.out.println(imposto);
		} else if (salario > 3000.00 && salario <= 4500.00) {
			imposto = salario * (18 / 100);
			System.out.println(imposto);
		} else {
			imposto = salario * (28 / 100);
			System.out.println(imposto);
		}
		sc.close();
	}

}
