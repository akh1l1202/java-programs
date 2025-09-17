import java.util.Vector;

public class Vec{
    public static void main(String[] args) {
        // Create a Vector of Integers
        Vector<Integer> numbers = new Vector<>(20);

        System.out.println("Vector elements: " + numbers);
        System.out.println("Capacity of vector"+numbers.capacity());

        // Add elements
       numbers.add(10);
        numbers.add(20);
        System.out.println(numbers.getClass().getSimpleName());
        System.out.println("Size of vector: " + numbers.size());
        System.out.println("Capacity of vector"+numbers.capacity());
        numbers.trimToSize(); // Trims the capacity to 2

        System.out.println("Size of vector: " + numbers.size());
        System.out.println("Capacity of vector"+numbers.capacity());

        numbers.add(30);
        numbers.add(40);
       
        System.out.println("Size of vector: " + numbers.size());
        System.out.println("Capacity of vector"+numbers.capacity());
        System.out.println("Vector elements: " + numbers);

        // Access element
        System.out.println("First element: " + numbers.get(0));

        // Update element
        numbers.set(1, 25);
        System.out.println("After update: " + numbers);

        // Remove element
        numbers.remove(2);
        System.out.println("After removing index 2: " + numbers);

        // Size of Vector
        System.out.println("Size of vector: " + numbers.size());


      numbers.add(100);
      System.out.println("Size of vector: " + numbers.size());
    }

}