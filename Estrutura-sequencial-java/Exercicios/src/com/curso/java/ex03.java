// Fa�a um Programa que pe�a dois n�meros e imprima a soma.

package com.curso.java;

import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite um n�mero: ");
			int numberOne = scan.nextInt();
			
			System.out.println("Digite outro n�mero: ");
			int numberTwo = scan.nextInt();
			
			int sum = numberOne + numberTwo;
			
			System.out.println("A soma entre, " + numberOne + " e " + numberTwo + " � " + sum);
		}

	}

}