import java.util.ArrayList;

public class wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // ✅ This works!
        numbers.add(10);  // Java automatically wraps int into Integer
        System.out.print(numbers);

    }
}
