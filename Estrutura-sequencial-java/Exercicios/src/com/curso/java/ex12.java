/* 
  Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu
  peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
*/

package com.curso.java;

import java.util.Scanner;

public class ex12 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite sua altura: ");
			double height = scan.nextDouble();
			
			double idealWeight = (72.7 * height) - 58;  
			
			System.out.println("O seu peso ideal é: " + idealWeight);
		}
	}
}