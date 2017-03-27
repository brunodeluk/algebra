package Guia2;

/**
 * Created by nicurat on 3/27/17.
 */
public class Guia2 implements Practice2 {
    @Override
    public long exercise8(int m, int n) {
        if(m > n) throw new RuntimeException("m value cannot be greater than n value");
        long result = 0;
        for (int i = m; i <= n; i++) {
            result += i;
        }
        return result;
    }

    @Override
    public long exercise9(int m, int n, int r, int s) {
        if(m > n || r > s) throw new RuntimeException("m value cannot be greater tha n value and r value cannot be greater than s value");
        long first = 0;
        long second = 0;
        for (int i = m; i <= n;i++) {
            first += i;
        }
        for (int i = r; i <= s; i++) {
            second += i;
        }
        return first*second;
    }

    @Override
    public long exercise10(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += (i * (Math.pow(2, i)));
        }
        return result;
    }

    @Override
    public double exercise11Sumation(int n, int x) {
        long result = 0;
        for (int i = 0; i <= n; i++) {
            result += (i*Math.pow(x, i));
        }
        return result;
    }

    @Override
    public double exercise11Formula(int n, int x) {
        long numerator = (long)((n*Math.pow(x, n+2)) - ((n+1)*Math.pow(x, n+1)) + x);
        long divisor = (long)(Math.pow(x-1, 2));
        return (numerator/divisor);
    }
}
