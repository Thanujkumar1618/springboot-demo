package Calc;

import java.util.Scanner;


public class Calculator {
	
public static void main(String[] args) {
		
		int operator, n1, n2;
		System.out.println("1- Addition \n 2- Subtaraction \n 3- Multiplication \n 4- Divison");
		System.out.print("Choose operator: ");
		Scanner sc = new Scanner(System.in);
		operator = sc.nextInt();
		System.out.print("Enter first number: ");
		n1 = sc.nextInt();
		System.out.print("Enter second number: ");
		n2 = sc.nextInt();
		sc.close();
		
		int result = 0;
		switch(operator) {
		case 1: 
			result = n1 + n2;
			break;
		case 2: 
			result = n1 - n2;
			break;
		case 3: 
			result = n1 * n2;
			break;
		case 4: 
			result = n1 / n2;
			break;
			
			default:
				System.out.println("Enterned operator number is not valid");
			
		}
		System.out.println("Result is : " + result);
	}



}
