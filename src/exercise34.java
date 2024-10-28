//Write a Java program to compute hexagon area.

import java.util.Scanner;

public class exercise34 {

	public static void main(String[] args) {

		double side, area;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of a side of the hexagon: ");
		side = input.nextDouble();

		area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));

		System.out.println("The area of the hexagon is: " + area);
		
		input.close();
	}

}
