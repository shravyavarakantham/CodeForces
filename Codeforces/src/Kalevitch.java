import java.util.ArrayList;
import java.util.Scanner;


public class Kalevitch implements Runnable{

	Scanner s = new Scanner(System.in);
	int i,j;
	ArrayList<ArrayList<Character>> arr =new ArrayList<>();
	boolean[][] mark;
	int count=0;
	
	void read() {
		while(s.hasNext()) {
			String rowString = s.nextLine();
			ArrayList<Character> row = new ArrayList<>();
			for(int i=0;i<rowString.length();i++) {
				row.add(rowString.charAt(i));
			}
			arr.add(row);
		}
		mark = new boolean[arr.size()][arr.get(0).size()];
		System.out.println(arr);
	}
	
	private boolean rightIsB() {
		if(++j<arr.get(0).size()){
			mark[i][j]=true;
			return arr.get(i).get(j)=='B';	
		}
		
		else return false;
	}
	
	void solve(){
		for (int i=0;i<arr.size();i++ ){
			for(int j=0;j<arr.get(0).size();j++) {
				if(arr.get(i).get(j)=='B' && !mark[i][j]){
					while(rightIsB()) {
						
					}
					count++;
				}
				mark[i][j]=true;
			}
		}
		
	}
	
	void write() {
		System.out.println(count);
		
	}
	
	public void run() {
		read();
		solve();
		write();
		s.close();
	}
	
	public static void main(String[] args) {
		new Thread(new Kalevitch()).start();
	}

}
