//Write a Java program to convert a octal number to a decimal number.

import java.util.Scanner;

public class exercise25 {

	public static void main(String[] args) {

		String octal;
		int decimal;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a octal value: ");
		octal = input.nextLine();

		decimal = Integer.parseInt(octal, 8);

		System.out.println("Decimal Number: " + decimal);

		input.close();

	}

}
