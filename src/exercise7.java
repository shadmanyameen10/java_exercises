// Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class exercise7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num1, product;

		System.out.print("Input a number: ");
		num1 = input.nextInt();

		for (int i = 1; i <= 10; i++) {
			product = num1 * i;
			System.out.println(num1 + " * " + i + " = " + product);
		}

		input.close();

	}

}
