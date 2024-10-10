import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P02KnightsOfTheNight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> names = string -> System.out.println("Sir " + string);
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(names);
    }
}
