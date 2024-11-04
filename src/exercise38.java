// Write a Java program to count letters, spaces, numbers and other characters in an input string.

import java.util.Scanner;

public class exercise38 {

	public static void main(String[] args) {

		String str;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a word/sentence: ");
		str = input.nextLine();

		int count = 0;
		int spaceCount = 0;
		int numCount = 0;
		System.out.println("String: " + str);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				count++;
		}
		for (int j = 0; j < str.length(); j++) {
			if (Character.isWhitespace(str.charAt(j)))
				spaceCount++;
		}
		for (int k = 0; k < str.length(); k++) {
			if (Character.isDigit(str.charAt(k)))
				numCount++;
		}

		System.out.println("Letters: " + count);
		System.out.println("Spaces: " + spaceCount);
		System.out.println("Numbers: " + numCount);
		System.out.println();

		input.close();

	}

}
