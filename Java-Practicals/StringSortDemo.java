
import java.util.*;
public class StringSortDemo{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			String str[] = new String[3];
			System.out.println("Enter 3 strings: ");
			for(int i=0;i<3;i++)
				str[i] = sc.next();
			Arrays.sort(str);
			for(String x:str){
				System.out.println(x);
			}
		}
}

