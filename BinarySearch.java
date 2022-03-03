import java.util.Scanner;
public class BinarySearch {
    public static void main(String args[])
    {
        int i,j,item,flag=0,mid=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int arr[]=  new int[n];
        System.out.println("Enter a sorted array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the item to be searched: ");
        item = sc.nextInt();
        int beg = 0;
        int end = n-1;
        
        while(beg <= end){
            mid = (beg+end)/2;
            if(arr[mid] == item){
                flag = 1;
                break;
            }
            else if(item < arr[mid]){
                end = mid-1;
            }
            else{
                beg = mid+1;
            }
        }
        if(flag == 1){
            System.out.println("Item found at index: "+mid);
        }
        else{
            System.out.println("Item not found");
        }

    }
}
