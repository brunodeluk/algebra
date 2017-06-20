package Guia6Practica;

/**
 * Created by brunodeluca on 6/16/17.
 */
public class Ex1 implements Exercise1{


    @Override
    public double exerciseA(double[][] matrix, Calculator calculator) {
        int row = matrix.length;
        int col = matrix[0].length;

        if(row != col) throw new IllegalArgumentException("Matrix is not squared");

        double result = 0;

        for(int i = 0; i < row; i++) result = calculator.sum(matrix[i][i], result);

        return result;

    }

    @Override
    public double exerciseB(double[][] matrix, Calculator calculator) {
        int row = matrix.length;
        int col = matrix[0].length;

        if(row != col) throw new IllegalArgumentException("Matrix is not squared");

        double result = 0;

        for(int i = row - 1; i >= 0; i--) result = calculator.sum(matrix[i][i], result);

        return result;
    }

    @Override
    public double[] exerciseC(double[][] matrix, Calculator calculator) {
        int row = matrix.length;
        int col = matrix[0].length;

        if(row != col) throw new IllegalArgumentException("Matrix is not squared");

        double[] result = new double[row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[i] = calculator.sum(matrix[i][j], result[i]);
            }
        }

        return result;
    }

    //ESTA MAL
    //ESTA MAL
    //ESTA MAL
    //ESTA MAL
    //ESTA MAL
    //ESTA MAL
    //ESTA MAL
    //ESTA MAL


    @Override
    public double[] exerciseD(double[][] matrix, double[] vector, Calculator calculator) {
        int row = matrix.length;
        int col = matrix[0].length;

        int vectorLength = vector.length;

        if(vectorLength != row) throw new IllegalArgumentException("Matrices dimensions are not accepted");

        double[] result = new double[row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[i] = calculator.sum(matrix[i][j], result[i]);
            }
        }

        return result;
    }

    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;

        if((colA != colB) && (rowA != rowB)) throw new IllegalArgumentException("Matrices dimensions are not accepted");

        double[][] result = new double[rowA][colB];

        for(int i = 0; i < rowA; i++){
            for(int j = 0; j < colB; j++){
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }

        return result;
    }

    @Override
    public double[][] exerciseF(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;

        if(colA != rowB) throw new IllegalArgumentException("Matrices dimensions are not accepted");

        double[][] result = new double[rowA][colB];

        for(int i = 0; i < rowA; i++){
            for(int j = 0; j < colB; j++){
                for(int k = 0; k < colA; k++){
                    result[i][j] += calculator.multiplication(matrixA[i][k], matrixB[k][j]);
                }
            }
        }

        return result;
    }

    @Override
    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        int row = matrix.length;
        int col = matrix.length;

        double[][] result = new double[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
