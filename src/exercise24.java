//Write a Java program to convert a binary number to an octal number.

import java.util.Scanner;

public class exercise24 {

	public static void main(String[] args) {

		String binary;
		int octal;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary value: ");
		binary = input.nextLine();

		octal = Integer.parseInt(binary, 2);
		binary = Integer.toString(octal, 8);

		System.out.println("Octal Number: " + binary.toUpperCase());

		input.close();

	}

}
