import java.util.Scanner;

class Vehicle {
    String model;
    String color;
    int year;
    String owner;

    // Parameterized constructor
    Vehicle(String model, String color, int year, String owner) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.owner = owner;
    }

    // Copy constructor for transferring ownership
    Vehicle(Vehicle v, String newOwner) {
        this.model = v.model;
        this.color = v.color;
        this.year = v.year;
        this.owner = newOwner; // Assign new owner
    }

    // Method to display vehicle details
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Owner: " + owner);
    }
}

public class Dealer {
    public static void main(String[] args) {
        // Original vehicle with first owner
        Vehicle[] vehicles = new Vehicle[5];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter info for vehicle: ");
            Scanner s = new Scanner(System.in);
            String model = s.nextLine();
            String colour = s.nextLine();
            int year = s.nextInt();
            s.nextLine();
            String owner = s.nextLine();

            vehicles[i] = new Vehicle(model, colour, year, owner);
        }
        System.out.println("Original Vehicle:");
        vehicles[1].display();

        // Transfer ownership to new owner using copy constructor
        Vehicle vehicle2 = new Vehicle(vehicles[0], "Bob");

        System.out.println("\nVehicle after Transfer of Ownership:");
        vehicle2.display();
    }
}
