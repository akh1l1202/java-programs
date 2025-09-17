
import java.util.Scanner;

public class sanima {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ticket[] tickets = new ticket[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter info for film " + (i+1));
            String name = s.nextLine();
            String seat = s.nextLine();
            double price = s.nextDouble();
            s.nextLine();
            
            tickets[i] = new ticket(name, seat, price); 
        }

        for (ticket tick : tickets) {
            tick.printTicket();
        }
    }
    
}

class ticket {
    String mname;
    String sno;
    double price;

    ticket(String name, String seat, double price) {
        this.mname = name;
        this.sno = seat;
        this.price = price;
    }

    void printTicket() {
        System.out.printf("\nMovie Name: %s\nSeat Number: %s\nPrice: %f",mname,sno,price);
    }
}

