import java.util.Scanner;

import Familia32.é;

public class ativ01 {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros 
				//e diga qual deles é o maior.

				int num1, num2, num3;
				Scanner scan= new Scanner (System.in);
			
				System.out.println("\nDigite o primeiro número: ");
				num1= scan.nextInt();
				
				System.out.println("\nDigite o segundo número: ");
				num2= scan.nextInt();
				
				System.out.println("\nDigite o terceiro número: ");
				num3= scan.nextInt();
				
				if (num1 >= num2 && num1 >=num3) {
					System.out.println("\nO número: "+num1+" é maior");
				}
				else if (num2 >= num1 && num2 >=num3) {
					System.out.println("\nO número: "+num2+" é maior");
				}
				else if (num3 >= num1 && num3 >=num2) {
					System.out.println("\nO número: "+num3+" é maior");
				}
				else 
					System.out.println("\nNúmero inválido");

	}

}
