import java.util.Scanner;


public class BoyOrGirl {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str = s.next();
	int[] chars = new int[26];
	int count = 0;
	for (int i=0;i<str.length();i++) {
		int c = str.charAt(i)-'a';
		if (chars[c]==0) {
			chars[c] = 1;
			count++;
		} 
		else {
			continue;
		}
	}
	if (count%2==0) {
		System.out.println("CHAT WITH HER!");
		
	}
	else {
		System.out.println("IGNORE HIM!");
	}
	
}
}
