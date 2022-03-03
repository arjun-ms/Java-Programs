import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){

        int i,j,temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int arr[]=  new int[n];
        System.out.println("Enter unsorted array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // LOGIC5
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
