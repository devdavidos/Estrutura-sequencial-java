/*
 *  Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
		A: o produto do dobro do primeiro com metade do segundo .
		B: a soma do triplo do primeiro com o terceiro.
		C: o terceiro elevado ao cubo.
 */

package com.curso.java;

import java.util.Scanner;

public class ex11 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o primeiro n�mero: ");
			double numberOne = scan.nextInt();
			
			System.out.println("Digite o segundo n�mero: ");
			double numberTwo = scan.nextInt();
			
			System.out.println("Digite o terceiro n�mero: ");
			double numberThree = scan.nextDouble();
			
			double a = (numberOne * 2) + (numberTwo / 2);
			double b = ((numberOne * 3) + (numberThree * 3));
			double c = numberThree * numberThree * numberThree;
			// A
			System.out.println("O dobro do primeiro com metade do segundo: " + a);
			// B
			System.out.println("Soma do triplo do primeiro com o terceiro: " + b);
			// C
			System.out.println("O terceiro n�mero elevado ao cubo: " + c);
		}
	}
}