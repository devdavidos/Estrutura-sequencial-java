/*
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas
 * no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o 
 * descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
 * fa�a um programa que nos d�:
		A: sal�rio bruto.
		B: quanto pagou ao INSS.
		C: quanto pagou ao sindicato.
		D: o sal�rio l�quido.
		E: calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
		
		+ Sal�rio Bruto : R$
		- IR (11%) : R$
		- INSS (8%) : R$
		- Sindicato ( 5%) : R$
		= Sal�rio Liquido : R$
 */

package com.curso.java;

import java.util.Scanner;

public class ex15 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Quanto voc� ganha por hora? ");
			double valorHora = scan.nextDouble();
			
			System.out.println("Quantas hora voc� trabalhou esse m�s? ");
			double diasTrabalhados = scan.nextDouble();
			
			double salarioBruto = diasTrabalhados * valorHora;
			double impostoRenda = (salarioBruto / 100) * 11;
			double inss = (salarioBruto / 100) * 8;
			double sindicato = (salarioBruto / 100) * 5;
			
			double descontos = impostoRenda + inss + sindicato;
			double salarioLiquido = salarioBruto - descontos;
			
			System.out.println("Salario Bruto: R$ " + salarioBruto);
			System.out.println("Imposto de renda: R$ " + impostoRenda);
			System.out.println("Inss: R$ " + inss);
			System.out.println("Sindicato: R$ " + sindicato);
			System.out.println("Sal�rio liqu�do: R$ " + salarioLiquido);
		}
	}
}