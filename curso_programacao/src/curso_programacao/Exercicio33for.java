package curso_programacao;

import java.util.Scanner;

public class Exercicio33for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int quadrado;
		int cubo;
		for (int i = 1; i <= n; i++) {
			
			quadrado = i * i;
			cubo = i * i* i;
 
			System.out.printf("%d %d %d%n", i , quadrado, cubo);

		}

		sc.close();

	}

}
