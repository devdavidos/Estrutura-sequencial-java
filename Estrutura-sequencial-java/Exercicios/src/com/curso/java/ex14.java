/*
 *  João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
 *  diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido
 *  pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00
 *  por quilo excedente. João precisa que você faça um programa que leia a variável peso 
 *  (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos 
 *  além do limite e na variável multa o valor da multa que João deverá pagar. 
 *  Imprima os dados do programa com as mensagens adequadas.
 */

package com.curso.java;

import java.util.Scanner;

public class ex14 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Insira o valor total do peso: ");
			double weight = scan.nextDouble();
			
			double overWeight = weight - 50;
			double penality = overWeight * 4;  
			
			System.out.println("Peso exedente: " + overWeight + " kg.\nValor da multa: R$ " + penality);
		}
	}
}