
public class FactCmd{
			public static void main(String args[]){
				int fact = 1;
				int n;
				
				n = Integer.parseInt(args[0]);
				
				for(int i=1;i<=n;i++)
					fact *=i;
					
				System.out.println("Factorial: "+fact);
			}
}
