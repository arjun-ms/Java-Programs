import java.util.Scanner;

public class PerfectNumber{
	public static void main(String args[]){
			int n,rem,sum=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a num: ");
			n = sc.nextInt();
			int temp = n;
			for(int i=1;i<=n/2;i++){
					rem = n%i;
					if(rem == 0)
						sum += i;
			}
			if(sum == temp)	
				System.out.println("Perfect Number!");
			else
				System.out.println("Not Perfect Number!");
	}
}
