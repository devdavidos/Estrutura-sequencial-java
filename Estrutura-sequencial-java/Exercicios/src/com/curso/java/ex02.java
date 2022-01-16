// Faça um programa que peça um número e então mostre a mensagem "O número informado foi" 

package com.curso.java;

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Informe um número: ");
			int number = scan.nextInt();
			
			System.out.println("O número informado foi: " + number);
		}

	}

}
