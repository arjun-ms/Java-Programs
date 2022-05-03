import NewPackage.*;
import java.util.Scanner;

public class MyClass{
		public static void main(String args[]){
			int num;
			Scanner sc = new Scanner(System.in);
			NewClass nc = new NewClass();
			System.out.println("Enter a num: ");
			num = sc.nextInt();
			String s = nc.parityCheck(num);
			System.out.println(s);
		}
}
