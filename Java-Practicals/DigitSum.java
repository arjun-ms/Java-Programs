import java.util.*;

public class DigitSum{
	public static int digitSum(int n){
			if(n==0)
				return 0;
			else
				return (n%10)+digitSum(n/10);
	}
	public static void main(String args[]){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		num = sc.nextInt();
		int res = digitSum(num);
		System.out.println("res: "+res);
	}
}
