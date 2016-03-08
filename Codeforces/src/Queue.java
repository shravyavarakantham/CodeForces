import java.util.Scanner;

public class Queue {
	static int tf = 0;
	static int f = 0;
	static int h = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		for (i = 0; i < n; i++) {
			int get = s.nextInt();
			check(get);
			if (get - 25 == 25)
				if (tf == 0)
					break;
				else
					tf--;
			else if (get - 25 == 75)
				if (tf == 0 || f == 0)
					break;
				else {
					tf--;
					f--;
				}
		}

		if (i < n)
			sop("NO");
		else
			sop("YES");

	}

	public static void check(int n) {
		if (n == 25)
			tf++;
		if (n == 50)
			f++;
		if (n == 100)
			h++;
	}

	public static void sop(Object a) {
		System.out.println(a);
	}

}
