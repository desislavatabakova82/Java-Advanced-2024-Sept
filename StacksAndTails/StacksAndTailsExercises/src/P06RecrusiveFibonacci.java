import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P06RecrusiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Long> stack = new ArrayDeque<>();
        stack.push(0L);
        stack.push(1L);
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 2) {
            System.out.println("1");
            return;
        }
        for (int i = 0; i < n; i++) {
            long number1 = stack.pop();
            long number2 = stack.pop();
            stack.push(number1);
            stack.push(number1 + number2);

        }
        System.out.println(stack.peek());
    }
}
