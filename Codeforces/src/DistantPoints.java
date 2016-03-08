

import java.awt.Point;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DistantPoints implements Runnable {
	private Scanner in = new Scanner(System.in);
	private PrintWriter out = new PrintWriter(System.out);

	private int w;
	private String ans;

	public static void main(String[] args) {
		new Thread(new DistantPoints()).start();
	}

	private void read() {
		w = in.nextInt();
		List<Point> points = new ArrayList<Point>();
		for (int i=0;i<w;i++) {
			Point p = new Point(in.nextInt())
		}

	}

	private void solve() {

	}

	private void write() {
		out.println(ans);
	}

	public void run() {
		read();
		solve();
		write();
		out.close();
	}
}
