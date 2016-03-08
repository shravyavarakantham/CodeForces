import java.util.Scanner;


public class WordCaptalization {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuffer strb = new StringBuffer(str);
		strb.setCharAt(0, Character.toUpperCase(str.charAt(0)));
		System.out.println(strb.toString());
	}
}
