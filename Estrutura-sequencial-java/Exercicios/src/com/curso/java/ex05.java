// Fa�a um programa que converta metros para cent�metros

package com.curso.java;

import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o comprimento em metros: ");
			double metres = scan.nextDouble();
			
			double centimetres = metres * 100;
			
			System.out.println("Convertido em cent�metros: " + centimetres + " cm.");
			
		}

	}

}