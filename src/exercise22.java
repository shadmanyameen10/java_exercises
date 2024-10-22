// Write a Java program to convert a binary number to a decimal number

import java.util.Scanner;

public class exercise22 {

	public static void main(String[] args) {

		String binary;
		int decimal;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary value: ");
		binary = input.nextLine();

		decimal = Integer.parseInt(binary, 2);

		System.out.println("Decimal Number: " + decimal);

		input.close();

	}

}
