// Faça um programa que peça o raio de um círculo, calcule e mostre sua área

package com.curso.java;

import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o tamanho do Raio: ");
			double radius = scan.nextDouble();
			
			double area = (radius * radius) * 3.14159265359;
			
			System.out.println("O tamanho da área é: " + area + " metros quadrados!");
		}

	}

}