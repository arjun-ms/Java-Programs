import java.util.Scanner;

public class Prime{
	public static void main(String args[]){
			int n,flag=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a num: ");
			n = sc.nextInt();
			for(int i=2;i<=n/2;i++){
					if(i%n!=0)
						flag=1;
						break;
			}
			if(flag==1)
				System.out.println("Prime!");
			else
				System.out.println("Not Prime!");

	}
}
