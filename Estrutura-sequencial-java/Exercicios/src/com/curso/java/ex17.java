/*
Fa�a um Programa para uma loja de tintas. O programa dever� pedir o tamanho em
metros quadrados da �rea a ser pintada. Considere que a cobertura da tinta � de 1 litro para
cada 6 metros quadrados e que a tinta � vendida em latas de 18 litros, que custam R$ 80,00 ou
em gal�es de 3,6 litros, que custam R$ 25,00.
Informe ao usu�rio as quantidades de tinta a serem compradas e os respectivos pre�os em 3
situa��es: comprar apenas latas de 18 litros; comprar apenas gal�es de 3,6 litros;
misturar latas e gal�es, de forma que o desperd�cio de tinta seja menor. Acrescente 10% de
folga e sempre arredonde os valores para cima, isto �, considere latas cheias.
 */

package com.curso.java;

import java.util.Scanner;
import java.io.IOException;

public class ex17 {
	
	public static void main(String[] args) throws IOException {
		  
		Scanner sc = new Scanner(System.in);
				
		int L = sc.nextInt();
		int C = sc.nextInt();
		
		if (L % 2 == C % 2)
			System.out.println(1);
		else                                               //complete o c�digo nos espa�os em branco
			System.out.println(0);
				sc.close();
			}
		}
//Complete com a sua l�gica nos espa�os em branc