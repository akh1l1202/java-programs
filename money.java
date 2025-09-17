
import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter interest rate: ");
        double rate = s.nextDouble();



        Bank.setRate(rate);
        Bank[] accounts = new Bank[5];
        for (int i=0; i<5;i++) {
            System.out.println("Enter balance for account"+ (i+1));
            double bal = s.nextDouble();
            accounts[i] = new Bank(bal);
        }

        for (Bank account: accounts) {
            System.out.println("Interest is: " + account.calculateInterest());
        }
        

    }
}

class Bank {
    static double interest;
    double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    static void setRate(double rate) {
        interest = rate;
    }

    double calculateInterest() {
        return balance * interest / 100;
    }
}
