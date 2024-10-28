// Write a Java program to compute the area of a polygon.

import java.util.Scanner;

public class exercise35 {

	public static void main(String[] args) {

		double number, side, area;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of sides on the polygon: ");
		number = input.nextDouble();

		System.out.print("Enter the length of one of the sides: ");
		side = input.nextDouble();

		area = (number * side * side) / (4 * Math.tan(Math.PI / number));

		System.out.println("The area is: " + area);

		input.close();

	}

}
