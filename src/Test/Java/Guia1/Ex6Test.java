package Guia1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by brunodeluca on 3/18/17.
 */
public class Ex6Test {

    private Ex6 e = new Ex6();

    @Test
    public void isPrime() throws Exception {
        boolean isPrime = e.isPrime(4);
        assertEquals(isPrime, false);
        isPrime = e.isPrime(5);
        assertEquals(isPrime, true);
        isPrime = e.isPrime(1);
        assertEquals(isPrime, true);
        isPrime = e.isPrime(2);
        assertEquals(isPrime, true);
    }

    @Test
    public void isPrimeRecursive() throws Exception {
        boolean isPrime = e.isPrimeRecursive(4);
        assertEquals(isPrime, false);
        isPrime = e.isPrimeRecursive(5);
        assertEquals(isPrime, true);
        isPrime = e.isPrimeRecursive(1);
        assertEquals(isPrime, true);
        isPrime = e.isPrimeRecursive(2);
        assertEquals(isPrime, true);
    }

    @Test
    public void findPrimeNumber() throws Exception {
        int n = e.findFirstPrimeNumber(14);
        assertEquals(n, 17);
    }

    @Test
    public void findPrimeNumberRecursive() throws Exception {
        int n = e.findFirstPrimeNumberRecursive(14);
        assertEquals(n, 17);
    }

    @Test
    public void countPrimeNumbers() throws Exception {
        int count = e.countPrimeNumbers(15);
        assertEquals(count, 2);
    }

    @Test
    public void countPrimeNumbersRecursive() throws Exception {
        int count = e.countPrimeNumbersRecursive(15);
        assertEquals(count, 2);
    }

    @Test
    public void returnPrimeNumbers() throws Exception {
        int[] n = e.returnPrimeNumbers(15);
        int[] r = {3,5};
        assertTrue(Arrays.equals(r, n));
    }

    @Test
    public void returnPrimeNumbersRecursive() throws Exception {
        int[] n = e.returnPrimeNumbersRecursive(15);
        int[] r = {3,5};
        assertTrue(Arrays.equals(r, n));
    }

}