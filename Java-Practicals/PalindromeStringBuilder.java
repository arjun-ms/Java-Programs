
import java.util.*;
public class PalindromeStringBuilder{
	public static void main(String args[]){
		String str;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String rev = sb.toString();
		
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
				

