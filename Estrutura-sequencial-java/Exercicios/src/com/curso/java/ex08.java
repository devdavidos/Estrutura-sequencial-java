/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês.
 */

package com.curso.java;

import java.util.Scanner;

public class ex08 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Quanto você ganha por hora? ");
			double wageHour = scan.nextDouble();
			
			System.out.println("Quantas horas você trabalhou esse mês? ");
			double workHour = scan.nextDouble();
			
			double wage = workHour * wageHour;
			
			System.out.println("O seu salário é: R$ " + wage + ".");
		}
	}
}
