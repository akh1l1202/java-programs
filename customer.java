import java.util.*;

class Account {
    int acc_id;
    String name;
    float balance;

    public Account(int id,String n,float bal) {
        acc_id = id;
        name = n;
        balance = bal;
    }

    void display() {
        System.out.printf("\nAccount ID: %d       Name: %s        Balance: %.2f\n",acc_id,name,balance);
    }
}

public class customer {
    static int count = 0;
    static Account[] accounts;
    static Scanner s = new Scanner(System.in);

    public static void add() {
        if (count < accounts.length) {
            System.out.print("Enter Account ID: ");
            int id = s.nextInt();
            System.out.print("Enter Name: ");
            String name = s.next();
            System.out.print("Enter Balance: ");
            float bal = s.nextFloat();

            accounts[count] = new Account(id, name, bal);
            count++;
        }
        else {
            System.out.println("Account Storage Full");
        }
    }

    public static void displayacc() {
        if (count == 0) {
            System.out.println("No accounts to display.");
        }
        else {
            for (int i=0; i<count; i++) {
                accounts[i].display();
            }
        }
    }

    public static void delete() {
        System.out.print("Enter Account ID to be deleted: ");
        int delID = s.nextInt();
        bool found = false;

        for (int i=0; i<count; i++) {
            if (accounts[i].acc_id == delID) {
                for (int j=)
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of customers: ");
        int n = s.nextInt();

        accounts = new Account[n];

        while (true) {
            System.out.println("\n1. Add Account\n2. Delete Account\n3. Display Accounts\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    break;
                case 3:
                    displayacc();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }

    }

}