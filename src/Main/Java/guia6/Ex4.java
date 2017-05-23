package guia6;

/**
 * Esta clase prove un algoritmo para realizar la suma de dos matrices superiores.
 * @author Nicolas Curat, Bruno De Luca
 */
public class Ex4 implements Exercise4 {

    /**
     * Metodo para realizar la suma de dos matrices superiores ahorrando memoria y operaciones.
     * @param matrixA matrizA a sumar
     * @param matrixB matrizB a sumar
     * @param calculator calculadora para resolver operaciones
     * @return matriz suma entre dos matrices
     */
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
