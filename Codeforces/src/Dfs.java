
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Dfs implements Runnable {
	private Scanner in = new Scanner(System.in);
	private PrintWriter out = new PrintWriter(System.out);

	private int pts;
	private int edges;
	private HashMap<Integer, List<Integer>> adjList;
	private int[] visited;
	private int ans;

	public static void main(String[] args) {
		new Thread(new Dfs()).start();
	}

	private void read() {
		pts = in.nextInt();
		edges = in.nextInt();
		adjList = new HashMap<>();
		visited = new int[pts + 1];
		for (int i = 0; i < edges; i++) {
			List<Integer> edgeList;
			int start = in.nextInt();
			if (adjList.containsKey(start)) {
				edgeList = adjList.get(start);
				edgeList.add(in.nextInt());
			} else {
				edgeList = new ArrayList<Integer>();
				edgeList.add(in.nextInt());
			}
			adjList.put(start, edgeList);
		}

	}

	private void solve() {
		dfs();

	}

	private void dfs() {
		Set<Integer> keys = adjList.keySet();
		List<Integer> keysList = new ArrayList<>();
		for (int val : keys) {
			keysList.add(val);
		}
		Collections.sort(keysList);
		for (int start : keysList) {
			dfs(start);
		}
	}

	private void dfs(int start) {
		if (visited[start] != 1) {
			visited[start] = 1;
			write(start);
			List<Integer> ends = adjList.get(start);
			if (ends != null) {
				Collections.sort(ends);
				for (int end : ends) {
					dfs(end);
				}
			}
		}
	}

	private void write(int val) {
		out.println(val);
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
