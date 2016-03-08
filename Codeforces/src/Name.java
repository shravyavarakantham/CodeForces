import java.util.Arrays;
import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n*n];
		for (int i=0;i<n*n;i++) {
			arr[i] = s.nextInt();
		}
		int[] brr = arr;
		Arrays.sort(arr);
		
	}

	public static int search(int[] arr, int n) {
		return bs(arr, n, 0, arr.length - 1);
	}

	public static int bs(int[] arr, int n, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] >= n) {
				if (mid > 0)
					if (arr[mid - 1] < n)
						return mid;
					else
						return 0;
				else
					return bs(arr, n, low, mid);
			} else {
				return bs(arr, n, mid + 1, high);
			}
		} else
			return -1;
	}

	static void sop(int s) {
		System.out.println(s);
	}

}