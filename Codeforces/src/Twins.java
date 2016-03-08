import java.util.Arrays;
import java.util.Scanner;


public class Twins {
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int coins = s.nextInt();
	int[] arr = new int[coins];
	int sum = 0;
	for(int i=0;i<coins;i++) {
		arr[i] = s.nextInt();
		sum =sum+arr[i];
	}
	
	Arrays.sort(arr);
	int result = 0;
	int value = 0;
	for (int i=arr.length-1;i>=0;i--) {
		result++;
		if(value+arr[i]>sum-value-arr[i]) {
			
			break;
		}
		value = value+arr[i];
	}
	System.out.println(result);
}
}
