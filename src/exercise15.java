//Write a Java program to swap two variables.

import java.util.Scanner;

public class exercise15 {

	public static void main(String[] args) {

		int num1, num2, temp;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();

		System.out.println("Before swap: " + num1 + " , " + num2);

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.print("After swap: " + num1 + " , " + num2);

		input.close();

	}

}
