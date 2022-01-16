// Faça um programa que peça as 4 notas bimestrais e mostre a média

package com.curso.java;

import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite a 1° nota: ");
			double firstNote = scan.nextInt();
			
			System.out.println("Digite a 2° nota: ");
			double secondNote = scan.nextInt();
			
			System.out.println("Digite a 3° nota: ");
			double thridNote = scan.nextInt();
			
			System.out.println("Digite a 4° nota: ");
			double fourthNote = scan.nextInt();
			
			double average = (firstNote + secondNote + thridNote + fourthNote) / 4;
			
			System.out.println("A média total foi: " + average);
		}

	}

}