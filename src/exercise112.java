
public class exercise112 {

	public static int findTrailingZeros(int n) {
		if (n < 0)
			return -1;

		int count = 0;

		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;

		return count;
	}

	public static void main(String[] args) {
		int n = 7;
		System.out.println("Count of trailing 0s in " + n + "! is " + findTrailingZeros(n));
	}
}
