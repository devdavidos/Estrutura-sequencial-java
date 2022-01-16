/*
 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros 
 * quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para
 * cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
 * Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */
package com.curso.java;

import java.util.Scanner;

public class ex16 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o tamanho em metros quadrados a ser pintado: ");
			double metros = scan.nextDouble();
			
			double coberturaTinta = 3;
			double capacidadeLata = 18;
			double precoLata = 80;
			
			double litros = metros / coberturaTinta;
			double latasInteiras = litros / capacidadeLata;
			double valorTotal = latasInteiras * precoLata;
			
			System.out.println("Vai ser gasto um total de: " + latasInteiras + " latas");
			System.out.println("Vai ser gasto: R$ " + valorTotal);
		}
	}
}