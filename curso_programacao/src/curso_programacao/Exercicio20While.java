package curso_programacao;

import java.util.Scanner;

public class Exercicio20While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */

		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) {

			System.out.println("Senha Incorreta");
			senha = sc.nextInt();

		}

		System.out.println("Acesso Permitido");

		sc.close();
	}

}
