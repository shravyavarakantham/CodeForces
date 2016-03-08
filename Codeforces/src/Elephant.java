import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Elephant implements Runnable {
	int n;
	int result;
	Scanner s = new Scanner(System.in);
	
	void read() {
		n= s.nextInt();
	}
	
	void solve()
	{
		List<String> list = new ArrayList<>();
		
		if(n%5==0)
			result = n/5;
		else
			result = (n/5)+1;
	}
	
	void write(){
		System.out.println(result);
	}
	
	public void run(){
		
		read();
		solve();
		write();
		s.close();
	}
	
	
	public static void main(String[] args){
		new Thread(new Elephant()).start();
	}
}
