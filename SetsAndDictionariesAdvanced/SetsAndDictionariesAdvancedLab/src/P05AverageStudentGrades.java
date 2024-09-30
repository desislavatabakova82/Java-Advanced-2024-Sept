import java.util.*;

public class P05AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            students.putIfAbsent(name, new ArrayList<>());
            List<Double> grades = students.get(name);
            grades.add(grade);
            students.put(name, grades);
        }
        double sum = 0;
        int count = 0;
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (double grade : entry.getValue()) {
                System.out.printf("%.2f ", grade);
                sum += grade;
                count++;
            }
            System.out.printf("(avg: %.2f)\n", sum / count);
            sum = 0;
            count =0;
        }
    }
}
