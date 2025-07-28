import java.util.Scanner;

public class writeup1c {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = s.nextInt();
        System.out.print("Enter number 2: ");
        int b = s.nextInt();
        s.close();

        writeup1 obj = new writeup1();
        int gcd = obj.gcd(a, b);
        int lcm = obj.lcm(a, b);

        

        System.out.printf("HCF is: %d\nLCM is: %d",gcd,lcm);
        }
}

class writeup1 {

    public int gcd(int a, int b) {
       if (a % b == 0) {
        return b;
       }
       else {
        return gcd(b, a%b);                                                 
       }
    }

    public int lcm(int a, int b) {
        int gcdd = gcd(a,b);
        
        return (a*b)/gcdd;
    }
}