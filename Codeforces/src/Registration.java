import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class Registration implements Runnable {
	private Scanner in = new Scanner(System.in);
	private PrintWriter out = new PrintWriter(System.out);

	private int w;
	private String ans;
	private HashMap<String, Integer> map;

	public static void main(String[] args) {

		new Thread(new Registration()).start();
	}

	private void read() {
		map = new HashMap<>();
		w = in.nextInt();
		
	}

	private void solve() {
		String str = in.next();
		if(!map.containsKey(str)){
			map.put(str, 1);
			ans = "OK";
		}
		else {
			int val  = map.get(str);
			ans = str+val;
			val++;
			map.put(str, val);
		}
	}

	private void write() {
		out.println(ans);
	}

	public void run() {
		read();
		for (int i=0;i<w;i++) {
			solve();
			write();
		}
		
		
		out.close();
	}
}
