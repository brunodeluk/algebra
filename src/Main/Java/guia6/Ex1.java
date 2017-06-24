package guia6;

/**
 * Esta clase prove metodos para manipular matrices.
 * @author Nicolas Curat, Bruno De Luca
 */

public class Ex1 implements Exercise1 {

    /**
     * Metodo para calcular la suma de la diagonal principal de una matriz cuadrada.
     * @param matrix matriz a usar
     * @param calculator calculadora para resolver operaciones
     * @return valor de suma
     */
    @Override
    public double exerciseA(double[][] matrix, Calculator calculator) {
        double sum = 0;
        for(int i = 0; i < matrix.length; i++) sum += matrix[i][i];
        return sum;
    }

    /**
     * Metodo para calcular la suma de la diagonal secundaria de una matriz cuadrada.
     * @param matrix matriz a usar
     * @param calculator calculadora para resolver operaciones
     * @return valor de suma
     */
    @Override
    public double exerciseB(double[][] matrix, Calculator calculator) {
        double sum = 0;
        for(int i = 0; i < matrix[0].length; i++) sum+= matrix[i][matrix.length - 1 - i];
        return sum;
    }

    /**
     * Metodo para construir un arreglo lineal donde cada elemento es la suma de
     * cada fila de la matriz
     * @param matrix matriz a usar
     * @param calculator calculadora para resolver operaciones
     * @return arreglo lineal
     */
    @Override
    public double[] exerciseC(double[][] matrix, Calculator calculator) {
        if(matrix.length == matrix[0].length) {
            double[] result = new double[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                double sum = 0;
                for (int j = 0; j < matrix.length; j++) {
                    sum = calculator.sum(sum, matrix[i][j]);
                }
                result[i] = sum;
            }
            return result;
        }
        throw new RuntimeException("Must be a square matrix");
    }

    /**
     * Metodo para multiplicar una matriz de n*m y un vector de m elementos
     * @param matrix matriz a usar
     * @param vector vector para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return matriz final
     */
    @Override
    public double[] exerciseD(double[][] matrix, double[] vector, Calculator calculator) {
        int row = matrix.length;
        int col = matrix[0].length;
        int vectorLenght = vector.length;

        if(col != vectorLenght) throw new IllegalArgumentException();

        double[] result = new double[row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[i] += calculator.multiplication(matrix[i][j],vector[j]);
            }
        }

        return result;
    }

    /**
     * Metodo para sumar dos matrices de forma n*m
     * @param matrixA matriz A
     * @param matrixB matriz B
     * @param calculator calculadora para resolver operaciones
     * @return matriz suma
     */
    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length){
            double[][] result = new double[matrixA.length][matrixB[0].length];
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA.length; j++) {
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }
            return result;
        }
        throw new RuntimeException("Must be the same length");
    }

    /**
     * Metodo para construir la matriz producto entre dos matrices.
     * @param matrixA matriz A
     * @param matrixB matriz B
     * @param calculator calculadora para resolver operaciones
     * @return matriz producto entre dos matrices
     */
    @Override
    public double[][] exerciseF(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length == matrixB.length){
            double[][] result = new double[matrixA.length][matrixB[0].length];
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixB[0].length; j++) {
                    for (int k = 0; k < matrixA[0].length; k++) {
                        result[i][j] = calculator.sum(result[i][j],calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                    }
                }
            }
            return result;
        }
        throw new RuntimeException("Column length in Matrix A must be equal to quantity of rows in Matrix B");
    }

    /**
     * Metodo para construir la matriz transpuesta de una matriz dada.
     * @param matrix matriz a modificar
     * @param calculator calculadora para resolver operaciones
     * @return matriz transpuesta
     */
    @Override
    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        double[][] result = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        double[][] d = {{1, 2, 3}, {4, 5, 6}};
        double[] p = {1, 2, 3};
        double[] r = ex1.exerciseD(d, p, new Calculator() {
            @Override
            public double sum(double a, double b) {
                return a + b;
            }

            @Override
            public double subtraction(double a, double b) {
                return 0;
            }

            @Override
            public double multiplication(double a, double b) {
                return a*b;
            }

            @Override
            public double division(double a, double b) {
                return 0;
            }
        });

        for(int i = 0; i < r.length; i++) System.out.println(r[i]);
    }
}
