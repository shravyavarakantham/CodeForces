import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Winner implements Runnable {
	Scanner s = new Scanner(System.in);
	int n;
	String result;

	public void run() {
		read();
		solve();
		write();
	}

	public void read() {
		n = s.nextInt();
	}

	public String getWinner(Map<String, ArrayList<Integer>> record){
		int maxSum = Integer.MIN_VALUE;
		for (String key: record.keySet()){
			ArrayList<Integer> pts= record.get(key);
			int sum = pts.stream().collect(Collectors.summingInt(i->i.intValue()));
			maxSum = maxSum>sum? maxSum: sum;
		}
	}
	
	public void solve() {
		Map<String, ArrayList<Integer>> record = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = s.next();
			ArrayList<Integer> points;
			if (record.containsKey(name)) {
				points = record.get(name);
			} else {
				points = new ArrayList<>();
			}
			points.add(s.nextInt());
			record.put(name, points);
		}
		result = getWinner(record);
		if(result==null) {
			result =  breakTie(record);
		}
	}

	public void write() {
		System.out.println(result);
		s.close();
	}

	public static void main(String[] args) {
		new Thread(new Winner()).start();
	}

}
