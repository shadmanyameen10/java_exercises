//Write a Java program to compute the distance between two points on the earth's surface.

import java.util.Scanner;

public class exercise36 {

	public static void main(String[] args) {

		double radius = 6371.01;
		double x1, x2, y1, y2;
		double distance;

		Scanner input = new Scanner(System.in);

		System.out.print("Input the latitude of coordinate 1: ");
		x1 = input.nextDouble();

		System.out.print("Input the longitude of coordinate 1: ");
		y1 = input.nextDouble();

		System.out.print("Input the latitude of coordinate 2: ");
		x2 = input.nextDouble();

		System.out.print("Input the longitude of coordinate 2: ");
		y2 = input.nextDouble();

		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		System.out.println("The distance between those points is: " + distance + " km");

		input.close();

	}

}
