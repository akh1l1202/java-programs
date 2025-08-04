import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = s.nextInt();
        System.out.print("Enter number 2: ");
        int b = s.nextInt();
        System.out.print("Enter number 3: ");
        int c = s.nextInt();
        s.close();
        
        if (a>b && a>c) {
            System.out.println(a+" is the largest number");
        }
        else if (b>a && b>c) {
            System.out.println(b+" is the largest number");
        }
        else {
            System.out.println(c+" is the largest number");
        }
    }
}
