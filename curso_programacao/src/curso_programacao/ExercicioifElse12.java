package curso_programacao;

import java.util.Scanner;

public class ExercicioifElse12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;

		if (x == 1) {
			dia = "Segunda";
		} else if (x == 2) {
			dia = "Terça";
		} else if (x == 3) {
			dia = "Quarta";
		} else if (x == 4) {
			dia = "Quinta";
		} else if (x == 5) {
			dia = "Sexta";
		} else if (x == 6) {
			dia = "Sábado";
		} else if (x == 7) {
			dia = "Domingo";
		} else {
			dia = "Valor invalido";
		}

		System.out.println(dia);
		sc.close();

	}

}
