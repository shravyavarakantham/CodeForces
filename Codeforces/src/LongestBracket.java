import java.util.Scanner;
import java.util.Stack;

public class LongestBracket implements Runnable {
	Scanner s = new Scanner(System.in);

	String str;
	int longest = 0, count = 0;

	private void read() {
		str = s.next();
	}

	private boolean solve() {
		int counter = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				if(counter<0){
					// reset counter to start sequence
					counter=0;
				}
				counter++;
				if(counter>longest){
					longest = counter;
				}
			}
			else {
				// )
				counter--;
				// check if it finished a sequence
				// increment the sequence counter
				if(counter==0){
					count++;
				}
			}
		}		
		if(longest!=0)
			return true;
		else return false;
	}

	private void write() {
		print(2*longest + " " + count);
	}

	void print(String toPrint) {
		System.out.println(toPrint);
	}

	public void run() {
		read();
		if (solve()) {
			write();
		} else {
			print(0 + " " + 1);
		}

		s.close();

	}

	public static void main(String args[]) {
		new Thread(new LongestBracket()).start();
	}

}
