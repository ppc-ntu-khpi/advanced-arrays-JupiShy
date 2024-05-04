import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Клас, що заповнює матрицю розміру визначеного користувачем,
 * випадковими значеннями від 0 до 9 включно,
 * та визначає суму всіх елементів цієї матриці.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть кількість рядків (N): ");
        int n = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (M): ");
        int m = scanner.nextInt();
        scanner.close();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));

        int matrixElemSum = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();

        
        System.out.println("Сума елементів матриці: " + matrixElemSum);
    }
}
