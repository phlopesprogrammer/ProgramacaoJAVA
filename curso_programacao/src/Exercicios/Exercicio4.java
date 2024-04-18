package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int hora;
		 * 
		 * hora = sc.nextInt();
		 * 
		 * if (hora < 12) {
		 * 
		 * System.out.println("Bom dia");
		 * 
		 * } else if (hora < 18) { System.out.println("Boa tarde"); } else {
		 * System.out.println("Boa noite"); }
		 */

		// Locale.setDefault(Locale.US);
		// Scanner sc = new Scanner(System.in);

		/*
		 * double x, x2; double a = sc.nextDouble(); double b = sc.nextDouble(); double
		 * c = sc.nextDouble();
		 * 
		 * double delta = b * b - 4.0 * a * c;
		 * 
		 * if(a == 0 || delta < 0.0) { System.out.println("Impossível calcular"); }else
		 * { x = (-b + Math.sqrt(delta)) / (2.0 * a ) ; x2 = (-b - Math.sqrt(delta)) /
		 * (2.0 * a ) ; System.out.printf("X1 = %.5f%n",x);
		 * System.out.printf("X2 = %.5f%n",x2);
		 * 
		 * 
		 * }
		 */
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		if (n1 < n2 && n1 < n3) {
			System.out.println("MENOR = " + n1);
		} else {
			if (n2 < n3) {
				System.out.println("MENOR N2 = " + n2);
			} else {
				System.out.println("MENOR N3 = " + n3);
			}

			sc.close();
		}

	}
}
