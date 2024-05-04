import java.util.Scanner;

/**
 * Головний клас
 */
public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків (N): ");
        int n = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (M): ");
        int m = scanner.nextInt();
        scanner.close();

        int sumResult = CalcMatrix.calcMatrixSum(CalcMatrix.fillMatrix(n, m));
        System.out.println("Сума елементів матриці: " + sumResult);

        CalcTest.testCalcMatrixSum();
    }
}
