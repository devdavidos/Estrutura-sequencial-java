/*
 * Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e 
 * mostre em graus Fahrenheit.
 */

package com.curso.java;

import java.util.Scanner;

public class ex10 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("A temperatura em Celcius �: ");
			double celcius = scan.nextDouble();
			
			double fahrenheit = ((celcius * 9) / 5) + 32;
			
			System.out.println("A temperatura convertida em Fahrenheit �: " + fahrenheit + " F�.");
		}
	}
}