package curso_programacao;

import java.util.Scanner;

public class Exercicio24For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int soma = 0;
		for (int i = 0; i < N; i++) {

			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		sc.close();

	}

}
