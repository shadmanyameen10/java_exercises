// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, sum, diff, product, quotient;

		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();

		sum = num1 + num2;
		diff = num1 - num2;
		product = num1 * num2;
		quotient = num1 / num2;

		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + diff);
		System.out.println(num1 + " * " + num2 + " = " + product);
		System.out.println(num1 + " / " + num2 + " = " + quotient);

		input.close();

	}

}
