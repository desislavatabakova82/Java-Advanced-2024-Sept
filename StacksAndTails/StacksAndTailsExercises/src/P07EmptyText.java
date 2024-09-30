import java.util.*;

public class P07EmptyText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).toList();
            int firstNumber = Integer.parseInt(input.get(0));
            switch (firstNumber) {
                case 1:
                    String appendsString = input.get(1);
                    stack.push(appendsString);
                    break;
                case 2:
                    int count = Integer.parseInt(input.get(1));
                    for (int j = 0; j < count; j++) {
                        stack.pop();
                    }
                    break;
                case 3:
                    int returnIndex = Integer.parseInt(input.get(1));
                    for (int j = 0; j < returnIndex; j++) {
                        System.out.println(stack.peekLast());
                    }

                    break;
                case 4:
                  break;

            }


        }
    }
}
