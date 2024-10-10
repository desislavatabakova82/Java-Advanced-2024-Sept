import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class P03CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Predicate<String> uppercaseWords = word -> Character.isUpperCase(word.charAt(0));
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).filter(uppercaseWords).toList();
        System.out.println(words.size());
        words.forEach(word -> System.out.println(word));
    }
}
