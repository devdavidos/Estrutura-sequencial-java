/*
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s.
 * Calcule e mostre o total do seu sal�rio no referido m�s.
 */

package com.curso.java;

import java.util.Scanner;

public class ex08 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Quanto voc� ganha por hora? ");
			double wageHour = scan.nextDouble();
			
			System.out.println("Quantas horas voc� trabalhou esse m�s? ");
			double workHour = scan.nextDouble();
			
			double wage = workHour * wageHour;
			
			System.out.println("O seu sal�rio �: R$ " + wage + ".");
		}
	}
}
