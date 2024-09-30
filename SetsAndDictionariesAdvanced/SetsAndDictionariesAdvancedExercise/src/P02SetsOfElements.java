import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        Set<Integer> repeatedNumbers = new LinkedHashSet<>();
        Set<Integer> nSet = new LinkedHashSet<>();
        Set<Integer> mSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            int currentN = Integer.parseInt(scanner.nextLine());
            nSet.add(currentN);
        }
        for (int j = 0; j < m; j++) {
            int currentM = Integer.parseInt(scanner.nextLine());
            mSet.add(currentM);
        }
        if (m > n) {
            mSet.retainAll(nSet);
            for (int number : mSet) {
                System.out.print(number + " ");
            }
        } else {
            nSet.retainAll(mSet);
            for (int num : nSet) {
                System.out.print(num + " ");

            }
        }
    }
}
