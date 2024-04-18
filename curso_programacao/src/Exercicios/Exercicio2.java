package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não
		 */

		Scanner sc = new Scanner(System.in);

		int num;

		num = sc.nextInt();

		if (num < 0) {
			System.out.println(" O número " + num + " é negativo. ");
		} else {
			System.out.println(" O número " + num + " é positivo ");
		}

		sc.close();

	}

}
