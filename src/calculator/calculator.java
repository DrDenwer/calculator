package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		double num1=0,num2=0,sum=0;
		String operation="";
		
		System.out.println("Enter the first number: ");
		num1 = Double.parseDouble(enter.nextLine());
		
		System.out.println("Enter the seconf number: ");
		num2 = Double.parseDouble(enter.nextLine());

		System.out.println("Choose operation (+-*/): ");
		operation = enter.nextLine();
		
		if(operation.equals("/") && num2 == 0) {
			System.out.println("bad choice to divide by 0");
			return;
		}
		
		if(operation.equals("+")) {
			sum = num1 + num2;
		}
		else if(operation.equals("-")) {
			sum = num1 - num2;
		}
		else if(operation.equals("*")) {
			sum = num1 * num2;
		}
		else if(operation.equals("/")) {
			sum = num1 / num2;
		}
		else {
			sum = 0;
		}
		
		System.out.println("Result is: " + sum);
		
	}

}
