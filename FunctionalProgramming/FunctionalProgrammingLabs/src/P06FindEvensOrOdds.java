import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] range = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int startPoint = range[0];
        int endPoint = range[1];
        String condition = scanner.nextLine();
        if (condition.equals("even")) {
            printResult(startPoint, endPoint, i -> i % 2 == 0);
        } else {
            printResult(startPoint, endPoint, i -> i % 2 != 0);
        }
        //printResult()
        //
    }

    private static void printResult(int startPoint, int endPoint, Predicate<Integer> condition) {
        for (int i = startPoint; i <= endPoint; i++) {
            if (condition.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

