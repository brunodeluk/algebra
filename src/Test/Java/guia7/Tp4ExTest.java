package guia7;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;


public class Tp4ExTest {


    @Test
    public void exercise1() throws Exception {

        double[][] coeficients = {{1,0,0}, {2,1,0}, {3,4,1}};

        double[] indp = {1, 2, 3};

        Tp4Ex tp4Ex = new Tp4Ex();

        double[] result = tp4Ex.exercise1(coeficients, indp);

        Stream.of(result).map(Arrays::toString).forEach(System.out::println);

    }

    @Test
    public void exercise2() throws Exception {

        double[][] coeficients = {{3,0,0}, {2,4,0}, {3,4,5}};

        double[] indp = {3, 2, 3};

        Tp4Ex tp4Ex = new Tp4Ex();

        double[] result = tp4Ex.exercise2(coeficients, indp);

        Stream.of(result).map(Arrays::toString).forEach(System.out::println);

    }

    @Test
    public void exercise5WithoutPivoteo() throws Exception {
    }

    @Test
    public void exercise5PartialPivoteo() throws Exception {
    }

    @Test
    public void exercise6() throws Exception {
    }

    @Test
    public void exercise7() throws Exception {
    }

    @Test
    public void exercise8() throws Exception {
    }

    @Test
    public void exercise9() throws Exception {
    }

}