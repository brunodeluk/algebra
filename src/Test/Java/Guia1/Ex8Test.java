package Guia1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex8Test {

    private Ex8 e = new Ex8();

    @Test
    public void horner() throws Exception {
        float x = 3;
        float[] p = {1,8,5,10};
        float result = e.horner(p,x);
        assertEquals(result, 340, 0);
    }

    @Test
    public void hornerRecursive() throws Exception {
        float x = 3;
        float[] p = {1,8,5,10};
        float result = e.hornerRecursive(p,x);
        assertEquals(result, 340, 0);
    }

}