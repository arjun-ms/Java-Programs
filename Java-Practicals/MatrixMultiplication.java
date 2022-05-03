
import java.util.*;
class MatrixMultiplication{
    public static void main(String[] args) {
        int i,j,k,sum=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter r1 and c1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        
        System.out.println("Enter r2 and c2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        
        if(c1!=r2){
			System.out.println("Can't Multiply!");
		}
		
        else{
            int c[][] = new int[r1][c2];
            System.out.println("Enter elements of Matrix1: ");
            for(i=0;i<r1;i++)
                for(j=0;j<c1;j++)
                    a[i][j] = sc.nextInt();
                    
            System.out.println("Enter elements of Matrix2: ");
            for(i=0;i<r2;i++)
                for(j=0;j<c2;j++)
                    b[i][j] = sc.nextInt();
             
            // calculation
            for(i=0;i<r1;i++){
                for(j=0;j<c2;j++){
                    for(k=0;k<r2;k++){
                        sum += a[i][k]*b[k][j];
                    }
                c[i][j] = sum;
                sum=0;
                }
            }
            
            //Printing Multiplied matrix
            
            System.out.println("After Multiplication");
            for(i=0;i<r1;i++){
                for(j=0;j<c2;j++){
                    System.out.print(" "+c[i][j]);
                }
                System.out.println();
            }
        }
            
    }
}
