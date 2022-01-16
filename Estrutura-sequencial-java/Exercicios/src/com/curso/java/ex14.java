/*
 *  Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
 *  di�rio de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido
 *  pelo regulamento de pesca do estado de S�o Paulo (50 quilos) deve pagar uma multa de R$ 4,00
 *  por quilo excedente. Jo�o precisa que voc� fa�a um programa que leia a vari�vel peso 
 *  (peso de peixes) e calcule o excesso. Gravar na vari�vel excesso a quantidade de quilos 
 *  al�m do limite e na vari�vel multa o valor da multa que Jo�o dever� pagar. 
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