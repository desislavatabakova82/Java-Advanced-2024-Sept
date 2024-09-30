import java.util.Scanner;

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrixA = new int[rows][cols];

        fillMatrix(matrixA, scanner);
        int theNumber = scanner.nextInt();

        boolean isTheNumberFound = false;

        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                if (matrixA[row][col] == theNumber) {
                    System.out.println(row + " " + col);
                    isTheNumberFound = true;

                }
            }
        }
        if (!isTheNumberFound) {
            System.out.println("not found");
        }
    }

    private static void fillMatrix(int[][] matrixA, Scanner scanner) {
        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                matrixA[row][col] = scanner.nextInt();
            }

        }

    }
}
