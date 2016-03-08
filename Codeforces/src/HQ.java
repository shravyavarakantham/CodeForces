import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HQ {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(input);
		Pattern pat = Pattern.compile("e ");
		Matcher m = pat.matcher(input);
		for (int i=1;i<=m.groupCount();i++) {
			System.out.println(input.substring(m.group(i), m.end()));
		}
		while(m.find()) {
			System.out.println(input.substring(m.start(), m.end()));
		}
//		if(m.find()) {
//			System.out.println("YES");
//		}
//		else System.out.println("NO");
 
	}
	
}
