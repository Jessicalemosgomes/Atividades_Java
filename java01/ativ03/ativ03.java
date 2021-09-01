package ativ03;

import java.util.Scanner;

public class ativ03 {

	public static void main(String[] args) {
		// Faça um programa que receba a idade de uma pessoa e mostre na saída em qual 
		//categoria ela se encontra:
		//10-14 infantil
		//15-17 juvenil
		//18-25 adulto

		
		int idade;
		
        Scanner scan= new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade: ");
		idade= scan.nextInt();

		if(idade >=10 && idade <=14) {
			System.out.println("\nCategoria Infantil");
		}
		else if(idade >14 && idade <= 17) {
			System.out.println("\nCategoria Juvenil");
		}
		else if(idade >17 && idade <=24) {
			System.out.println("\nCategoria Adulto");
		}
		else {
			System.out.println("\nEntrada Inválida");
		}
	}

}
