package Guia1;

/**
 * Esta clase contiene metodos para resolver sumatorias
 * @author Nicolas Curat, Bruno De Luca
 */

public class Ex2 {

    /**
     * Matodo iterativo para resolver n!
     * @param n valor
     * @return resultado de sumatoria
     */

    public int factorial(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum*i;
        }
        return sum;
    }

    /**
     * Matodo recursivo para resolver n!
     * @param n valor
     * @return resultado de sumatoria
     */

    public int factorialR(int n){
        int sum;
        if(n == 1){
            return 1;
        }
        sum = factorialR(n-1)*n;
        return sum;
    }

    /**
     * Matodo iterativo para resolver 2^n
     * @param n valor
     * @return resultado de sumatoria
     */

    public static long n(int n){
        long result = 1;
        for (int j = 1; j <= n; j++) {
            result = result * 2;
        }
        return result;
    }

    /**
     * Matodo recursivo para resolver 2^n
     * @param n valor
     * @return resultado de sumatoria
     */

    public static long nR(int n){
        long result;
        if(n == 0) return 1;
        result = nR(n-1)*2;
        return result;
    }

    /**
     * Matodo iterativo para resolver la secuencia de fibonacci
     * @param n valor
     * @return resultado de sumatoria
     */

    public static int fibonacci(int n){
        int a = 1;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int result = a + b;
            a = b;
            b = result;
        }
        return a;
    }

    /**
     * Matodo recursivo para resolver la secuencia de fibonacci
     * @param n valor
     * @return resultado de sumatoria
     */

    public static int fibonacciR(int n){
        if(n == 0 || n == 1) return 1;
        return (fibonacciR(n-1) + fibonacciR(n-2));
    }

    /**
     * Aplicacion de la ecuacion de Euclides
     * @param a
     * @param b
     * @return
     */

    public static int mcd(int a, int b){
        if(b == 0) return a;
        int remainder;
        for (int i = 0; i <= b; i--) {
            remainder = a%b;
            a = b;
            b = remainder;
            if(remainder == 0) return a;
        }
        return 1;
    }

    /**
     * Aplicacion de la ecuacion de Euclides
     * @param a
     * @param b
     * @return
     */

    public static int mcdR(int a, int b){
        return (b == 0)? a : mcdR(b, a%b);
    }
}
