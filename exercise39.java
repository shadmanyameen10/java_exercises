//Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.

public class exercise39 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        int count = 0;

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println(digits[i] + "" + digits[j] + "" + digits[k]);
                        count++;
                    }
                }
            }
        }

        System.out.println("Total number of unique three-digit numbers is " + count);
    }
}
