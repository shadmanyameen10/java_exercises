//Write a Java program to convert a hexadecimal value into a decimal number.

import java.util.Scanner;

public class exercise28 {

	public static void main(String[] args) {

		String hexa;
		int dec;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hexadecimal value value: ");
		hexa = input.nextLine();

		dec = Integer.parseInt(hexa, 16);
		

		System.out.println("Decimal Number: " + dec);

		input.close();
		
		
		
		
	}

}
