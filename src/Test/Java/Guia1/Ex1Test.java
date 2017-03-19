package Guia1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex1Test extends Ex1 {

    Ex1 e = new Ex1();

    @Test
    public void sumA() throws Exception {
        int a = 10;
        int result = e.sumA(a);
        assertEquals(result, 55);

        a = 20;
        result = e.sumA(a);
        assertEquals(result, 210);
    }

    @Test
    public void sumAR() throws Exception {
        int a = 10;
        int result = e.sumAR(a);
        assertEquals(result, 55);

        a = 20;
        result = e.sumAR(a);
        assertEquals(result, 210);
    }

    @Test
    public void sumB() throws Exception {
        int a = 10;
        int result = e.sumB(a);
        assertEquals(result, 385);

        a = 20;
        result = e.sumB(a);
        assertEquals(result, 2870);
    }

    @Test
    public void sumBR() throws Exception {
        int a = 10;
        int result = e.sumBR(a);
        assertEquals(result, 385);

        a = 20;
        result = e.sumBR(a);
        assertEquals(result, 2870);
    }

    @Test
    public void sumC() throws Exception {
        int a = 5;
        int result = e.sumC(2,a);
        assertEquals(result, 63);
    }

    @Test
    public void sumCR() throws Exception {
        int a = 5;
        int result = e.sumCR(2,a);
        assertEquals(result, 63);
    }

    @Test
    public void sumD() throws Exception {
        int a = 5;
        int result = e.sumD(a);
        assertEquals(result, 25);

        a = 10;
        result = e.sumD(a);
        assertEquals(result, 100);
    }

    @Test
    public void sumDR() throws Exception {
        int a = 5;
        int result = e.sumDR(a);
        assertEquals(result, 25);

        a = 10;
        result = e.sumDR(a);
        assertEquals(result, 100);
    }

    @Test
    public void sumE() throws Exception {
        int a = 6;
        int result = e.sumE(a);
        assertEquals(result, 112);
    }

    @Test
    public void sumER() throws Exception {
        int a = 6;
        int result = e.sumER(a);
        assertEquals(result, 112);
    }

    @Test
    public void sumF() throws Exception {
        int a = 5;
        int result = e.sumF(a);
        assertEquals(result, 225);
    }

    @Test
    public void sumFR() throws Exception {
        int a = 5;
        int result = e.sumFR(a);
        assertEquals(result, 225);
    }

}