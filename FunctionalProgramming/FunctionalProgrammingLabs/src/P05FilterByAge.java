import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> peopleAge = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            peopleAge.put(name, age);
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String requirement = scanner.nextLine();
        Predicate<Integer> agePredicate = null;
        if (condition.equals("younger")) {
            agePredicate = individualAge -> individualAge <= age;
        } else if (condition.equals("older")) {
            agePredicate = individualAge -> individualAge >= age;
        }
        Consumer<Map.Entry<String, Integer>> print;
        if (requirement.equals("name")) {
            print = entry -> System.out.println(entry.getKey());
        } else if (requirement.equals("age")) {
            print = entry -> System.out.println(entry.getValue());
        } else {
            print = entry -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : peopleAge.entrySet()) {
            if (agePredicate.test(entry.getValue())) {
                print.accept(entry);
            }
        }
    }
}

