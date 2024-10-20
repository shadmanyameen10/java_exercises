//Write a Java program to print the area and perimeter of a rectangle

import java.util.Scanner;

public class exercise13 {

	public static void main(String[] args) {

		double width, height, area, perimeter;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		width = input.nextDouble();

		System.out.print("Enter height: ");
		height = input.nextDouble();

		area = width * height;
		perimeter = 2 * (width + height);

		System.out.println("Area is: " + width + " * " + height + " = " + area);
		System.out.println("Perimeter is: " + "2 " + " * " + "(" + width + " + " + height + ")" + " = " + perimeter);

		input.close();

	}

}
