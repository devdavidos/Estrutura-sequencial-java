// Fa�a um programa que calcule a �rea de um quadrado em seguida mostre o dobro desta �rea para o usu�rio

package com.curso.java;

import java.util.Scanner;

public class ex07 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Insira o tamanho do raio: ");
			double radius = scan.nextDouble();
			
			double area = (3.14159265359 * (radius * radius)) * 2;
			System.out.println("O dobro da �rea �: " + area + " m�.");
		}
	}
}