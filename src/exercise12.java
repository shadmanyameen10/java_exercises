// Write a Java program that takes three numbers as input to calculate and print the average of the numbers

import java.util.Scanner;

public class exercise12 {

	public static void main(String[] args) {

		int num1, num2, num3, average;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		num1 = input.nextInt();

		System.out.print("Enter second number: ");
		num2 = input.nextInt();

		System.out.print("Enter third number: ");
		num3 = input.nextInt();

		average = (num1 + num2 + num3) / 3;

		System.out.println("Average is: " + average);

		input.close();

	}

}
