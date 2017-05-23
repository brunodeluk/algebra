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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j) sum += calculator.sum(sum, matrix[i][j]);
            }
        }
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i+j == matrix.length-1) sum += calculator.sum(sum, matrix[i][j]);
            }
        }
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
        if(matrix[0].length == vector.length){
            double[] result = new double[vector.length];
            for (int i = 0; i < matrix[0].length; i++) {
                double aux = 0;
                for (int j = 0; j < matrix.length; j++) {
                    aux += calculator.sum(aux, calculator.multiplication(matrix[i][j], vector[j]));
                }
                result[i] = aux;
            }
            return result;
        }
        throw new RuntimeException("Length of columns in matrix and the length in vector must be the same!");
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
}
