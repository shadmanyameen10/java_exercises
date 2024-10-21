// Write a Java program to convert an integer number to a binary number.

import java.util.Scanner;

public class exercise19 {

	public static void main(String[] args) {

		int num1;

		Scanner input = new Scanner(System.in);

		System.out.print("Input a decimal number: ");
		num1 = input.nextInt();

		System.out.println(Integer.toBinaryString(num1));

		input.close();

	}

}
