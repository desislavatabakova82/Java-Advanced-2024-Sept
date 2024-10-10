import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Function<Integer[], Integer> findSmallestNumber = arr -> {
            int smallestNumber = Integer.MAX_VALUE;
            for (Integer number:arr) {

            }
            return smallestNumber;
        };
    }
}
