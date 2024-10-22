// Write a Java program to convert a octal number to a binary number.

import java.util.Scanner;

public class exercise26 {

	public static void main(String[] args) {

		String octal;
		int binary;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a octal value: ");
		octal = input.nextLine();

		binary = Integer.parseInt(octal, 8);
		octal = Integer.toString(binary, 2);

		System.out.println("Binary Number: " + octal.toUpperCase());

		input.close();

	}

}
