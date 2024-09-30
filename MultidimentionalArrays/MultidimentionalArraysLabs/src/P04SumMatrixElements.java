import java.util.Arrays;
import java.util.Scanner;

public class P04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, scanner);
        System.out.println(rows);
        System.out.println(cols);
        result(matrix);

    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] currentRow = scanner.nextLine().split(", ");
            int[] currentRowNumbers = Arrays.stream(currentRow).mapToInt(Integer::parseInt).toArray();
            matrix[row] = currentRowNumbers;
        }
    }

    private static void result(int[][] matrix) {
        int result = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                result += matrix[row][col];
            }
        }
        System.out.println(result);
    }
}
