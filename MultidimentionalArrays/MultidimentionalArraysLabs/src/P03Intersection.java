import java.util.Scanner;

public class P03Intersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] matrixA = new char[rows][cols];
        filledMatrix(matrixA, scanner);
        char[][] matrixB = new char[rows][cols];
        filledMatrix(matrixB, scanner);
        printResults(matrixA, matrixB);

    }

    private static void filledMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String current = scanner.nextLine().replace(" ", "");
            char[] currentRow = current.toCharArray();
            matrix[row] = currentRow;
        }
    }
    private static void printResults(char[][] matrixA, char[][] matrixB) {
        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                if (matrixA[row][col] == matrixB[row][col]) {
                    System.out.print(matrixA[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
