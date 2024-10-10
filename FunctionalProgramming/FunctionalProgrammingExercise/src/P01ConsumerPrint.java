import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> name = entry -> System.out.println(entry);
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(name);
    }
}
