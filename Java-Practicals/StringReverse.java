import java.util.*;
import java.lang.*;

public class StringReverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("Reverse: "+sb);
	}
}
