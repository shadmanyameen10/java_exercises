//Write a Java program to convert a hexadecimal number into a binary number.

import java.util.Scanner;

public class exercise29 {

	public static void main(String[] args) {

		String hexa;
		int binary;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hexadecimal value: ");
		hexa = input.nextLine();

		binary = Integer.parseInt(hexa, 16);
		hexa = Integer.toString(binary, 2);

		System.out.println("Binary Number: " + hexa);

		input.close();

	}

}
