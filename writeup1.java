import java.util.* ;

public class writeup1 {

    static int gcd(int a, int b) {
       if (a % b == 0) {
        return b;
       }
       else {
        return gcd(b, a%b);                                                 
       }
    }

    static int lcm(int a, int b) {
        int gcdd = gcd(a,b);
        
        return (a*b)/gcdd;
    }

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    int a = s.nextInt();
    System.out.print("Enter number 2: ");
    int b = s.nextInt();
    s.close();
    System.out.printf("HCF is: %d\nLCM is: %d",gcd(a,b),lcm(a,b));
}
}