import java.util.Scanner;
import java.util.Vector;



public class VecCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Car> carList = new Vector<>();
        int choice;

        do {
            System.out.println("\n==== Car Management System ====");
            System.out.println("1. Add Car");
            System.out.println("2. Search for a Car");
            System.out.println("3. Remove Car");
            System.out.println("4. Display All Cars");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add car
                    System.out.print("Enter car make: ");
                    String make = sc.nextLine();
                    System.out.print("Enter car model: ");
                    String model = sc.nextLine();
                    System.out.print("Enter car year: ");
                    int year = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();

                    carList.add(new Car(make, model, year, desc));
                    System.out.println("Car added successfully!");
                    break;

                case 2: // Search car
                    System.out.print("Enter make or model to search: ");
                    String keyword = sc.nextLine();
                    boolean found = false;

                    for (Car car : carList) {
                        if (car.getMake().equalsIgnoreCase(keyword) ||
                            car.getModel().equalsIgnoreCase(keyword)) {
                            System.out.println("Found: " + car);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Car not found.");
                    }
                    break;

                case 3: // Remove car
                    System.out.print("Enter make or model of car to remove: ");
                    String removeKey = sc.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < carList.size(); i++) {
                        Car car = carList.get(i);
                        if (car.getMake().equalsIgnoreCase(removeKey) ||
                            car.getModel().equalsIgnoreCase(removeKey)) {
                            carList.remove(i);
                            System.out.println("Car removed successfully!");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Car not found.");
                    }
                    break;

                case 4: // Display cars
                    if (carList.isEmpty()) {
                        System.out.println("No cars in the list.");
                    } else {
                        System.out.println("\n--- Car List ---");
                        for (Car car : carList) {
                            System.out.println(car);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

class Car {
    private String make;
    private String model;
    private int year;
    private String description;

    // Constructor
    public Car(String make, String model, int year, String description) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.description = description;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }

    @Override
    public String toString() {
        return "Car: " + make + " " + model + " (" + year + ") - " + description;
    }
}

