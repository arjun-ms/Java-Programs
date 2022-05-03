import java.io.*;
import java.lang.*;

public class FactBufferedReader{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a num: ");
		int num = Integer.parseInt(br.readLine());
		int fact =1;
		for(int i=1;i<=num;i++){
			fact *=i; 
		}
		System.out.println("Factorial: "+fact);
	
	}
}
