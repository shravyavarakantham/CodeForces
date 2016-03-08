import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelpfulMaths {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String pattern = "([1-3]+)";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(str);
	      List<String> nums = new ArrayList<String>();
	      while(m.find()){
	    	  nums.add(m.group(1));
	      }
		
		int[] arr = new int[4];

		for (String num : nums) {
			arr[Integer.parseInt(num)]++;
		}

		s.close();
		StringBuffer strb = new StringBuffer();
		for (int i=1;i<=3;i++) {
			int j=0;
			while(j<arr[i]){
				strb.append(i);
				strb.append("+");
				j++;
			}
		}
		strb.deleteCharAt(strb.length()-1);
		System.out.println(strb);
	}
}
