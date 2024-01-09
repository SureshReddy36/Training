import java.util.Scanner;

public class BankAccount {
    String AccountHolderName;
    String AccountName;
    double balance;

    public BankAccount(String AccountHolderName, String AccountName, double balance) {
        this.AccountHolderName = AccountHolderName;
        this.AccountName = AccountName;
        this.balance = 1000.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }

    public double currentBalance() {
        return balance;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       BankAccount account = new BankAccount("SureshRaina", "25325Asd", 1000.0);
while(true){
        System.out.println("Press 1 for deposit, 2 for withdraw, 3 for Balance enquiry , 4.Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the amount to be deposited");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                System.out.println("The balance after deposit: " + account.currentBalance());
                break;

            case 2:
                System.out.println("Enter the amount to withdraw");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                System.out.println("The balance after withdrawal: " + account.currentBalance());
                break;

            case 3:
                System.out.println("The current balance in your account is " + account.currentBalance());
                break;
			case 4:
			System.exit(0);
			default:
			System.out.println("enter the values from 1 to 4 only");
        }
    }
	}
}
