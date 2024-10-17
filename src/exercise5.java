// Write a Java program that takes two numbers as input and displays the product of two numbers.

import java.util.*;

public class exercise5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, product;

		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();

		product = num1 * num2;

		System.out.println(num1 + " * " + num2 + " = " + product);

		input.close();

	}

}
