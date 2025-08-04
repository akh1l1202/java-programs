import java.lang.Math;

public class kaprekar {

    static boolean checkKaprekar(int num) {
        int squared = num * num;
        int copy = squared;

        // for checking number of digits
        int digits = 0;

        while (copy > 0) {
            copy /= 10;
            digits++;
        }
        copy = squared; //for reusing the number
        int squared_sum = 0;

        if (digits % 2 == 0) { //if it is even then two equal parts
            while (copy > 0) {
                squared_sum += copy % (Math.pow(10,(digits/2)));
                copy /= (Math.pow(10,(digits/2)));
            }
        }

        else { // if odd
            while (copy > 0) {
                squared_sum += copy % (Math.pow(10,(digits/2)+1));
                copy /= (Math.pow(10,(digits/2)+1));
            }
        }

        if (squared_sum == num) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
    System.out.println("Printing all kaprekar numbers from 1 to 1000");
    for (int i=1; i<=1000; i++) {
        if (checkKaprekar(i)) {
            System.out.printf("%d ",i);
        }
    }
}
}   



