/*
 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule
 * seu peso ideal, utilizando as seguintes fórmulas:
	 A:	Para homens: (72.7*h) - 58
     B:	Para mulheres: (62.1*h) - 44.7
 */

package com.curso.java;

import java.util.Scanner;

public class ex13 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Qual é sua altura? ");
			double height = scan.nextDouble();
			
			System.out.println("Digite M (para Masculino) F (para Feminino) ");
			String gender = scan.next();
			
			if(gender.equalsIgnoreCase("m")) {
				double idealWeightM = (72.7 * height) - 58;
				System.out.println("Seu peso ideal é: " + idealWeightM + "kg, Masculino.");
				
			} else if(gender.equalsIgnoreCase("f")) {
				double idealWeightF = (62.1 * height) - 44.7;
				System.out.println("Seu peso ideal é: " + idealWeightF + "kg, Feminino.");
				
			}
		}
	}
}