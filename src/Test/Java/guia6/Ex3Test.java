package guia6;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by brunodeluca on 5/22/17.
 */
public class Ex3Test {
    @Test
    public void exerciseAI() throws Exception {
        double[] a = {1,2,3};

        double[][] b = {{1,2,3}, {4,5,6}, {7,8,9}};

        Ex3 ex3 = new Ex3();

        double[] x = ex3.exerciseAI(b, a, new Calculator() {
            @Override
            public double sum(double a, double b) {
                return 0;
            }

            @Override
            public double subtraction(double a, double b) {
                return 0;
            }

            @Override
            public double multiplication(double a, double b) {
                return a * b;
            }

            @Override
            public double division(double a, double b) {
                return 0;
            }
        });

        Stream.of(x).map(Arrays::toString).forEach(System.out::println);
    }

    @Test
    public void exerciseAII() throws Exception {
    }

    @Test
    public void exerciseAIII() throws Exception {
    }

    @Test
    public void exerciseBI() throws Exception {
    }

    @Test
    public void exerciseBII() throws Exception {
    }

    @Test
    public void exerciseBIII() throws Exception {
    }

    @Test
    public void exerciseCI() throws Exception {
    }

    @Test
    public void exerciseCII() throws Exception {
    }

    @Test
    public void exerciseCIII() throws Exception {
    }

    @Test
    public void exerciseDI() throws Exception {
    }

    @Test
    public void exerciseDII() throws Exception {
    }

    @Test
    public void exerciseDIII() throws Exception {
    }

    @Test
    public void exerciseE() throws Exception {
    }

}