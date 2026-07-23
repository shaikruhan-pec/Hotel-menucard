import java.util.Scanner;

public class ATM {

    Scanner sc = new Scanner(System.in);

    User user = new User("Darvesh",1234);

    Account account = new Account();

    Transaction transaction = new Transaction();

    public void start(){

        System.out.println("===== ATM MANAGEMENT SYSTEM =====");

        System.out.print("Enter PIN : ");

        int pin = sc.nextInt();

        if(pin != user.pin){

            System.out.println("Invalid PIN");

            return;
        }

        int choice;

        do{

            System.out.println("\n1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch(choice){

                case 1:

                    System.out.println("Balance : " + account.getBalance());

                    break;

                case 2:

                    System.out.print("Enter Amount : ");

                    double dep = sc.nextDouble();

                    account.deposit(dep);

                    transaction.printReceipt("Deposit",dep,account.getBalance());

                    break;

                case 3:

                    System.out.print("Enter Amount : ");

                    double with = sc.nextDouble();

                    account.withdraw(with);

                    transaction.printReceipt("Withdraw",with,account.getBalance());

                    break;

                case 4:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        }while(choice!=4);

    }

}