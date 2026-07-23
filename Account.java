public class Account {

    double balance = 10000;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {

        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");

    }

}