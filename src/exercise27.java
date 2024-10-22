// Write a Java program to convert a octal number to a hexadecimal number.

import java.util.Scanner;

public class exercise27 {

	public static void main(String[] args) {

		String octal;
		int hexa;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a octal value: ");
		octal = input.nextLine();

		hexa = Integer.parseInt(octal, 8);
		octal = Integer.toString(hexa, 16);

		System.out.println("Hexadecimal Number: " + octal.toUpperCase());

		input.close();

	}

}
