import java.util.*;

public class P04CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> ordered = new TreeMap<>();
        String input = (scanner.nextLine());
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            ordered.putIfAbsent(current, 0);
            ordered.put(current, ordered.get(current) + 1);
        }
        for (Map.Entry<Character, Integer> entry : ordered.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }
    }
}
