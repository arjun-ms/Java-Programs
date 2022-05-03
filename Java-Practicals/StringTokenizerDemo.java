import java.util.*;

class StringTokenizerDemo{
		public static void main(String args[]){
			int sum=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a integers with a gap: ");
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s," ");
			while(st.hasMoreTokens()){
				String temp = st.nextToken();
				int num = Integer.parseInt(temp);
				System.out.println(num);
				sum += num;
			}
			System.out.println("Sum of integers: "+sum);
			sc.close();
		}
}
