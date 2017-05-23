package guia6;

/**
 * Created by nicurat on 5/15/17.
 */
public class Ex1 implements Exercise1 {
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

    //matrix.length is for length in columns
    //matrix[0].length is for length of rows in first column

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
