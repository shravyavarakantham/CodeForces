import java.util.Scanner;

public class TheatreSquare {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int a = s.nextInt();
		assert (n > 0);
		assert (m > 0);
		long n_Div = 0, m_Div = 0;
		n_Div = n / a;
		if (n % a > 0)
			n_Div++;

		m_Div = m / a;
		if (m % a > 0)
			m_Div++;

		System.out.println(n_Div * m_Div);
	}

}
