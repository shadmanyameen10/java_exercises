// Write a Java program to compare two numbers.

import java.util.Scanner;

public class exercise32 {

	public static void main(String[] args) {

		int num1, num2;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		num1 = input.nextInt();

		System.out.print("Enter second number: ");
		num2 = input.nextInt();

		if (num1 != num2) {
			System.out.println(num1 + " != " + num2);
		}
		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		}
		if (num1 < num2) {
			System.out.println(num1 + " < " + num2);
		}
		if (num1 == num2) {
			System.out.println(num1 + " = " + num2);
		}

		input.close();
	}

}
