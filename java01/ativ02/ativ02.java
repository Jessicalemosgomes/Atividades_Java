package ativ02;

import java.util.Scanner;

public class ativ02 {

	public static void main(String[] args) {
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

		int num1,num2,num3;
		
        Scanner scan= new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro n�mero: ");
		num1= scan.nextInt();
		
		System.out.println("\nDigite digite o segundo n�mero: ");
		num2=scan.nextInt();
		
		System.out.println("\nDigite digite o terceiro n�mero: ");
		num3=scan.nextInt();

		if(num1 < num2 && num1 < num3) {
			if(num2 < num3) {
				System.out.println("\nOrdem crescente:"+num1+" - "+num2+" - "+num3);
			}
			else {
				System.out.println("\nOrdem crescente:"+num1+" - "+num3+" - "+num2);

			}
		}
		else if(num2 < num3 && num2 < num3) {
			 if(num1 < num3) {
					System.out.println("\nOrdem crescente :"+num2+" - "+num1+" - "+num3);
			 }
			 else {
					System.out.println("\nOrdem crescente :"+num1+" - "+num3+" - "+num1);

			 }
		}
		else if(num3 < num1 && num3 < num2) {
			if(num1 < num2) {
				   System.out.println("\nOrdem crescente :"+num3+" - "+num1+" - "+num2);
			}
			else {
				System.out.println("\nOrdem crescente :"+num3+" - "+num2+" - "+num1);
			}
		}
		
	}

}
