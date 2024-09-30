import java.util.*;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("")).toList();
        String results = isBalanced(input) ? "YES" : "NO";
        System.out.println(results);

    }

    public static boolean isBalanced(List<String> input) {
        Deque<String> bracketsStack = new ArrayDeque<>();

        for (String currentBracket : input) {
            switch (currentBracket) {
                case "}":
                    if (bracketsStack.isEmpty()) {
                        return false;
                    }
                    if (!bracketsStack.pop().equals("{")) {
                        return false;
                    }
                    break;
                case "]":
                    if (bracketsStack.isEmpty()) {
                        return false;
                    }
                    if (!bracketsStack.pop().equals("[")) {
                        return false;
                    }
                    break;
                case ")":
                    if (bracketsStack.isEmpty()) {
                        return false;
                    }
                    if (!bracketsStack.pop().equals("(")) {
                        return false;
                    }
                    break;
                default:
                    bracketsStack.push(currentBracket);
                    break;
            }
        }
        return bracketsStack.isEmpty();
    }
}
