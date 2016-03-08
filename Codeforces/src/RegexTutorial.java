import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTutorial {

	public static void main(String[] args) {
		String s = "1+23+3";
//		System.out.println(s.matches(".*1.*"));
		Pattern pattern = Pattern.compile("([1-3]+)");
		Matcher m = pattern.matcher(s);
		while(m.find()) {
			System.out.println(s.substring(m.start(), m.end()));
//			System.out.println(m.group(0)+"===="+m.group(1));
//			for (int i = 1;i<=m.groupCount();i++) {
//				System.out.println(m.group(i));
//			}
			
		}
		
	}
}
