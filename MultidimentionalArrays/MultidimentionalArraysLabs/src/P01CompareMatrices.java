import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrixA = new int[rows][cols];
        //pulnim matrixA
        fillMatrixA(matrixA, scanner);

        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrixB = new int[rows2][cols2];
        //pulnim matrixB
        fillMatrixB(matrixB, scanner);
        boolean isEqual = isEqual(matrixA, matrixB);
        if (isEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


        System.out.println();
    }

    private static void fillMatrixA(int[][] matrixA, Scanner scanner) {
        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                matrixA[row][col] = scanner.nextInt();
            }
        }
    }

    private static void fillMatrixB(int[][] matrixB, Scanner scanner) {
        for (int row = 0; row < matrixB.length; row++) {
            for (int col = 0; col < matrixB[row].length; col++) {
                matrixB[row][col] = scanner.nextInt();
            }
        }

    }

    private static boolean isEqual(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            return false;
        }
        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                if (matrixA[row][col] != matrixB[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }
}
