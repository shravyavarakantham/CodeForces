
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LongTail implements Runnable {
	private Scanner in = new Scanner(System.in);
	private PrintWriter out = new PrintWriter(System.out);

	private int pts;
	private int edges;
	private HashMap<Integer, List<Integer>> adjList;
	private int tailEnd;
	private int ptsOnTail;
	private int ans;
	private int[] visited;

	public static void main(String[] args) {
		new Thread(new LongTail()).start();
	}

	private void read() {
		pts = in.nextInt();
		edges = in.nextInt();
		adjList = new HashMap<>();
		visited = new int[pts + 1];

		for (int i = 0; i < edges; i++) {
			List<Integer> edgeList;
			int start = in.nextInt();
			int end = in.nextInt();
			if (adjList.containsKey(start)) {
				edgeList = adjList.get(start);
				edgeList.add(end);
			} else {
				edgeList = new ArrayList<Integer>();
				edgeList.add(end);
			}
			adjList.put(start, edgeList);
			if (adjList.containsKey(end)) {
				edgeList = adjList.get(end);
				edgeList.add(start);
			} else {
				edgeList = new ArrayList<Integer>();
				edgeList.add(start);
			}
			adjList.put(end, edgeList);

		}
		System.out.println(adjList);
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
		int maxBeauty = 0;
		for (int start : keysList) {
			int beauty = getBeauty(start);
			ptsOnTail = 0;
			tailEnd = 0;
			if (beauty > maxBeauty)
				maxBeauty = beauty;
		}
		ans = maxBeauty;
	}

	private int getBeauty(int val) {

		if (dfs(val)) {
			System.out.println(String.format("%d:%d*%d, tailEnd: %d", val,
					ptsOnTail, adjList.get(tailEnd).size(), tailEnd));
			return ptsOnTail * adjList.get(tailEnd).size();
		} else
			return 0;
	}

	private boolean dfs(int val) {
		boolean isEnd = false;
		if (adjList.containsKey(val) && visited[val] == 0) {
			visited[val] = 1;
			List<Integer> ends = adjList.get(val);
			Collections.sort(ends);

			for (int end : ends) {
				if (end > val) {
					ptsOnTail++;
					isEnd = false;
					if (dfs(end))
						return isEnd;
				} else {
					isEnd = true;

				}

			}
			if (isEnd) {
				ptsOnTail++;
				tailEnd = val;
			}
		}
		return isEnd;
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
