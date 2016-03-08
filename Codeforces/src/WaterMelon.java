import java.util.Scanner;


public class WaterMelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		if (w==2)
			sop("NO");
		else if (w%2==0) {
			sop("YES");
		}
		else
			sop("NO");

	}
	
	static void sop(String s) {
		System.out.println(s);
	}

}
