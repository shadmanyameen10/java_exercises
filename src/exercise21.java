// Write a Java program to convert a decimal number to an octal number.

import java.util.Scanner;

public class exercise21 {

	public static void main(String[] args) {

		int dec;
		String octal;

		Scanner input = new Scanner(System.in);
		System.out.print("Input a decimal number: ");
		dec = input.nextInt();
		octal = Integer.toOctalString(dec);
		System.out.println("Octal number is: " + octal);

		input.close();

	}

}
