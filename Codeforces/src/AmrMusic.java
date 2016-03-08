import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AmrMusic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int instr = s.nextInt();
		int days = s.nextInt();
		int[] arr = new int[instr];
		HashMap<Integer, List<Integer>> daysToInst = new HashMap<>();
		for (int i = 0; i < instr; i++) {
			arr[i] = s.nextInt();
			List<Integer> list;
			if (daysToInst.containsKey(arr[i])) {
				list = daysToInst.get(arr[i]);
				list.add(i);
			}

			else {
				list = new ArrayList<Integer>();
				list.add(i);

			}
			daysToInst.put(arr[i], list);

		}
		System.out.println(daysToInst);
		s.close();
		Arrays.sort(arr);
		int count = 0;
		List<Integer> list = new ArrayList<>();
		int i = 0;
		for (i = 0; i < instr && count < days; i++) {
			list.addAll(daysToInst.get(arr[i]));
			count += daysToInst.get(arr[i]).size()*arr[i];
			i+=daysToInst.get(arr[i]).size()-1;
		}
		System.out.println(i);
		System.out.println(list);

	}

}
