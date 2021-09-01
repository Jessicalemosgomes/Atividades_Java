package ativ04;

import java.util.Scanner;

public class ativ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num;
		
		Scanner scan= new Scanner(System.in);
			
		System.out.println("\nEntre com um número: ");
		num= scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("\n O número: "+num+" é par e a raiz é: "+Math.sqrt(num));
		}
		else {
			System.out.println("\n O número: "+num+" é impar e ele elevado ao quadrado é: "+Math.pow(num, 2));
		}
	}

}
