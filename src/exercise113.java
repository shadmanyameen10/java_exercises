import java.util.*;

public class exercise113 {

	public static void main(String[] args) {

		int arr1[] = { 112, 113, 114, 119 };
		int arr2[] = { 124, 125, 126, 178 };

		int total[] = merge(arr1, arr2);

		System.out.println(Arrays.toString(total));

	}

	public static int[] merge(int[] a, int[] b) {

		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length)
			answer[k++] = a[i] < b[j] ? a[i++] : b[j++];

		while (i < a.length)
			answer[k++] = a[i++];

		while (j < b.length)
			answer[k++] = b[j++];

		return answer;
	}

}
