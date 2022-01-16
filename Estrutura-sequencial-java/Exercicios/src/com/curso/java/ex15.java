/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas
 * no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são 
 * descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
 * faça um programa que nos dê:
		A: salário bruto.
		B: quanto pagou ao INSS.
		C: quanto pagou ao sindicato.
		D: o salário líquido.
		E: calcule os descontos e o salário líquido, conforme a tabela abaixo:
		
		+ Salário Bruto : R$
		- IR (11%) : R$
		- INSS (8%) : R$
		- Sindicato ( 5%) : R$
		= Salário Liquido : R$
 */

package com.curso.java;

import java.util.Scanner;

public class ex15 {
	
	public static void main (String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Quanto você ganha por hora? ");
			double valorHora = scan.nextDouble();
			
			System.out.println("Quantas hora você trabalhou esse mês? ");
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
			System.out.println("Salário liquído: R$ " + salarioLiquido);
		}
	}
}