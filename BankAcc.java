import java.util.Scanner;

public class BankAcc {
    String name,accno,acctype;
    Double balance;

    // default constructor
    BankAcc(){
        name = "Arjun";
        accno = "1324564849";
        acctype = "Savings";
        balance = 10000000.5;
    }

    // methods
    public void printInfo(){
        System.out.println("Name:" +name);
        System.out.println("Accno:" +accno);
        System.out.println("Acctype:" +acctype);
        System.out.println("Balance:" +balance);
    }

    public void deposit(int amt){
        balance += amt;
        System.out.println(amt+" succesfully deposited");
        System.out.println("Balance after depositing: "+balance);
    }

    public void withdraw(int amt){
        balance -= amt;
        System.out.println(amt+" succesfully withdrawn");
        System.out.println("Balance after withdrawing: "+balance);
    }

    void balance(){
        System.out.println("Current Balance: "+balance);
    }

    // Main fn
    public static void main(String[] args){
        int choice,amt;
        boolean status = true;

        BankAcc user = new BankAcc();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the main menu");
        System.out.println("-------------------------");
        System.out.println("\n1. Acccount Info \t 2. Check Balance \t 3. Withdraw \t 4.Deposit");

        while(status == true){
            System.out.println("\nEnter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    user.printInfo();
                    break;
                case 2:
                    user.balance();
                    break;
                case 3:
                    System.out.println("\nEnter the amount to be withdraw: ");
                    amt = sc.nextInt();
                    user.withdraw(amt);
                    break;
                case 4:
                    System.out.println("\nEnter the amount to deposit: ");
                    amt = sc.nextInt();
                    user.deposit(amt);
                    break;
                default:
                    System.out.println("Enter a valid Input");
                    break;
            }
        }


    }
}

