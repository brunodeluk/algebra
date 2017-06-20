package Guia6Practica;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brunodeluca on 6/16/17.
 */
public class Ex1Test {

    Ex1 ex1 = new Ex1();
    Calc calc = new Calc();

    @Test
    public void exerciseA() throws Exception {

        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        double result = ex1.exerciseA(matrix, calc);

        assertEquals(15, result, 0);

    }

    @Test
    public void exerciseB() throws Exception {

        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        double result = ex1.exerciseB(matrix, calc);

        assertEquals(15, result, 0);
    }

    @Test
    public void exerciseC() throws Exception {


        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        double[] result = ex1.exerciseC(matrix, calc);

        for(int i = 0; i < result.length; i++) System.out.println(result[i]);
    }

    @Test
    public void exerciseD() throws Exception {
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[] matrixB = {3, 4, 5};

        double[] result = ex1.exerciseD(matrixA, matrixB, calc);

        for(int i = 0; i < result.length; i++) System.out.println(result[i]);
    }

    @Test
    public void exerciseE() throws Exception {
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] matrixB = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        double[][] result = ex1.exerciseE(matrixA, matrixB, calc);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    @Test
    public void exerciseF() throws Exception {
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] matrixB = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        double[][] result = ex1.exerciseF(matrixA, matrixB, calc);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void exerciseG() throws Exception {
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        double[][] result = ex1.exerciseG(matrixA, calc);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    @Test
    public void main() throws Exception {
    }

    private class Calc implements Calculator{

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
            return a*b;
        }

        @Override
        public double division(double a, double b) {
            return a / b;
        }
    }

}