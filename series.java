import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        s.close();

        float series_sum = 0;
        for (int i = 1; i <= n; i++) {
            series_sum += 1.0 / i;
            System.out.print("1/" + i);
            if (i != n) {
                System.out.print(" + ");
            }
        }
        System.out.printf(" = %.7f\n", series_sum);
    }
}
