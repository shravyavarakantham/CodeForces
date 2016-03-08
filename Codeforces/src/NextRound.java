import java.util.Arrays;
import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int k = s.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int min = arr[k - 1];
		Arrays.sort(arr);
		int count = 0;
		
		for(int i=0;i<n;i++)
		if (arr[i] >= min && arr[i]>0 ) {
		
				count++;
				
		
		}
		System.out.println(count);
	}
}
