package guia6;

/**
 * Created by nicurat on 5/15/17.
 */
public class Ex4 implements Exercise4 {

    @Override
    public double[][] summation(double[] matrixA, double[] matrixB, Calculator calculator) {
        if(matrixA.length == matrixB.length){
            double[] vector = new double[matrixA.length];
            for (int i = 0; i < matrixA.length; i++) {
                vector[i] = calculator.sum(matrixA[i], matrixB[i]);
            }
            int resultLength = lengthOfMatrix(vector.length, calculator);
            double[][] result = new double[resultLength][resultLength];
            int aux = 0;
            for (int i = 0; i < resultLength; i++) {
                for (int j = 0; j < resultLength; j++) {
                    if(j < i) result[i][j] = 0;
                    else {
                        result[i][j] = vector[aux];
                        aux++;
                    }
                }
            }
            return result;
        }
        throw new RuntimeException("Both vectors must have the same length");
    }

    private int lengthOfMatrix(int arrayLength, Calculator calculator){
        return (int) calculator.division(calculator.sum(-1, Math.sqrt(calculator.sum(1, calculator.multiplication(8, arrayLength)))), 2);
    }
}
