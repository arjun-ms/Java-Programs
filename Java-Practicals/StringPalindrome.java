
import java.util.*;
public class StringPalindrome{
	public static void main(String args[]){
		String str;
		int len,i;
		char ch;
		boolean flag=true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		len = str.length();
		String rev = "";
		
		for(i=len-1;i>=0;i--){
			ch = str.charAt(i);
			rev += ch;
		}
		
		for(i=0;i<len;i++){
			if(str.charAt(i) != rev.charAt(i)){
				System.out.println("working");
				flag=false;
			}
		}
		if(flag==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
				
