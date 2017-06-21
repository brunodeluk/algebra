package Guia6Practica;

/**
 * Created by brunodeluca on 6/20/17.
 */
public class PracticaParcial {



    public double[] gauss(double[][] matrix, double[] coefficients){

        int row = matrix.length;
        int col = matrix[0].length;
        int coefficientsLength = coefficients.length;

        double[][] merge = mergeArrays(matrix, coefficients);

        for(int i = 0; i < merge.length - 1; i++){
            for(int j = 0; j < merge.length - 1 - i; j++){
                double b = merge[i][i];
                double b1 = merge[i + 1 + j][i];
                for(int k = i; k < merge[0].length; k++){
                    merge[i + 1 + j][k] =  merge[j + i + 1][k]*b - merge[i][k]*b1;
                }
            }
            normalize(merge, i);
        }

        normalize(merge, merge.length - 1);

        double[] result = solveGauss(merge);

        return result;

    }

    public double[][] normalize(double[][] matrix, int position){
        for(int i = position; i < matrix[0].length; i++){
            matrix[position][i] /= matrix[position][position];
        }
        return matrix;
    }

    public double[][] mergeArrays(double[][] matrix, double[] vector){
        double[][] result = new double[matrix.length][matrix[0].length + 1];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                result[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i < vector.length; i++){
            result[i][result[0].length - 1] = vector[i];
        }

        return result;
    }

    public double[] solveGauss(double[][] gauss){
        double[] result = new double[gauss.length];

        for(int i = 0; i < result.length; i++){
            result[i] = gauss[i][gauss[0].length - 1];
        }

//        for(int i = gauss.length; i > 0; i--){
//            for(int j = gauss[0].length - 1; j > i + 1; j--){
//                result[i] -= gauss[i][j]*result[i];
//            }
//
//        }

        return result;
    }

    public static void main(String[] args) {
        PracticaParcial practicaParcial = new PracticaParcial();
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 10}};
        double[] vector = {1, 2, 3};
        double[] result = practicaParcial.gauss(matrix, vector);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

}
