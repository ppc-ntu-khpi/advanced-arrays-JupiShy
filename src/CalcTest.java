/**
 * Клас для перевірки правильності обрахунку суми в методі calcMatrixSum
 */
public class CalcTest {
    /**
     * Простий метод для перевірки роботи методу calcMatrixSum з класу CalcMatrix.
     */
    public static void testCalcMatrixSum() {
        int[][] matrix = { { 1, 2, 3 },
                { 1, 2, 3 } };

        if (CalcMatrix.calcMatrixSum(matrix) == 12) {
            System.out.println("Клас працює вірно");
        }
    }

}
