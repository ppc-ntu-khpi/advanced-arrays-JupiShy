import java.util.Arrays;
import java.util.Random;

/**
 * Клас для обрахунку суми елементів матриці
 */
public class CalcMatrix {

    /**
     * Клас приймає значення розміру масиву, введені користувачем, заповнює випадковими значеннями і виводить матрицю.
     * @param n кількість рядків
     * @param m кількість стовпців
     * @return заповнена матриця заданого розміру
     */
    public static int[][] fillMatrix(int n, int m){

        Random random = new Random();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));

        return matrix;
    }


    /**
     * Клас, що знаходить суму всім елементів матриці
     * @param matrix матриця
     * @return сума всіх елементів матриці
     */
    public static int calcMatrixSum(int[][] matrix){

        int matrixElemSum = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();

        return matrixElemSum;
    }
}
