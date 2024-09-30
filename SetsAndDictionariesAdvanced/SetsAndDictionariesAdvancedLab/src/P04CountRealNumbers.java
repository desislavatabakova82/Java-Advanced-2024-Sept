import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> grades = new LinkedHashMap<>();
        for (double grade : input) {
            grades.putIfAbsent(grade, 0);
            grades.put(grade, grades.get(grade) + 1);
        }
        for (Map.Entry<Double, Integer> pair : grades.entrySet()) {
            System.out.printf("%.1f -> %d\n", pair.getKey(), pair.getValue());
        }
    }
}
