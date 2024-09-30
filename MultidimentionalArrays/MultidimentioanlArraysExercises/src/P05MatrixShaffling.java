import java.util.Arrays;
import java.util.Scanner;

public class P05MatrixShaffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, scanner);
        String[] command = new String[5];
        command = scanner.nextLine().split(" ");
        printInvalidInput(scanner, command, matrix);

    }


    private static void printInvalidInput(Scanner scanner, String[] command, int[][] matrix) {
        if (command.length > 5 || (!command[0].equals("swap"))) {
            System.out.println("Invalid input!");
            return;
        }
        for (int i = 1; i < command.length; i++) {
            if (!isNumericCommand(command[i])) {
                System.out.println("Invalid input!");
                return;
            }
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (Integer.parseInt(command[i]) != matrix[row][col]) {
                        System.out.println("Invalid input!");
                        return;
                    }

                }
            }
        }
    }

    private static boolean isNumericCommand(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                // int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                matrix[row][col] = scanner.nextInt();

            }
        }
    }
}
