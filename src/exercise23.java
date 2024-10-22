//Write a Java program to convert a binary number to a hexadecimal number.

import java.util.Scanner;

public class exercise23 {

	public static void main(String[] args) {

		String binary;
		int hexadecimal;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary value: ");
		binary = input.nextLine();

		hexadecimal = Integer.parseInt(binary, 2);
		binary = Integer.toString(hexadecimal, 16);

		System.out.println("Decimal Number: " + binary.toUpperCase());

		input.close();

	}

}
