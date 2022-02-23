
import java.lang.*;
 
public class StringReverse {
 
    public static void main(String args[])
    {
        StringBuffer sbf = new StringBuffer("Geeksforgeeks!");
        System.out.println("String buffer = " + sbf);
         
        // Here it reverses the string buffer
        sbf.reverse();
        System.out.println("String buffer after reversing = " + sbf);
    }
}
