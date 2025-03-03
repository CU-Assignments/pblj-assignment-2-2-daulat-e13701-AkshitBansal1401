import java.util.*;

public class AutoboxingExample {
    public static int sumOfIntegers(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {  // Unboxing happens here
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); // Autoboxing happens here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();
        
        String[] inputs = input.split(" ");
        for (String numStr : inputs) {
            numbers.add(Integer.parseInt(numStr)); // Parsing string to Integer
        }
        
        System.out.println("Sum: " + sumOfIntegers(numbers));
    }
}
