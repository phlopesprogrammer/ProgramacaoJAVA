package curso_programacao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		

		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 */

		Scanner sc = new Scanner(System.in);

		int num;

		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(" O número " + num + " é par ");
		} else {
			System.out.println(" O número " + num + " é impar ");
		}

		sc.close();

		
	}
}
