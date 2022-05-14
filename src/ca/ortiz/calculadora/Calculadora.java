package ca.ortiz.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
				
		System.out.println("Enter a valur for a: ");
		a = scan.nextInt();
		System.out.println("Enter a valur for b: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		
		System.out.println("a + b = " + soma);
		System.out.println("a - b = " + subtracao);
		System.out.println("a * b = " + multiplicacao);
		System.out.println("a / b = " + divisao);
		
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}
