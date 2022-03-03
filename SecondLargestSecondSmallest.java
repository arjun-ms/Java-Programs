import java.util.Scanner;
public class SecondLargestSecondSmallest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i,j,temp;
        System.out.println("Enter the length of array : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter unsorted array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // BUBBLE SORT TO MAKE IT IN A ORDER
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // display sorted array
        System.out.println("Sorted arrary: ");
        for(i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("Second Largest: "+arr[n-2]);
        System.out.println("Second Smallest: "+arr[1]);

    }
}
