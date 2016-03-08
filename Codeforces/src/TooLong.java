import java.util.Scanner;


public class TooLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			String str = s.next();
			if (str.length()>10){
			StringBuilder sb = new StringBuilder();
			sb.append(str.charAt(0));
			sb.append(Integer.toString(str.length()-2));
			sb.append(str.charAt(str.length()-1));
			sop(sb.toString());
			}
			else
				sop(str);
		}
	}

	static void sop(String s) {
		System.out.println(s);
	}
	
}
