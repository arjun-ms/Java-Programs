import java.util.Scanner;

public class OddEvenThread {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();
        OddRunnable t1 = new OddRunnable(limit);
        EvenRunnable t2 = new EvenRunnable(limit);

        t1.start();
        t2.start();
    }    
}

class OddRunnable extends Thread{
    int limit;
    OddRunnable(int limit){
        this.limit = limit;
    }
    public void run(){
        for(int even=2;even<limit;even+=2){
            System.out.println("Even Thread: "+even);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

class EvenRunnable extends Thread{
    int limit;
    EvenRunnable(int limit){
        this.limit = limit;
    }
    public void run(){
        for(int odd=1;odd<=limit;odd+=2){
            System.out.println("Odd Thread: "+odd);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}