import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = s.nextInt();
		boolean increase = false;
		for (int i = 0; i < n / 2; i++) {
			if (i % 2 == 0) {
				t = t - 2 * (i + 1);
				increase = !increase;
			} else {
				t = t + 2 * (i + 1);
				increase = !increase;
			}
		}
		if (n % 2 == 1)
			if (increase)
				t = t + (n / 2)+1;
			else
				t = t - (n / 2)-1;
		System.out.println(t);
	}

}
