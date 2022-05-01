
import java.util.Scanner;
public class MatrixMultiplication{
		public static void main(String args[]){
			int r1,c1,r2,c2,sum=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter rows of a[][]: ");
			r1 = sc.nextInt();
			System.out.println("Enter colums of a[][]: ");
			c1 = sc.nextInt();
			System.out.println("Enter rows of b[][]: ");
			r2 = sc.nextInt();
			System.out.println("Enter columns of b[][]: ");
			c2 = sc.nextInt();
			
			int a[][] = new int[r1][c1];
			int b[][] = new int[r2][c2];
			int c[][] = new int[r1][c2];
			
			// matrix 1
			System.out.println("Enter elements for matrix 1: ");
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					a[i][j] = sc.nextInt();
				}
			}
			
			// matrix 2
			System.out.println("Enter elements for matrix 2: ");
			for(int i=0;i<r2;i++){
				for(int j=0;j<c2;j++){
					b[i][j] = sc.nextInt();
				}
			}
			
			// LOGIC
			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					for(int k=0;k<r1;k++){
						sum += a[i][j]*b[i][j];
					}
				c[i][j] = sum;
				sum=0;
				}
			}
			
			// display
			System.out.println("Result: ");
			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					System.out.print(" "+c[i][j]);
				}
				System.out.println();
			}
			
		}
}
