// Faça um programa que mostre e mensagem "Olá mundo" na tela.

package com.curso.java;

import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Olá mundo!");
		}

	}

}
