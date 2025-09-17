import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = s.nextDouble();
        System.out.printf("\nThe area of square is: %f", geometry.areaOfSquare(side));

        
    }
    
}
class geometry {
    static double areaOfSquare(double side) {
        return (double) side * side;
    }
    static double areaOfCircle(double radius) {
        double pi = 3.14159;
        return (double) pi * radius * radius;
    }
}
