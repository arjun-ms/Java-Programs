import NewPackage.*;
import java.util.Scanner;
public class Parity {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        NewClass nc = new NewClass();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String s = nc.parityCheck(num);
        System.out.println(s);
    }
}
