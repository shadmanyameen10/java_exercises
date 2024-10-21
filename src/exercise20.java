//Write a Java program to convert a decimal number to a hexadecimal number.

import java.util.Scanner;

public class exercise20 {

	public static void main(String[] args) {

		int num1;
		String hex;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		num1 = input.nextInt();

		hex = Integer.toHexString(num1);

		System.out.println("Hexadecimal number is : " + hex.toUpperCase());

		input.close();

	}

}
