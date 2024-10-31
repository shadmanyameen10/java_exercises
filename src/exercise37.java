//Write a Java program to reverse a string.

import java.util.Scanner;

public class exercise37 {

	public static void main(String[] args) {

		String str;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a word/sentence: ");

		str = input.nextLine();

		String reverse = new StringBuilder(str).reverse().toString();

		System.out.println("Reversed word/sentence: " + reverse);

		input.close();

	}

}
