import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, scanner);

        int maxSum = 0;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col < matrix[row].length-1; col++) {
                int sumOfMatrix = (matrix[row][col]+matrix[row][col+1]+matrix[row+1][col]+matrix[row+1][col+1]);
                if(sumOfMatrix>maxSum){
                    maxSum=sumOfMatrix;
                    startRow=row;
                    startCol=col;

                }
            }
        }
        System.out.println(matrix[startRow][startCol] +" "+matrix[startRow][startCol+1]);
        System.out.println(matrix[startRow+1][startCol] +" "+matrix[startRow+1][startCol+1]);
        System.out.println(maxSum);


    }
    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int rows = 0; rows < matrix.length; rows++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[rows] = currentRow;
        }
    }
}
