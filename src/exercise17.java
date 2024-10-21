// Write a Java program to add two binary numbers

import java.util.Scanner;

public class exercise17 {

	public static void main(String[] args) {

		int num1, num2, sum;
		String binary1, binary2;

		Scanner input = new Scanner(System.in);

		System.out.print("Input first binary number: ");
		binary1 = input.nextLine();

		System.out.print("Input second binary number: ");
		binary2 = input.nextLine();

		num1 = Integer.parseInt(binary1, 2);
		num2 = Integer.parseInt(binary2, 2);

		sum = num1 + num2;

		System.out.println(Integer.toBinaryString(sum));

		input.close();

	}

}
