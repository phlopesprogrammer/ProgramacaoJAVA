package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 01-Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos Exercicio
		 */

		Locale.setDefault(Locale.US);

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int soma;
		 * 
		 * int x = sc.nextInt(); int y = sc.nextInt();
		 * 
		 * soma = x + y ;
		 * 
		 * System.out.println("A soma dos dois números é = " + soma);
		 * 
		 * //////////////////////////////////////////////////////////////////
		 * 
		 * 
		 * /* 02 - Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 */

		/*		Scanner sc = new Scanner(System.in);

double area;
		double pi = 3.14159;
		double raio = sc.nextDouble();

		area = pi * (Math.pow(raio, 2));

		System.out.println(area);
		sc.nextLine();
		System.out.printf("%.4f", area);
		sc.nextLine();
		System.out.printf("%.4f", area);
		*/
		
		/*03 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		
		/*Scanner sc = new Scanner(System.in);
		int diferenca;
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		diferenca = (A * B) - (C * D);
		
		System.out.println(diferenca);*/
		
/*04- Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/		
		
		/*Scanner sc = new Scanner(System.in);
		
		
		String nomeFuncionario = sc.next();
		int numFuncionario = sc.nextInt();
		Double numHoras = sc.nextDouble();
		Double valorHoras = sc.nextDouble();
		Double salarioFuncionario = numHoras * valorHoras;
		
		System.out.println(nomeFuncionario);
		System.out.println(numFuncionario);
		System.out.printf("%.2f%n", salarioFuncionario);
*/
		
		/*05 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		/*Scanner sc = new Scanner(System.in);
		
		double valorTotalFenda;
		double valorTotalPhillips;
		double totalFinal;
		
		
		int Fenda = sc.nextInt();
		double quantFenda = sc.nextInt();
		double valorFenda = sc.nextDouble();
		
		int Phillips = sc.nextInt();
		double quantPhillips = sc.nextInt();
		double valorPhillips = sc.nextDouble();
		
		valorTotalFenda = quantFenda * valorFenda ;
		valorTotalPhillips = quantPhillips * valorPhillips ;
		totalFinal =  valorTotalFenda + valorTotalPhillips ;
		
		
		System.out.printf("Valor a pagar = R$ %.2f%n", totalFinal);*/
		
		
		/* 6 - Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/
		

		Scanner sc = new Scanner(System.in);
	
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaTriangulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado ;
		double areaRetangulo ;
		
		
		
		
		areaTriangulo = (A * C) / 2 ;
		
		areaCirculo = 3.14159 * Math.pow(C, 2);
		
		areaTrapezio = (A + B) * ( C/2 );
		
		areaQuadrado = Math.pow(B, 2) ;
		
		areaRetangulo = A * B ;
		
		
		System.out.printf("%.3f%n", areaTriangulo);
		System.out.printf("%.3f%n", areaCirculo);
		System.out.printf("%.3f%n", areaTrapezio);
		System.out.printf("%.3f%n", areaQuadrado);
		System.out.printf("%.3f%n", areaRetangulo);
		
		
		
		sc.close();

	}
}
