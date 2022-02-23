import java.util.Scanner;
public class StringReverse2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str,word,rev=" ";
        int i,len;
        System.out.println("Enter a word to reverse:");
        word = sc.next();
        len = word.length();
        // System.out.println(len);
        for(i=len-1;i>=0;i--){
            rev += word.charAt(i);
        }
        System.out.println(rev);
    }
}

