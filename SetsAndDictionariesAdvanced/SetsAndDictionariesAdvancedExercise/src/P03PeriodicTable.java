import java.util.*;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> input = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            List<String> currentInput = Arrays.stream(scanner.nextLine().split("\\s+")).toList();
            for (String nameChemical : currentInput) {
                input.add(nameChemical);
            }
        }
        for (String current : input) {
            System.out.print(current + " ");
        }


    }
}
