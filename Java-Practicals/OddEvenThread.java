import java.util.*;

public class OddEvenThread{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a limit: ");
			int limit = sc.nextInt();
			OddRunnable oddthread = new OddRunnable(limit);
			EvenRunnable eventhread  = new EvenRunnable(limit); 
			oddthread.start();
			eventhread.start();
		}
}

class OddRunnable extends Thread{
		int limit;
		
		OddRunnable(int limit){
			this.limit = limit;
		}	
			
		public void run(){
				for(int i=1;i<=limit;i+=2)
					System.out.println("Odd Thread: "+i);
					
				try{
					Thread.sleep(1000);
				}
				catch(Exception e){
				}
		}
}

class EvenRunnable extends Thread{
		int limit;
		
		EvenRunnable(int limit){
			this.limit = limit;
		}	
			
		public void run(){
				for(int i=2;i<=limit;i+=2)
					System.out.println("Even Thread: "+i);
					
					
				try{
					Thread.sleep(1000);
				}
				catch(Exception e){
				}
		}
}
