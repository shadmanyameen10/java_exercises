// Write a Java program and compute the sum of an integer's digits.

import java.util.Scanner;

public class exercise33 {

	public static void main(String[] args) {

		int num;
		int sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = input.nextInt();

		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
		
		input.close();

	}

}
