package guia7;

import guia6.Ex1;
import guia6.Ex3;

import java.util.Arrays;

public class Tp4Ex implements TP4 {

    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {
        double[] results = new double[independentTerms.length];

        int i = 0;
        while(i < results.length){
            for(int j = 0; j < i; j++){
                results[results.length - 1 - i] -= results[results.length - 1 - j]*coefficients[coefficients.length - 1 - i][coefficients.length - 1 - j];
            }
            results[results.length - 1 - i] += independentTerms[independentTerms.length - 1 - i];
            i++;
        }

        return results;
    }

    @Override
    public double[] exercise2(double[][] coefficients, double[] independentTerms) {
        double[] results = new double[independentTerms.length];

        int i = 0;
        while(i < results.length){
            for(int j = 0; j < i; j++){
                results[i] -= results[j]*coefficients[i][j];
            }
            results[i] += independentTerms[i];
            results[i] /= coefficients[i][i];
            i++;
        }

        return results;
    }

    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        double[] result;
        //Descendant Part.
        for (int i = 0; i < coefficients.length; i++) {
            double pivot = coefficients[i][i];
            for (int j = 0; j < coefficients.length; j++) {
                coefficients[i][j] = coefficients[i][j]/pivot; //Me asegura que la diagonal sea 1.
            }
            independentTerms[i] = independentTerms[i]/pivot;
            for (int j = i + 1; j < coefficients.length; j++) {
                double value = coefficients[j][i];
                for (int k = i; k < coefficients.length; k++) {
                    coefficients[j][k] = coefficients[j][k] - (coefficients[i][k]*value);
                }
                independentTerms[j] = independentTerms[j] - (independentTerms[i]*value);
            }
        }
        //Ascendant Part.
        result = exercise1(coefficients, independentTerms);
        return result;
    }

    public static void main(String[] args) {
        Tp4Ex ex = new Tp4Ex();
        double[][] matrixA = {{2.0, 2.0, 4.0}, {2.0, 3.0, 1.0}, {2.0, 4.0, 1.0}};
        double[] vector = {6.0, 1.0, 1.0};
        double[] result5WP = ex.exercise5PartialPivoteo(matrixA, vector);
        System.out.println("Resultado de WP: ");
        System.out.println(Arrays.toString(result5WP));
    }

    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {
        double[] result;
        //Descendant Part.
        for (int i = 0; i < coefficients.length; i++) {
            double pivot = coefficients[i][i];
            coefficients = searchMax(coefficients, i);
            for (int j = 0; j < coefficients.length; j++) {
                coefficients[i][j] = coefficients[i][j]/pivot; //Me asegura que la diagonal sea 1.
            }
            independentTerms[i] = independentTerms[i]/pivot;
            for (int j = i + 1; j < coefficients.length; j++) { //j sera las nuevas filas
                double value = coefficients[j][i];
                for (int k = i; k < coefficients.length; k++) { //k va a determinar las columnas
                    coefficients[j][k] = coefficients[j][k] - (coefficients[i][k]*value);
                }
                independentTerms[j] = independentTerms[j] - (independentTerms[i]*value);
            }
        }
        //Ascendant Part.
        result = exercise1(coefficients, independentTerms);
        return result;
    }

    private double[][] searchMax(double[][] coefficients, int k){
        for (int i = k; i < coefficients.length-1; i++) {
            if(coefficients[i][k] < coefficients[i + 1][k]) {
                for (int j = 0; j < coefficients.length; j++) {
                    coefficients[i][j] = coefficients[i + 1][j];
                }
            }
        }
        return coefficients;
    }

    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exercise8(double[][] coefficients) {
        return new double[0][];
    }

    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    private static class Calc implements guia6.Calculator{
        @Override
        public double sum(double a, double b) {
            return a + b;
        }

        @Override
        public double subtraction(double a, double b) {
            return a - b;
        }

        @Override
        public double multiplication(double a, double b) {
            return a * b;
        }

        @Override
        public double division(double a, double b) {
            return a/b;
        }
    }
}
