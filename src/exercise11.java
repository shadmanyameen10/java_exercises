//Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;
import java.lang.Math;

public class exercise11 {

	public static void main(String[] args) {

		double radius, perimeter, area;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a radius value: ");
		radius = input.nextDouble();

		perimeter = 2 * Math.PI * radius;
		area = Math.PI * radius * radius;

		System.out.println("Radius = " + radius);
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);

		input.close();

	}

}
