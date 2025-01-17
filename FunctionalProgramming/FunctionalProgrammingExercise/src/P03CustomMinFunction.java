import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Integer[], Integer> findSmallestNumber = arr -> {
            int smallestNumber = Integer.MAX_VALUE;
            for (Integer number : arr) {
                if (smallestNumber < number) {
                    smallestNumber = number;
                }
            }
            return smallestNumber;
        };
        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(findSmallestNumber.apply(numbers));
    }
}
