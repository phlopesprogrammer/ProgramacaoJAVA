package curso_programacao;

import java.util.Scanner;

public class Exercicio35bitAbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int mask = 0b00100000;
		int n = sc.nextInt();

		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		sc.close();

	}

}
