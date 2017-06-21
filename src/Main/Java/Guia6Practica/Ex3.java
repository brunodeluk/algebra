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
        int vectorLength = vectorX.length;

        if(colA != vectorLength) throw new IllegalArgumentException();

        double[] result = new double[vectorLength];

        for(int j = 0; j < colA; j++){
            result[0] += calculator.multiplication(matrixA[0][j], vectorX[j]);
        }

        for(int i = 1; i < vectorLength; i++){
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

        for(int j = 0; j < colA; j++){
            result[0][j] = calculator.sum(matrixA[0][j], matrixB[0][j]);
        }

        for(int i = 1; i < rowA; i++){
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

        for(int j = 0; j < colA; j++){
            for(int k = 0; k <= j; k++){
                result[0][j] += calculator.multiplication(matrixA[0][k], matrixB[k][j]);
            }
        }

        for(int i = 1; i < colA; i++){
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
        int row = matrixA.length;
        int col = matrixA[0].length;
        int vectorLength = vectorX.length;

        if(vectorLength != row) throw new IllegalArgumentException();

        double[] result = new double[vectorLength];

        for(int i = 0; i < row; i++){
            int end;
            int j = 0;
            if(i == 0){
                end = 1;
            }else{
                j = i - 1;
                end = i + 1;
            }
            for(; j <= end; j++){
                if(j >= col) break;
                result[i] += calculator.multiplication(matrixA[i][j], vectorX[j]);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        double[][] matrix = {{1, 2, 0, 0}, {3, 4, 5, 0}, {0, 6, 7, 8}, {0, 0, 9, 10}};
        double[] vector = {1, 2, 3, 4};

        double[][] result = ex3.exerciseCIII(matrix, matrix, new Calculator() {
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

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int rowA = matrixA.length;
        int colA =  matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;

        if((rowA != rowB) && (colA != colB)) throw new IllegalArgumentException();

        double[][] result = new double[rowA][colB];

        for(int i = 0; i < rowA; i++){
            int j = 0;
            int end;
            if(i == 0){
                end = 1;
            }else{
                end = i + 1;
                j = i - 1;
            }
            for(;j <= end; j++){
                if(j >= colB) break;
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }

        return result;
    }

    @Override
    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int rowA = matrixA.length;
        int colA =  matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;

        if(colA != rowB) throw new IllegalArgumentException();

        double[][] result = new double[rowA][colA];

        for(int i = 0; i < rowA; i++){
            for(int j = 0; j < colA; j++){

            }
        }

        return result;
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
