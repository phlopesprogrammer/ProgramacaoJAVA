package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14CondicaoTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preco;

		preco = sc.nextDouble();

		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.printf("%.3f%n", desconto);

		sc.close();

	}

}
