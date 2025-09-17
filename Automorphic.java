import java.util.Scanner;

public class Automorphic {

    // Method to check automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;

        // Find number of digits in num
        int digits = String.valueOf(num).length();


        // Extract last 'digits' digits from square
        int lastDigits = square % (int)Math.pow(10, digits);

        return lastDigits == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check and display result
        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is NOT an Automorphic number.");
        }

        sc.close();
    }
}


/*Compute square of number → num * num.

Count digits of number → String.valueOf(num).length().

Extract last digits digits of the square → square % (10^digits).

Compare extracted digits with the original number.
 */