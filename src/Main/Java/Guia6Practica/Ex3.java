package Guia6Practica;

/**
 * Created by brunodeluca on 6/16/17.
 */
public class Ex3 implements Exercise3{
    @Override
    public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int vectorLenght = vectorX.length;

        if(rowA != vectorLenght) throw new IllegalArgumentException();

        double[] result = new double[vectorLenght];

        for(int i = 0; i < vectorLenght; i++){
            for(int j = i; j < colA; j++){
                result[i] += calculator.multiplication(matrixA[i][j], vectorX[j]);
            }
        }

        return result;
    }

    @Override
    public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;

        if(rowA != colB) throw new IllegalArgumentException();

        double[][] result = new double[rowA][rowA];

        for(int i = 0; i < rowA; i++){
            for(int j = i; j < colA; j++){
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }

        return result;
    }

    @Override
    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int colB = matrixB[0].length;

        if(rowA != colB) throw new IllegalArgumentException();

        double[][] result = new double[rowA][rowA];

        for(int i = 0; i < colA; i++){
            for(int j = i; j < colA; j++){
                for(int k = i; k <= j; k++){
                    result[i][j] += calculator.multiplication(matrixA[i][k], matrixB[k][j]);
                }
            }
        }

        return result;
    }

    @Override
    public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int vectorLenght = vectorX.length;

        if(rowA != vectorLenght) throw new IllegalArgumentException();

        double[] result = new double[vectorLenght];

        for(int i = 0; i < vectorLenght; i++){
            for(int j = i; j < colA; j++){
                result[i] += calculator.multiplication(matrixA[i][j], vectorX[j]);
            }
        }

        return result;
    }

    @Override
    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;

        if(rowA != colB) throw new IllegalArgumentException();

        double[][] result = new double[rowA][rowA];

        for(int i = 0; i < rowA; i++){
            for(int j = i; j < colA; j++){
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }

        return result;
    }

    @Override
    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int colB = matrixB[0].length;

        if(rowA != colB) throw new IllegalArgumentException();

        double[][] result = new double[rowA][rowA];

        for(int i = 0; i < colA; i++){
            for(int j = i; j < colA; j++){
                for(int k = i; k <= j; k++){
                    result[i][j] += calculator.multiplication(matrixA[i][k], matrixB[k][j]);
                }
            }
        }

        return result;
    }

    @Override
    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }
}
