// Write a Java program to convert a hexadecimal value into an octal number.

import java.util.Scanner;

public class exercise30 {

	public static void main(String[] args) {

		String hexa;
		int octal;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hexadecimal value: ");
		hexa = input.nextLine();

		octal = Integer.parseInt(hexa, 16);
		hexa = Integer.toString(octal, 8);

		System.out.println("Octal Number: " + hexa);

		input.close();

	}

}
