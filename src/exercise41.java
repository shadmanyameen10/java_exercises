//Write a Java program to print the ASCII value of a given character

import java.util.Scanner;

public class exercise41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        int asciiValue = (int) character;

        System.out.println("The ASCII value of " + character + " is :" + asciiValue);
        scanner.close();
    }
}
