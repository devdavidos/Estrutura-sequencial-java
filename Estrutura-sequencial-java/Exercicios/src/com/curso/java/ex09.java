/*
   Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre 
   a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
 */

package com.curso.java;

import java.util.Scanner;

public class ex09 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite a temperatura em Fahrenheit: ");
			double fahrenheit = scan.nextDouble();
			
			double celcius = (5 * (fahrenheit - 32)) / 9;
			
			System.out.println("A temperatura convertida em Celcius é: " + celcius + " C°");
		}
	}
}