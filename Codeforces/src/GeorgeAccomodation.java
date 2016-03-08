import java.util.Scanner;


public class GeorgeAccomodation implements Runnable {

	Scanner s = new Scanner(System.in);
	int n;
	
	public void run() {
		read();
		s.close();
	}
	
	private void read() {
		n = s.nextInt();
		int count = 0;
		for(int i=0;i<n;i++){
			int p = s.nextInt();
			int q = s.nextInt();
			if(q-p>=2){
				count++;
			}
		}
		write(count);
	}
	
	public void write(int count){
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new GeorgeAccomodation()).start();
	}

}
