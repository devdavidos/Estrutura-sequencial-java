// Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem "O n�mero informado foi" 

package com.curso.java;

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Informe um n�mero: ");
			int number = scan.nextInt();
			
			System.out.println("O n�mero informado foi: " + number);
		}

	}

}
