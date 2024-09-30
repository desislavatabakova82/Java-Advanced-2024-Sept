import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split(", ")).map(numbers -> Integer.parseInt(numbers)).filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(input.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
        Collections.sort(input);
        System.out.println(input.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
    }
}
