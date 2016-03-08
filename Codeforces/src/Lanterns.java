import java.util.*;

public class Lanterns {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rooms = s.nextInt();
		String ss = s.next();
		Map<Character, Character> pair = new HashMap<Character, Character>();
		int count = 0;
		for (int i = 0; i < ss.length(); i = i + 2) {
			if (!pair.containsKey(ss.charAt(i)))
				pair.put(ss.charAt(i), null);
			if (!pair.containsKey(Character.toLowerCase(ss.charAt(i + 1)))
					|| (pair.containsKey(Character.toLowerCase(ss.charAt(i + 1))) && pair
							.get(Character.toLowerCase(ss.charAt(i + 1))) != null))
				count++;
			else
				pair.put(Character.toLowerCase(ss.charAt(i + 1)),
						ss.charAt(i + 1));
		}

		System.out.println(count);
	}
}
